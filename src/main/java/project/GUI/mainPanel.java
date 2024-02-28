package project.GUI;
import project.Engine.Func;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class mainPanel extends JPanel implements ActionListener {

    JButton submitButton;

    JTextField inputTextField;
    JLabel resultTextField;
    JComboBox<String> intialCurrencyDropdown;
    JComboBox<String> resultingCurrencyDropdown;

    JPanel inputCurrencyPanel;
    JPanel resultCurrencyPanel;

    JLabel inputCurrencyLabel;
    JLabel resultCurrencyLabel;

    Func func; 

    private String fromCurrency;
    private String resultingCurrency;

    private Double inputCurrencyAmt;

    private Color backgroundColor = new Color(220, 220, 220); 

    mainPanel () {
        this.setBackground(backgroundColor);

        inputCurrencyPanel = new JPanel();
        inputCurrencyPanel.setLayout(new BorderLayout(0, 15));
        inputCurrencyPanel.setBackground(backgroundColor);
        inputCurrencyLabel = new JLabel("USD", SwingConstants.CENTER);

        resultCurrencyPanel = new JPanel();
        resultCurrencyPanel.setLayout(new BorderLayout(0, 15));
        resultCurrencyPanel.setBackground(backgroundColor);
        resultCurrencyLabel = new JLabel("USD", SwingConstants.CENTER);

        inputTextField = new JTextField("input");
        inputTextField.setPreferredSize(new Dimension(100, 30));

        resultTextField = new JLabel("result");
        resultTextField.setPreferredSize(new Dimension(100, 30));
        resultTextField.setBorder(BorderFactory.createLineBorder(new Color(150, 150, 150)));

        String currenciesList[] = {
            "USD", "AUD", "CAD", "CHF", "CNY", "EGP", "EUR", "GBP", "INR", 
            "JPY", "MYR", "PHP","SGD", "THB"
        };
        
        intialCurrencyDropdown = new JComboBox<>(currenciesList);
        resultingCurrencyDropdown = new JComboBox<>(currenciesList);

        submitButton = new JButton("Submit!");

        submitButton.addActionListener(this);

        inputCurrencyPanel.add(inputCurrencyLabel, BorderLayout.NORTH);
        inputCurrencyPanel.add(inputTextField, BorderLayout.WEST);
        inputCurrencyPanel.add(intialCurrencyDropdown, BorderLayout.EAST);

        resultCurrencyPanel.add(resultCurrencyLabel, BorderLayout.NORTH);
        resultCurrencyPanel.add(resultTextField, BorderLayout.WEST);
        resultCurrencyPanel.add(resultingCurrencyDropdown, BorderLayout.EAST);

        this.add(inputCurrencyPanel);
        this.add(resultCurrencyPanel);
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
            inputCurrencyLabel.setText(fromCurrency);
            resultCurrencyLabel.setText(resultingCurrency);
        }
    }
}
