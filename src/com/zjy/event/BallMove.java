package com.zjy.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//通过键盘控制小球移动
public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
//监听器，监听键盘
class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);

    }
//监听字符输入
    @Override
    public void keyTyped(KeyEvent e) {

    }
//当某个键按下，会触发
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            y++;

        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }
        this.repaint();

    }
//当某一个键松开会触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}