package com.punto.once.Persistence;
class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completado;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completado = false;
    }

    public String getName() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripcion: " + descripcion + ", Completada: " + (completado ? "Sí" : "No");
    }
}
