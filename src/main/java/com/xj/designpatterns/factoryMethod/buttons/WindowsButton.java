package com.xj.designpatterns.factoryMethod.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * windows按钮实现
 * @author : xiongjun
 * @date : 2024/8/8 09:54
 */
public class WindowsButton implements Button{

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;


    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(java.awt.FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();

        panel.add(new JButton("测试按钮"));

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("退出");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
