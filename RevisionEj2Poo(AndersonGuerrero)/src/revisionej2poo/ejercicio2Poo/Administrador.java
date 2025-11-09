public class Administrador {
    /**
     * Muestra si la acción de registrar se realizó o no.
     * @param hecho true si se realizó, false si no
     */
    public void registrar(boolean hecho) {
        System.out.println("Administrador - Registrar: " + (hecho ? "REALIZADO" : "NO REALIZADO"));
    }

    /**
     * Muestra si la acción de actualizar se realizó o no.
     * @param hecho true si se realizó, false si no
     */
    public void actualizar(boolean hecho) {
        System.out.println("Administrador - Actualizar: " + (hecho ? "REALIZADO" : "NO REALIZADO"));
    }

    /**
     * Muestra si la acción de eliminar se realizó o no.
     * @param hecho true si se realizó, false si no
     */
    public void eliminar(boolean hecho) {
        System.out.println("Administrador - Eliminar: " + (hecho ? "REALIZADO" : "NO REALIZADO"));
    }
}
