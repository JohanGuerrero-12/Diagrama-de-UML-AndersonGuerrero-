/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1poo.andersonguerrero;

/**
 *
 * @author 57322
 */
public class Usuario {
    private String nombre;
    private String id;
    private String email;
    private String telefono;
    
    // Constructor por defecto
    public Usuario() {
        this.nombre = "";
        this.id = "";
        this.email = "";
        this.telefono = "";
    }
    
    // Constructor parametrizado
    public Usuario(String nombre, String id, String email, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.telefono = telefono;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

