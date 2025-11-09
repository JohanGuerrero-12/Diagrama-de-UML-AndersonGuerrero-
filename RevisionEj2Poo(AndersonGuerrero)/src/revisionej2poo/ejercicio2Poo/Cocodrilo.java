public class Cocodrilo extends Reptil {
    // Constructor
    public Cocodrilo(String nombre, int edad, String tipoEscamas, boolean esVenenoso) {
        super(nombre, edad, "Cocodrilo", tipoEscamas, esVenenoso);
    }

    // Método específico del cocodrilo
    public void nadar() {
        System.out.println(nombre + " esta nadando en el agua.");
    }
}

