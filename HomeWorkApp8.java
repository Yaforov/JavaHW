package HW8;
/**
 * Java. Lesson 1. Homework 8
 * @author Yaforov Roman
 * @version Date: 19.04.2022 г.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HomeWorkApp8 extends JFrame {
    int counter = 0;

    public HomeWorkApp8() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);

        Font font = new Font("Arrial", Font.BOLD, 30);

        JButton leftButton = new JButton("Сгенерировать");
        leftButton.setFont(font);
        add(leftButton, BorderLayout.SOUTH);

        JTextField counterTex = new JTextField("Генератор");
        counterTex.setFont(font);
        counterTex.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterTex, BorderLayout.CENTER);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterTex.setText(generatDate());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        HomeWorkApp8 app = new HomeWorkApp8();
    //System.out.println(15);
    }

    public String generatDate() {
        Random random = new Random();
        return "+7 999 " + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10) + " " + random.nextInt(10)
                + random.nextInt(10) + "-" + random.nextInt(10)
                + random.nextInt(10);
    }
}
