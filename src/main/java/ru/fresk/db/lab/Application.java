package ru.fresk.db.lab;

import javax.swing.*;
import ru.fresk.db.lab.ui.ApplicationGUI;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new ApplicationGUI();
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }
}
