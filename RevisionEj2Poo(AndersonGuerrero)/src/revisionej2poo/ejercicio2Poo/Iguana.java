public class Iguana extends Reptil {
    // Constructor
    public Iguana(String nombre, int edad, String tipoEscamas, boolean esVenenoso) {
        super(nombre, edad, "Iguana", tipoEscamas, esVenenoso);
    }

    // Método específico de la iguana
    public void tomarSol() {
        System.out.println(nombre + "esta tomando el sol para calentarse.");
    }
}

