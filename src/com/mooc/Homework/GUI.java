package com.mooc.Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

/**
 * @author HaoFan Fang
 * @date 2019/11/12 16:26
 */

public class GUI extends JFrame implements ActionListener {

    public GUI(String title) {
        JFrame jFrame = new JFrame(title);
        Container container = jFrame.getContentPane();

        GridBagLayout gridLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints= new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        jFrame.setLayout(gridLayout);

        jFrame.setVisible(true);//设置窗口可见
        jFrame.setSize(600,300); //设置窗口的属性 窗口位置以及窗口的大小
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE); //设置关闭方式 如果不设置的话 似乎关闭窗口之后不会退出程序

        JLabel jLabel1 = new JLabel("请输入文件路径和名称:");
        JLabel jLabel2 = new JLabel("请输入需要追加的内容:");

        JTextField jTextField1 = new JTextField();
        jTextField1.setBackground(Color.WHITE);

        JTextField jTextField2 = new JTextField();
        jTextField2.setBackground(Color.WHITE);

        JTextField jTextField3 = new JTextField();
        jTextField3.setBackground(Color.WHITE);

        JButton jButton = new JButton("将文本区的内容写入文件");

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridLayout.setConstraints(jLabel1, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridLayout.setConstraints(jTextField1, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridLayout.setConstraints(jLabel2, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridLayout.setConstraints(jTextField2, gridBagConstraints);


        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0;
        gridLayout.setConstraints(jButton, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridLayout.setConstraints(jTextField3, gridBagConstraints);

        container.add(jLabel1);
        container.add(jTextField1);

        container.add(jLabel2);
        container.add(jTextField2);

        container.add(jButton);

        container.add(jTextField3);
    }

    public static void main(String[] args) {
        new GUI("文本");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
