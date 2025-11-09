public class Cuidador {
    /**
     * Muestra si la acción de consultar se realizó o no.
     * @param hecho true si se realizó, false si no
     */
    public void consultar(boolean hecho) {
        System.out.println("Cuidador - Consultar: " + (hecho ? "REALIZADO" : "NO REALIZADO"));
    }

    /**
     * Muestra si la acción de clasificar se realizó o no.
     * @param hecho true si se realizó, false si no
     */
    public void clasificar(boolean hecho) {
        System.out.println("Cuidador - Clasificar: " + (hecho ? "REALIZADO" : "NO REALIZADO"));
    }
}
