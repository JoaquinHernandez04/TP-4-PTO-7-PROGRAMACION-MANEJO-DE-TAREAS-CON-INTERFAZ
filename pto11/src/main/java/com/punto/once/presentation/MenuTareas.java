/*package com.punto.once.presentation;

import java.util.Scanner;

import com.punto.once.Persistence.ManejoDeTareas;

public class MenuTareas {
    public static void menuPrincipal() {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        
        while (!exit) {
            System.out.println("MANEJO DE TAREAS:");
            System.out.println("1. Ver tareas");
            System.out.println("2. Añadir tarea");
            System.out.println("3. Editar tarea");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("5. Eliminar tarea");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            
            switch (option) {
                case 1:
                   
                    ManejoDeTareas.listaDeTareas();
                    break;
                case 2:
                   
                    ManejoDeTareas.agregarTarea();
                    break;
                case 3:
                  
                    ManejoDeTareas.editarTarea();
                    break;
                case 4:
                 
                    ManejoDeTareas.marcarTareaCompletada();
                    break;
                case 5:
                  
                    ManejoDeTareas.eliminarTarea();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Saliendo del gestor de tareas...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo.");
                    break;
            }
        }
        
        scanner.close();
    }
}
    */
