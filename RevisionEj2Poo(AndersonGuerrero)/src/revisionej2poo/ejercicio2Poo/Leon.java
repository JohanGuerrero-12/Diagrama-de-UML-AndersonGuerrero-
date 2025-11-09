public class Leon extends Mamifero {
    // Constructor
    public Leon(String nombre, int edad, String tipoPelaje, boolean alimentaCrias) {
        super(nombre, edad, "León", tipoPelaje, alimentaCrias);
    }

    // Método específico del león
    public void rugir() {
        System.out.println(nombre + " esta rugiendo: ¡ROOOAR!");
    }
}

