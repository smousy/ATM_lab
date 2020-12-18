package com.company;

import javax.swing.*;
import java.awt.*;

public class MenuWindow {
    public void init(){




        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(null);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width / 2 - 100, dimension.height / 2 - 200, 250, 550);
        frame.setTitle("Authorization");

        panel.setBackground(Color.black);

        JButton AccountButton = new JButton("View Invoice");
        AccountButton.setLocation(20, 20);
        AccountButton.setSize(200, 50);

        AccountButton.setBackground(Color.darkGray);
        AccountButton.setForeground(Color.LIGHT_GRAY);
        panel.add(AccountButton);


        AccountButton.addActionListener(e -> {

            frame.dispose();


        });

        JButton GraphicButton = new JButton("Communication Payment");
        GraphicButton.setLocation(20, 90);
        GraphicButton.setSize(200, 50);

        GraphicButton.setBackground(Color.darkGray);
        GraphicButton.setForeground(Color.LIGHT_GRAY);
        panel.add(GraphicButton);


        GraphicButton.addActionListener(e -> {

            frame.dispose();


        });

        JButton OperationButton = new JButton("Utilities Payment");
        OperationButton.setLocation(20, 160);
        OperationButton.setSize(200, 50);

        OperationButton.setBackground(Color.darkGray);
        OperationButton.setForeground(Color.LIGHT_GRAY);
        panel.add(OperationButton);


        OperationButton.addActionListener(e -> {

            frame.dispose();


        });

        JButton TypeButton = new JButton("Money Transaction");
        TypeButton.setLocation(20, 230);
        TypeButton.setSize(200, 50);

        TypeButton.setBackground(Color.darkGray);
        TypeButton.setForeground(Color.LIGHT_GRAY);
        panel.add(TypeButton);


        TypeButton.addActionListener(e -> {

            frame.dispose();


        });

        JButton CashButton = new JButton("Take Cash");
        CashButton.setLocation(20, 300);
        CashButton.setSize(200, 50);

        CashButton.setBackground(Color.darkGray);
        CashButton.setForeground(Color.LIGHT_GRAY);
        panel.add(CashButton);


        CashButton.addActionListener(e -> {

            frame.dispose();


        });

        JButton PrintButton = new JButton("Print check");
        PrintButton.setLocation(20, 370);
        PrintButton.setSize(200, 50);

        PrintButton.setBackground(Color.darkGray);
        PrintButton.setForeground(Color.LIGHT_GRAY);
        panel.add(PrintButton);


        PrintButton.addActionListener(e -> {

            frame.dispose();


        });

        JButton ExitButton = new JButton("Exit");
        ExitButton.setLocation(20, 440);
        ExitButton.setSize(200, 50);

        ExitButton.setBackground(Color.darkGray);
        ExitButton.setForeground(Color.LIGHT_GRAY);
        panel.add(ExitButton);


        ExitButton.addActionListener(e -> {

            frame.dispose();


        });


        frame.setVisible(true);
        frame.setContentPane(panel);
    }



}
