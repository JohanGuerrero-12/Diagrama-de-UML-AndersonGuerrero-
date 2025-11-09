/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1poo.andersonguerrero;

/**
 *
 * @author 57322
 */
public class Profesor extends Usuario {
    private String departamento;
    private double salario;
    private String especialidad;
    private int anosExperiencia;
    
    // Constructor por defecto
    public Profesor() {
        super();
        this.departamento = "";
        this.salario = 0.0;
        this.especialidad = "";
        this.anosExperiencia = 0;
    }
    
    // Constructor parametrizado completo
    public Profesor(String nombre, String id, String email, String telefono, 
                    String departamento, double salario, String especialidad, int anosExperiencia) {
        super(nombre, id, email, telefono);
        this.departamento = departamento;
        this.salario = salario;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }
    
    // Getters
    public String getDepartamento() {
        return departamento;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    
    // Setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    // Métodos
    public void metodoProfesor() {
        System.out.println("Profesor: " + getNombre());
        System.out.println("Correo: " + getEmail());
        System.out.println("Cargo: Profesor");
        System.out.println("Area de especializacion: " + getEspecialidad());
        System.out.println("Departamento: " + getDepartamento());
    }
    
    public void interactuarConEstudiante(Estudiante estudiante) {
        System.out.println("\nProfesor " + getNombre() + " interactua con:");
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Correo: " + estudiante.getEmail());
        System.out.println("Area de especializacion: " + estudiante.getCarrera());
    }
}
