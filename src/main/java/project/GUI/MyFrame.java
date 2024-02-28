package project.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    private int length = 500;

    private Dimension containerSize = new Dimension(length, length);
    private Dimension headerSize = new Dimension(length, length / 5);
    private Dimension mainSize = new Dimension(length, (length / 10) * 6);

    public MyFrame () {
        this.setLayout(new BorderLayout(0, 0));
        this.setSize(containerSize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel headerPanel = new headerPanel();
        JPanel mainPanel = new mainPanel();
        // JPanel historyPanel = new JPanel();

        headerPanel.setPreferredSize(headerSize);
        mainPanel.setPreferredSize(mainSize);

        this.add(headerPanel, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
}