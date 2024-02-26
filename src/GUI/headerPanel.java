package GUI;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class headerPanel extends JPanel {
    headerPanel() {
        this.setBackground(new Color(200, 200, 200));

        JLabel title = new JLabel("Currency Converter");

        this.add(title);
    }
}
