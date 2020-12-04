package ru.fresk.db.lab.ui;

import ru.fresk.db.lab.util.DisplayService;

import javax.swing.*;

public class ApplicationGUI extends JFrame {
    private JPanel mainPanel;
    private JTextArea graphTextArea;
    private JTextArea edgeTextArea;

    public ApplicationGUI() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);

        graphTextArea.setText(DisplayService.getGraphsInfo());
        edgeTextArea.setText(DisplayService.getEdgesInfo());

        this.pack();
    }
}
