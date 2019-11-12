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
        JLabel jLabel1 = new JLabel("请输入文件路径和名称");
        jLabel1.setLocation(10,10);
        jLabel1.setBackground(Color.black);
        JLabel jLabel2 = new JLabel("请输入需要追加的内容");
        jLabel2.setLocation(10,50);
        JTextField jTextField1 = new JTextField();
        jTextField1.setSize(10, 10);
        jTextField1.setLocation(50,10);
        jTextField1.setBackground(Color.BLACK);
        JTextField jTextField2 = new JTextField();
        jTextField2.setSize(10, 10);
        jTextField2.setLocation(50,50);
        jTextField2.setBackground(Color.BLACK);
        container.add(jLabel1);
        container.add(jLabel2);
        container.add(jTextField1);
        container.add(jTextField2);
        jFrame.setVisible(true);//设置窗口可见
        jFrame.setSize(300,200); //设置窗口的属性 窗口位置以及窗口的大小
        jFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序
    }

    public static void main(String[] args) {
        new GUI("文本");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
