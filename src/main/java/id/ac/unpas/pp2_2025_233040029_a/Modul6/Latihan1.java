package id.ac.unpas.pp2_2025_233040029_a.Modul6;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Latihan1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Kalkulator Sederhana - Latihan 1");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 400);
            frame.setLayout(new BorderLayout(5, 5));

            JTextField display = new JTextField();
            display.setEditable(false);
            display.setHorizontalAlignment(JTextField.RIGHT);
            frame.add(display, BorderLayout.NORTH);

            JPanel buttons = new JPanel(new GridLayout(4, 4, 5, 5));

            String[] labels = {
                "1", "2", "3", "/",
                "4", "5", "6", "*",
                "7", "8", "9", "-",
                ".", "0", "=", "+"
            };

            for (String text : labels) {
                JButton b = new JButton(text);
                b.addActionListener(e -> display.setText(display.getText() + ((JButton) e.getSource()).getText()));
                buttons.add(b);
            }

            frame.add(buttons, BorderLayout.CENTER);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}