package com.zjy.tankgame2;

import javax.swing.*;

public class TankGram02 extends JFrame {

    MyPanel mp = null;
    public static void main(String[] args) {
        TankGram02 tankGram01 = new TankGram02();


    }
    public TankGram02(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
