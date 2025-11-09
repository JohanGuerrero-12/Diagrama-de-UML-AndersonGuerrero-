/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1poo.andersonguerrero;

/**
 *
 * @author 57322
 */
public class Administrador extends Usuario {
    private String cargo;
    private String area;
    private double salario;
    private boolean permisosSistema;
    
    // Constructor por defecto
    public Administrador() {
        super();
        this.cargo = "";
        this.area = "";
        this.salario = 0.0;
        this.permisosSistema = false;
    }
    
    // Constructor parametrizado completo
    public Administrador(String nombre, String id, String email, String telefono, 
                         String cargo, String area, double salario, boolean permisosSistema) {
        super(nombre, id, email, telefono);
        this.cargo = cargo;
        this.area = area;
        this.salario = salario;
        this.permisosSistema = permisosSistema;
    }
    
    // Getters
    public String getCargo() {
        return cargo;
    }
    
    public String getArea() {
        return area;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public boolean isPermisosSistema() {
        return permisosSistema;
    }
    
    // Setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setPermisosSistema(boolean permisosSistema) {
        this.permisosSistema = permisosSistema;
    }
    
    // Métodos
    public void metodoAdministrador() {
        System.out.println("Administrador: " + getNombre());
        System.out.println("Correo: " + getEmail());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Area de especializacion: " + getArea());
    }
    
    public void interactuarConEstudiante(Estudiante estudiante) {
        System.out.println("\nAdministrador " + getNombre() + " interactua con:");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Correo: " + estudiante.getEmail());
        System.out.println("Area de especializacion: " + estudiante.getCarrera());
    }
    
    public void interactuarConProfesor(Profesor profesor) {
        System.out.println("\nAdministrador " + getNombre() + " interactua con:");
        System.out.println("Profesor: " + profesor.getNombre());
        System.out.println("Correo: " + profesor.getEmail());
        System.out.println("Cargo: Profesor");
        System.out.println("Area de especializacion: " + profesor.getEspecialidad());
    }
}
