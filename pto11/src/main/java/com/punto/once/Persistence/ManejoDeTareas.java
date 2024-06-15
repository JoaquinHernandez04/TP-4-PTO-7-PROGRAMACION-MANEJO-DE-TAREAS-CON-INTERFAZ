package com.punto.once.Persistence;
import java.util.ArrayList;
import java.util.List;

public class ManejoDeTareas {

    static List<Tarea> tarea = new ArrayList<>();

    public static String listaDeTareas() {
        if (tarea.isEmpty()) {
            return "No hay tareas registradas.";
        } else {
            StringBuilder lista = new StringBuilder("LISTA DE TAREAS:\n");
            for (int i = 0; i < tarea.size(); i++) {
                lista.append((i + 1)).append(". ").append(tarea.get(i)).append("\n");
            }
            return lista.toString();
        }
    }

    public static void agregarTarea(String nombre, String descripcion) {
        Tarea nuevaTarea = new Tarea(nombre, descripcion);
        tarea.add(nuevaTarea);
    }

    public static void editarTarea(int indice, String nuevoNombre, String nuevaDescripcion) {
        if (indice < 0 || indice >= tarea.size()) {
            return;
        }

        Tarea tareaAEditar = tarea.get(indice);
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            tareaAEditar.setNombre(nuevoNombre);
        }
        if (nuevaDescripcion != null && !nuevaDescripcion.isEmpty()) {
            tareaAEditar.setDescripcion(nuevaDescripcion);
        }
    }

    public static void marcarTareaCompletada(int indice) {
        if (indice < 0 || indice >= tarea.size()) {
            return;
        }

        Tarea marcarTarea = tarea.get(indice);
        marcarTarea.setCompletado(true);
    }

    public static void eliminarTarea(int indice) {
        if (indice < 0 || indice >= tarea.size()) {
            return;
        }

        tarea.remove(indice);
    }
}