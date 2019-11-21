package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


/**
 * @author HaoFan Fang
 * @date 2019/11/21 16:48
 */

public class GameGUI extends JFrame implements ActionListener {



        /* 注册组件信息 */
        JFrame frame = new JFrame("猜数字小游戏");
        JPanel panelUp = new JPanel();
        JPanel panelDown = new JPanel();
        JPanel panelMidUp = new JPanel();
        JLabel lblGetter = new JLabel("获取 [1, 10] 之间的一个随机数：");
        JLabel lblGuess = new JLabel("输入您的猜测：");
        JButton btnGetter = new JButton("得到一个随机数");
        JTextField txtField = new JFormattedTextField(NumberFormat.getIntegerInstance());

        JLabel lblOK = new JLabel("单击确定按钮");
        JButton btnOK = new JButton("确定");
        JLabel info = new JLabel("提示", JLabel.CENTER);

        private int number = -1;

        private GameGUI() {
            /* 添加组件监听器 */
            btnGetter.addActionListener(this);
            btnOK.addActionListener(this);

            /* 设置主框 */
            frame.setVisible(true);
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            /* 设置上面板，添加四个组件 */
            panelUp.setSize(400, 220);
            panelUp.setBackground(Color.lightGray);
            panelUp.add(lblGetter);
            panelUp.add(btnGetter);
            panelUp.add(lblGuess);
            panelUp.add(txtField);
            panelUp.setLayout(new GridLayout(2, 2));

            /* 设置下面板，添加一个子面板与组件 */
            panelDown.setSize(400, 280);
            panelDown.setBackground(Color.lightGray);
            panelDown.setLayout(new BorderLayout());

            /* 管理子面板 */
            panelMidUp.setBackground(Color.green);
            panelMidUp.setLayout(new FlowLayout(FlowLayout.CENTER));
            panelMidUp.add(lblOK);
            panelMidUp.add(btnOK);

            /* 下面板格式 */
            panelDown.add(BorderLayout.NORTH, panelMidUp);
            panelDown.add(BorderLayout.CENTER, info);

            /* 递归添加进组件树 */
            frame.add(panelUp);
            frame.add(panelDown);
            frame.setLayout(new GridLayout(2, 1));
            info.setForeground(Color.blue);
        }

        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            /* 选取事件源 */
            if (source == btnGetter) {
                number = (int) (1 + Math.random() * 10);
            } else if (source == btnOK) {
                /* 基础排雷 */
                if (number == -1) {
                    JOptionPane.showMessageDialog(this, "请生成一个数！", "错误", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!txtField.getText().equals("")) {
                    /* 取得数字并判断 */
                    int guess = Integer.parseInt(txtField.getText());
                    if (guess < number) info.setText("猜小了！");
                    if (guess > number) info.setText("猜大了！");
                    if (guess == number) info.setText("正确");

                    /* 排雷 */
                } else {
                    JOptionPane.showMessageDialog(this, "请填写一个数！", "错误", JOptionPane.WARNING_MESSAGE);
                }
            }
        }



        public static void main(String[] args) {
            new GameGUI();
        }


}
