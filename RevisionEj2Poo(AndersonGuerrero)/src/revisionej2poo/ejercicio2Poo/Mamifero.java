public class Mamifero extends Animal {
    // Atributos específicos de mamíferos
    protected String tipoPelaje;
    protected boolean alimentaCrias;

    // Constructor
    public Mamifero(String nombre, int edad, String especie, String tipoPelaje, boolean alimentaCrias) {
        super(nombre, edad, especie);
        this.tipoPelaje = tipoPelaje;
        this.alimentaCrias = alimentaCrias;
    }

    // Método específico de mamíferos
    public void amamantar() {
        if (alimentaCrias) {
            System.out.println(nombre + " esta amamantando a sus crías.");
        } else {
            System.out.println(nombre + " no amamanta crias actualmente.");
        }
    }

    // Getters y Setters
    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public boolean isAlimentaCrias() {
        return alimentaCrias;
    }

    public void setAlimentaCrias(boolean alimentaCrias) {
        this.alimentaCrias = alimentaCrias;
    }
}
