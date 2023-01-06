package com.zjy.tankgame;

import javax.swing.*;

public class TankGram01 extends JFrame {

    MyPanel mp = null;
    public static void main(String[] args) {
        TankGram01 tankGram01 = new TankGram01();


    }
    public TankGram01(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
