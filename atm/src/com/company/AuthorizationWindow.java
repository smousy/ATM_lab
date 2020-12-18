package com.company;

import javax.swing.*;
import java.awt.*;

public class AuthorizationWindow {
    public void init() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 100, 150, 200);
        frame.setTitle("Authorization");

        panel.setBackground(Color.black);
        JButton SubmitButton = new JButton("Enter card");
        SubmitButton.setLocation(20, 70);
        SubmitButton.setSize(100, 60);

        SubmitButton.setBackground(Color.darkGray);
        SubmitButton.setForeground(Color.LIGHT_GRAY);
        panel.add(SubmitButton);


        JTextField password = new JTextField();


        password.setLocation(20, 20);
        password.setSize(100,30);


        panel.add(password);

        SubmitButton.addActionListener(e -> {

            frame.dispose();

            MenuWindow menuWindow = new MenuWindow();
            menuWindow.init();
        });


        frame.setVisible(true);
        frame.setContentPane(panel);
    }
}
