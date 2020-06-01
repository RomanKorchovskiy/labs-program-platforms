package com.labs.lab5.ui;

import javax.swing.*;

public class MainForm extends JFrame {
  private JTextField speedInput;
  private JTextField radiusInput;
  private JLabel resultLabel;
  private JButton calculateButton;
  private JPanel screen;

  public MainForm() {
    setSize(600, 400);
    setContentPane(screen);
    setLocationRelativeTo(null);

    calculateButton.addActionListener(
        e -> {
          double radius = Double.parseDouble(radiusInput.getText());
          Double speed = Double.parseDouble(speedInput.getText());
          resultLabel.setText((speed * speed / radius) + " рд./cек.");
        });
  }
}
