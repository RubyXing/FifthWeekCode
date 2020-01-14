package com.slovell.fight.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFrame;

import com.slovell.fight.model.Hero;
import com.slovell.fight.tools.GameValue;
import com.sun.xml.internal.bind.v2.TODO;

public class PlayPNG extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = -3499834462590506137L;

    //双缓冲方法解决闪烁问题
    Image ImageBuffer = null;
    Graphics img;
    /**
     * 角色图片素材-右站
     */
    public static Image[] stand_right = Hero.jump_right;


    int index = 0;

    public PlayPNG() {
        // TODO Auto-generated constructor stub
        this.setTitle("战斗主窗体");
        this.setBounds((int) (GameValue.WIDTH - GameValue.Width) / 2, (int) (GameValue.HEIGHT - GameValue.Hight) / 2, GameValue.Width, GameValue.Hight);
        this.setLayout(null);
        this.setResizable(false);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }

        });
        this.setVisible(true);
        new refresh(this);
    }

    class refresh extends Thread {
        PlayPNG player;

        public refresh(PlayPNG play) {
            // TODO Auto-generated constructor stub
            player = play;
            this.start();
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (true) {
                for (int i = 0; i < stand_right.length; i++) {
                    index = i;
                    player.repaint();
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
//        super.paint(g);
//        g.drawImage(stand_right[index], 200, 200, this);

        if (ImageBuffer == null) {
            ImageBuffer = createImage(this.getWidth(), this.getHeight());
        }
        img = ImageBuffer.getGraphics();
        super.paint(img);

        img.drawImage(Toolkit.getDefaultToolkit().getImage("img/role/stand-right/stand02.gif"), 100, 100, this);
        img.dispose();
        g.drawImage(ImageBuffer, 0, 0, this);
    }

    public static void main(String[] args) {

        new PlayPNG();
    }
}