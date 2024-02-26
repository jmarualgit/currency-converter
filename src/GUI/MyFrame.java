package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    private int length = 800;

    private Dimension containerSize = new Dimension(length, 800);
    private Dimension headerSize = new Dimension(length, 150);
    private Dimension mainSize = new Dimension(length, 650);

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