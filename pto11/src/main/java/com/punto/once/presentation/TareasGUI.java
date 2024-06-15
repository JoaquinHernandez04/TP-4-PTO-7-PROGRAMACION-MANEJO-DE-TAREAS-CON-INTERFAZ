package com.punto.once.presentation;
import com.punto.once.Persistence.ManejoDeTareas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TareasGUI extends JFrame {

    private JTextArea tareaArea;

    public TareasGUI() {
        setTitle("Gestión de Tareas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel de botones
        JPanel buttonPanel = new JPanel(new GridLayout(5, 1));
        JButton btnListaDeTareas = new JButton("Listar Tareas");
        JButton btnAgregarTarea = new JButton("Agregar Tarea");
        JButton btnEditarTarea = new JButton("Editar Tarea");
        JButton btnMarcarCompletada = new JButton("Marcar Tarea Completada");
        JButton btnEliminarTarea = new JButton("Eliminar Tarea");

        buttonPanel.add(btnListaDeTareas);
        buttonPanel.add(btnAgregarTarea);
        buttonPanel.add(btnEditarTarea);
        buttonPanel.add(btnMarcarCompletada);
        buttonPanel.add(btnEliminarTarea);

        // Area de texto
        tareaArea = new JTextArea();
        tareaArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(tareaArea);

        // Añadir componentes al frame
        add(buttonPanel, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);

        // Listeners para los botones
        btnListaDeTareas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tareaArea.setText(ManejoDeTareas.listaDeTareas());
            }
        });

        btnAgregarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTarea();
            }
        });

        btnEditarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarTarea();
            }
        });

        btnMarcarCompletada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                marcarTareaCompletada();
            }
        });

        btnEliminarTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTarea();
            }
        });
    }

    private void agregarTarea() {
        String nombre = JOptionPane.showInputDialog("Nombre de la tarea:");
        String descripcion = JOptionPane.showInputDialog("Descripción de la tarea:");
        if (nombre != null && descripcion != null) {
            ManejoDeTareas.agregarTarea(nombre, descripcion);
            tareaArea.setText(ManejoDeTareas.listaDeTareas());
        }
    }

    private void editarTarea() {
        String indiceStr = JOptionPane.showInputDialog("Índice de la tarea a editar:");
        if (indiceStr != null) {
            int indice = Integer.parseInt(indiceStr) - 1;
            String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre (dejar vacío para mantener):");
            String nuevaDescripcion = JOptionPane.showInputDialog("Nueva descripción (dejar vacío para mantener):");
            ManejoDeTareas.editarTarea(indice, nuevoNombre, nuevaDescripcion);
            tareaArea.setText(ManejoDeTareas.listaDeTareas());
        }
    }

    private void marcarTareaCompletada() {
        String indiceStr = JOptionPane.showInputDialog("Índice de la tarea a marcar como completada:");
        if (indiceStr != null) {
            int indice = Integer.parseInt(indiceStr) - 1;
            ManejoDeTareas.marcarTareaCompletada(indice);
            tareaArea.setText(ManejoDeTareas.listaDeTareas());
        }
    }

    private void eliminarTarea() {
        String indiceStr = JOptionPane.showInputDialog("Índice de la tarea a eliminar:");
        if (indiceStr != null) {
            int indice = Integer.parseInt(indiceStr) - 1;
            ManejoDeTareas.eliminarTarea(indice);
            tareaArea.setText(ManejoDeTareas.listaDeTareas());
        }
    }
}