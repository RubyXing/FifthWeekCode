package com.slovell.fight.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JFrame;

import com.slovell.fight.model.Hero;
import com.slovell.fight.model.Monster;
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


    public static int sri = 0, sli = 0, jri = 0, jli = 0, wli = 0, wri = 0,
            ari = 0, ali = 0, s0i = 0;

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

        img.drawImage(GameValue.bgimgs[2], 0, 0, GameValue.Width, GameValue.Hight, this);

        /**
         * 构建主角信息*/
        img.setColor(Color.WHITE);
        img.setFont(GameValue.display_font);
        int x0 = 30, y0 = 70, yh = 20 + 8;
        img.drawString("生命值", x0, y0);
        img.drawString("法术值", x0, y0 + yh);

        /**
         * 分别是生命值和法术值*/
        img.drawRect(x0 * 3 + 8 - 1, y0 - 15 - 1, 150 + 1, 15 + 1);
        img.drawRect(x0 * 3 + 8 - 1, y0 + yh - 15 - 1, 150 + 1, 15 + 1);

        img.setColor(Color.GREEN);
        int hp_width = (int) (((double) (Hero.HP_NOW) / Hero.HP_ALL) * 150);
        img.fillRect(x0 * 3 + 8, y0 - 15, hp_width, 15);

        img.setColor(Color.BLUE);
        int mp_width = (int) (((double) (Hero.MP_NOW) / Hero.MP_ALL) * 150);
        img.fillRect(x0 * 3 + 8, y0 + yh - 15, mp_width, 15);

        img.setColor(Color.WHITE);
        img.drawString(Hero.HP_NOW + "/" + Hero.HP_ALL, x0 * 3 + 8 - 1 + 45, y0);
        img.drawString(Hero.MP_NOW + "/" + Hero.MP_ALL, x0 * 3 + 8 - 1 + 45, y0 + yh);


        /**
         * 如果主角处于被攻击状态*/
        if (Hero.ishurted) {

        }
        /**
         * 主角昏迷了*/
        else if (Hero.isfall) {

        } else {
            /**
             * 构建主角静态动作*/
            if (Hero.left && !Hero.jump && !Hero.walk && !Hero.attack && !Hero.skill0_attack) {
                img.drawImage(Hero.stand_left[sli], Hero.X, Hero.Y, this);
            }

            if (Hero.right && !Hero.jump && !Hero.walk && !Hero.attack && !Hero.skill0_attack) {
                img.drawImage(Hero.stand_right[sri], Hero.X, Hero.Y, this);
            }

            /**
             * 主角跳动作，包含跳击*/
            if (Hero.jump) {
                if (Hero.attack) {
                    if (Hero.left) {
                        img.drawImage(Hero.jump_attack_left[jli], Hero.X, Hero.jumpY, this);
                    }
                    if (Hero.right) {
                        img.drawImage(Hero.jump_attack_right[jri], Hero.X, Hero.jumpY, this);
                    }
                } else {
                    if (Hero.left) {
                        img.drawImage(Hero.jump_left[jli], Hero.X - 7, Hero.jumpY, this);
                    }
                    if (Hero.right) {
                        img.drawImage(Hero.jump_right[jri], Hero.X + 7, Hero.jumpY, this);
                    }
                }
            }

            /**
             * 主角非跳动作，包含行走和普通攻击*/
            else {
                if (Hero.attack) {
                    if (Hero.left) {
                        img.drawImage(Hero.attack_left[ali], Hero.X - 50, Hero.Y, this);
                    }
                    if (Hero.right) {
                        img.drawImage(Hero.attack_right[ari], Hero.X + 50, Hero.Y, this);
                    }
                } else {
                    if (Hero.walk) {
                        if (Hero.left) {
                            img.drawImage(Hero.walk_left[wli], Hero.X, Hero.Y, this);
                        }
                        if (Hero.right) {
                            img.drawImage(Hero.walk_right[wri], Hero.X, Hero.Y, this);
                        }
                    }
                    /**技能释放优先级最低*/
                    else {
                        if (Hero.skill0_attack) {
                            if (Hero.left) {
                                img.drawImage(Hero.skill0_attack_left[s0i], Hero.X - 40, Hero.Y - 75, this);
                            }
                            if (Hero.right) {
                                img.drawImage(Hero.skill0_attack_right[s0i], Hero.X - 10, Hero.Y - 80, this);
                            }
                        }
                    }
                }
            }
        }

        img.dispose();
        g.drawImage(ImageBuffer, 0, 0, this);


//        if (ImageBuffer == null) {
//            ImageBuffer = createImage(this.getWidth(), this.getHeight());
//        }
//        img = ImageBuffer.getGraphics();
//        super.paint(img);
//
//        img.drawImage(Toolkit.getDefaultToolkit().getImage("img/role/stand-right/stand02.gif"), 100, 100, this);
//        img.dispose();
//        g.drawImage(ImageBuffer, 0, 0, this);
    }

    public static void main(String[] args) {

        new PlayPNG();
    }
}