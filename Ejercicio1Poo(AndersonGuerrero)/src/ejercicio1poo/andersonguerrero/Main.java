package ejercicio1poo.andersonguerrero;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Maria Garcia", "001 estudiante de derecho", 
                                                 "maria.garcia@universidad.edu", "3001234567", 
                                                 "3ro", 4.2, 85, "Derecho");
        Profesor profesor = new Profesor("Carlos Lopez", "001 profe de derecho", 
                                         "carlos.lopez@universidad.edu", "3009876543", 
                                         "Derecho", 5000.0, "Derecho Civil", 8);
        Administrador administrador = new Administrador("Ana Rodriguez", "001 administrador", 
                                                        "ana.rodriguez@universidad.edu", "3005551234", 
                                                        "Director Academico", "Gestion Academica", 
                                                        7000.0, true);
        
        System.out.println("=== INFORMACION DE USUARIOS ===\n");
        estudiante.metodoEstudiante();
        System.out.println();
        profesor.metodoProfesor();
        System.out.println();
        administrador.metodoAdministrador();
        
        System.out.println("\n=== INTERACCIONES ===\n");
        estudiante.interactuarConProfesor(profesor);
        profesor.interactuarConEstudiante(estudiante);
        administrador.interactuarConEstudiante(estudiante);
        administrador.interactuarConProfesor(profesor);
    }
    
}
