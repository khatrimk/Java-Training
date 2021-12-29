package day16.callback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        var timer = new Timer (1000,listener);
        timer.start();
//
//        JOptionPane.showMessageDialog(null,"Quit program");
//        System.exit(0);



//        ActionListener actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent event) {
//                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
//                Toolkit.getDefaultToolkit().beep();
//            }
//        };
//
//        ActionListener actionListener = event -> {
//            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
//            Toolkit.getDefaultToolkit().beep();
//        };

//        var timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        timer.start();
    }
}
