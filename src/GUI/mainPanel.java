package GUI;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mainPanel extends JPanel {
    mainPanel () {
        this.setBackground(new Color(220, 220, 220));

        JTextField inputTextField = new JTextField("input");
        JTextField resultTextField = new JTextField("result");

        String currenciesList[] = {
            "USD"
        };        
        
        JComboBox<String> intialCurrencyDropdown = new JComboBox<>(currenciesList);
        JComboBox<String> resultingCurrencyDropdown = new JComboBox<>(currenciesList);

        this.add(inputTextField);
        this.add(intialCurrencyDropdown);
        this.add(resultTextField);
        this.add(resultingCurrencyDropdown);
    }
}
