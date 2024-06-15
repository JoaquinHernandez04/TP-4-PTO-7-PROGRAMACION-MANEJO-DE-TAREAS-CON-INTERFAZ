package com.punto.once;

import javax.swing.SwingUtilities;

import com.punto.once.presentation.TareasGUI;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TareasGUI().setVisible(true);
            }
        });
    }
}


