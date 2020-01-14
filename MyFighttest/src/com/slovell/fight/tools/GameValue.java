package com.slovell.fight.tools;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

/***
 * ????*/
public class GameValue {
    /**
     * ??????
     */
    public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width,
            HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    /**
     * ????
     */
    public static int Width = 900, Hight = 550;

    public static Image[] bgimgs = {
            Toolkit.getDefaultToolkit().getImage("img/bgimg/factory.gif"),
            Toolkit.getDefaultToolkit().getImage("img/bgimg/fire.gif"),
            Toolkit.getDefaultToolkit().getImage("img/bgimg/home.gif"),
            Toolkit.getDefaultToolkit().getImage("img/bgimg/tree.gif")
    };

    /**
     * ????
     */
    public static Font display_font = new Font("??", Font.PLAIN, 20);

    /**
     * ??????
     */
    public static int Monster_num = 2;

    /**
     * ??????-1?
     */
    public static Image[] monster1_left = {
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/0.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/1.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/2.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/3.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/4.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/5.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/6.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/7.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/8.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/left/9.png")
    };

    /**
     * ??????-1?
     */
    public static Image[] monster1_right = {
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/0.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/1.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/2.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/3.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/4.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/5.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/6.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/7.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/8.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/1/right/9.png")
    };

    /**
     * ??????-2?
     */
    public static Image[] monster2_left = {
            Toolkit.getDefaultToolkit().getImage("img/monster/2/left/0.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/left/1.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/left/2.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/left/3.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/left/4.png")
    };

    /**
     * ??????-2?
     */
    public static Image[] monster2_right = {
            Toolkit.getDefaultToolkit().getImage("img/monster/2/right/0.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/right/1.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/right/2.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/right/3.png"),
            Toolkit.getDefaultToolkit().getImage("img/monster/2/right/4.png")
    };

}