package com.slovell.fight.tools;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.slovell.fight.main.FightGameLaunch;
import com.slovell.fight.model.Hero;

public class KeyWork implements KeyListener {

    public static boolean pressA = false, pressD = false;
    boolean pressDown = false;

    @Override
    public void keyPressed(KeyEvent ke) {
        // TODO Auto-generated method stub
        int key = ke.getKeyCode();
        switch (key) {

            /**
             * ����esc���˳�*/
            case KeyEvent.VK_ESCAPE:
                FightGameLaunch.getMainFrame().isclose();
                break;

            /**
             * ���¿ո���*/
            case KeyEvent.VK_SPACE:
                Hero.jump = true;
                break;

            /**
             * ��*/
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                pressA = true;
                Hero.left = true;
                Hero.walk = true;
                Hero.right = false;
                break;

            /**
             * ��*/
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                pressD = true;
                Hero.right = true;
                Hero.walk = true;
                Hero.left = false;
                break;

            /**
             * ��סS������*/
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                pressDown = true;
                break;

            /**
             * �����ͷ�һ����*/
            case KeyEvent.VK_K:
                if (Hero.MP_NOW >= Hero.skill0_mp && pressDown) {
                    Hero.skill0_attack = true;
                }
                break;

            /**
             * ����*/
            case KeyEvent.VK_J:
                Hero.attack = true;
                break;

            /**
             * ����*/
            case KeyEvent.VK_0:
                Hero.MP_NOW += 100;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // TODO Auto-generated method stub
        int key = ke.getKeyCode();
        switch (key) {

            /**
             * �ͷſո�*/
            case KeyEvent.VK_SPACE:
                break;

            /**
             * ��*/
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                pressA = false;
                Hero.right = false;
                Hero.walk = false;
                Hero.left = true;
                break;

            /**
             * ��*/
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                pressD = false;
                Hero.left = false;
                Hero.walk = false;
                Hero.right = true;
                break;

            /**
             * �ɿ�S������*/
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                pressDown = false;
                break;
        }
        FightGameLaunch.getMainFrame().repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

}
