//第8章 图形用户界面

package com.mooc.Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Flow;

/**
 * @author HaoFan Fang
 * @date 2019/11/12 16:26
 */

public class GUI extends JFrame implements ActionListener{

    /**
     * 声明需要的组件
     */
    JFrame jFrame = new JFrame();
    Container container = jFrame.getContentPane();
    GridBagLayout gridBagLayout = new GridBagLayout();
    GridBagConstraints gridBagConstraints= new GridBagConstraints();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextArea jTextArea = new JTextArea();
    JButton jButton = new JButton();

    /**
     * 构造窗体界面
     * @param title 主窗体的标题
     */
    public GUI(String title) {

        gridBagConstraints.fill = GridBagConstraints.BOTH;//设置若组件所在的区域比组件本身要大时，使组件完全填满其显示区域。

        jFrame.setTitle(title);
        jFrame.setLayout(gridBagLayout);//采用GridBagLayout布局
        jFrame.setVisible(true);//设置窗口可见
        jFrame.setSize(600,300); //设置窗口初始大小
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE); //设置关闭方式为关闭后退出程序

        //设置标签文字
        jLabel1.setText("请输入文件路径和名称:");
        jLabel2.setText("请输入需要追加的内容:");

        //设置按钮文字和活动监听器
        jButton.setText("将文本区的内容写入文件");
        jButton.addActionListener(this);

        //设置文本框背景颜色
        jTextField1.setBackground(Color.WHITE);
        jTextField2.setBackground(Color.WHITE);
        jTextField2.addActionListener(this);//为jTextField2设置活动监听器
        jTextArea.setBackground(Color.WHITE);

        /**
         * 分别设置每个组件的属性
         * gridwidth:组件水平占用格子数，若为0，该组件为该行最后一个
         * weightx:组件水平拉伸幅度，0为不拉伸，范围0~1
         * weighty:组件垂直拉伸幅度，0为不拉伸，范围0~1
         */
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagLayout.setConstraints(jLabel1, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagLayout.setConstraints(jTextField1, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagLayout.setConstraints(jLabel2, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagLayout.setConstraints(jTextField2, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 0;
        gridBagLayout.setConstraints(jButton, gridBagConstraints);

        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagLayout.setConstraints(jTextArea, gridBagConstraints);

        /**
         * 将组件添加到容器
         */
        container.add(jLabel1);
        container.add(jTextField1);

        container.add(jLabel2);
        container.add(jTextField2);

        container.add(jButton);

        container.add(jTextArea);
    }

    /**
     * 实现actionPerformed方法
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        /**
         * 实现对不同对象的响应
         * 对象为jButton时(点击写文件按钮)，写文件
         * 对象为jTextField2时(输入追加文字后回车)，向jTextArea里追加内容
         */
        if (object == jButton) {
            if (!jTextField1.getText().equals("")) {
                String path = jTextField1.getText();//获取路径
                String text = jTextArea.getText();//获取文本内容
                try {
                    FileWriter fileWriter = new FileWriter(path);
                    fileWriter.write(text);
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                JOptionPane.showMessageDialog(this, "文件写入成功，请查看", "成功", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "路径错误，请重试", "失败", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (object == jTextField2) {
            String text = jTextField2.getText();
            jTextArea.append("\n" + text);
        }
    }

    /**
     * 主方法，实例化GUI方法
     * @param args
     */
    public static void main(String[] args) {
        new GUI("Main");
    }

}
