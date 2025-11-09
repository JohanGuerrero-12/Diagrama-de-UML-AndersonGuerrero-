/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1poo.andersonguerrero;

/**
 *
 * @author 57322
 */
public class Estudiante extends Usuario {
    private String grado;
    private double promedio;
    private int creditos;
    private String carrera;
    
    // Constructor por defecto
    public Estudiante() {
        super();
        this.grado = "";
        this.promedio = 0.0;
        this.creditos = 0;
        this.carrera = "";
    }
    
    // Constructor parametrizado completo
    public Estudiante(String nombre, String id, String email, String telefono, 
                      String grado, double promedio, int creditos, String carrera) {
        super(nombre, id, email, telefono);
        this.grado = grado;
        this.promedio = promedio;
        this.creditos = creditos;
        this.carrera = carrera;
    }
    
    // Getters
    public String getGrado() {
        return grado;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    public int getCreditos() {
        return creditos;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    // Setters
    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    // Métodos
    public void metodoEstudiante() {
        System.out.println("Estudiante: " + getNombre());
        System.out.println("Correo: " + getEmail());
        System.out.println("Area de especializacion: " + getCarrera());
        System.out.println("Grado: " + getGrado());
    }
    
    public void interactuarConProfesor(Profesor profesor) {
        System.out.println("\nEstudiante " + getNombre() + " interactua con:");
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("Correo: " + profesor.getEmail());
        System.out.println("Area de especializacion: " + profesor.getEspecialidad());
    }
}

