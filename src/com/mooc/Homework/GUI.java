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

        //设置3*2的网格布局
        GridLayout gridLayout = new GridLayout(3, 2);
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

        JButton jButton = new JButton("将文本区的内容写入文件");

        container.add(jLabel1);
        container.add(jTextField1);

        container.add(jLabel2);
        container.add(jTextField2);

        container.add(jButton);


//        GridBagLayout layout = new GridBagLayout();
//        GridBagConstraints s = new GridBagConstraints();// 定义一个GridBagConstraints，
//        // 是用来控制添加进的组件的显示位置
//        s.fill = GridBagConstraints.BOTH;
//        // 该方法是为了设置如果组件所在的区域比组件本身要大时的显示情况
//        s.gridwidth = 1;// 该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
//        s.weightx = 0;// 该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
//        s.weighty = 0;// 该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
//        layout.setConstraints(jLabel1, s);// 设置组件
//        layout.setConstraints(jTextField1, s);
    }

    public static void main(String[] args) {
        new GUI("文本");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
