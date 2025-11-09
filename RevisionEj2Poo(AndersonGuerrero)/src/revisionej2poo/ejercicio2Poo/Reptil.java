public class Reptil extends Animal {
    // Atributos específicos de reptiles
    protected String tipoEscamas;
    protected boolean esVenenoso;

    // Constructor
    public Reptil(String nombre, int edad, String especie, String tipoEscamas, boolean esVenenoso) {
        super(nombre, edad, especie);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
    }

    // Método específico de reptiles
    public void mudarPiel() {
        System.out.println(nombre + " esta mudando su piel.");
    }

    // Getters y Setters
    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }
}
