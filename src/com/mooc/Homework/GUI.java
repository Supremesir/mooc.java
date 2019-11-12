package com.mooc.Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author HaoFan Fang
 * @date 2019/11/12 16:26
 */

public class GUI extends JFrame implements ActionListener {

    public GUI(String title) {
        JFrame jFrame = new JFrame(title);
        Container container = jFrame.getContentPane();
        JLabel jLabel = new JLabel("Hello World");
        container.add(jLabel);
        jFrame.setVisible(true);//设置窗口可见
        jFrame.setBounds(200,200,300,200); //设置窗口的属性 窗口位置以及窗口的大小
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
    }

    public static void main(String[] args) {
        new GUI("文本");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
