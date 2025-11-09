public class Elefante extends Mamifero {
    // Constructor
    public Elefante(String nombre, int edad, String tipoPelaje, boolean alimentaCrias) {
        super(nombre, edad, "Elefante", tipoPelaje, alimentaCrias);
    }

    // Método específico del elefante
    public void usarTrompa() {
        System.out.println(nombre + " esta usando su trompa para agarrar algo.");
    }
}

