package GUI;
import Engine.Func;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class mainPanel extends JPanel implements ActionListener {

    JButton submitButton;

    JTextField inputTextField;
    JTextField resultTextField;
    JComboBox<String> intialCurrencyDropdown;
    JComboBox<String> resultingCurrencyDropdown;

    Func func; 

    private String fromCurrency;
    private String resultingCurrency;

    private Double inputCurrencyAmt;

    mainPanel () {
        this.setBackground(new Color(220, 220, 220));

        inputTextField = new JTextField("input");
        inputTextField.setPreferredSize(new Dimension(100, 30));

        resultTextField = new JTextField("result");
        resultTextField.setPreferredSize(new Dimension(100, 30));

        String currenciesList[] = {
            "USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF"
        };
        
        intialCurrencyDropdown = new JComboBox<>(currenciesList);
        resultingCurrencyDropdown = new JComboBox<>(currenciesList);

        submitButton = new JButton("Submit!");

        submitButton.addActionListener(this);

        this.add(inputTextField);
        this.add(intialCurrencyDropdown);
        this.add(resultTextField);
        this.add(resultingCurrencyDropdown);
        this.add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {
            inputCurrencyAmt = Double.parseDouble(inputTextField.getText());
            fromCurrency = (String) intialCurrencyDropdown.getSelectedItem();
            resultingCurrency = (String) resultingCurrencyDropdown.getSelectedItem();

            func = new Func(inputCurrencyAmt, fromCurrency, resultingCurrency);

            resultTextField.setText(String.valueOf(func.calculate()));
        }
    }
}
