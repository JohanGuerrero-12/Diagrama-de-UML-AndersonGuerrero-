public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS DE ANIMALES ===\n");

        // Crear un león
        Leon leon = new Leon("Simba", 5, "Melena", false);
        System.out.println("LEÓN:");
        System.out.println("Nombre: " + leon.getNombre());
        System.out.println("Edad: " + leon.getEdad() + " años");
        System.out.println("Especie: " + leon.getEspecie());
        System.out.println("Tipo de pelaje: " + leon.getTipoPelaje());
        leon.comer();
        leon.dormir();
        leon.rugir();
        leon.amamantar();
        System.out.println();

        // Crear un elefante
        Elefante elefante = new Elefante("Dumbo", 10, "Piel gruesa", true);
        System.out.println("ELEFANTE:");
        System.out.println("Nombre: " + elefante.getNombre());
        System.out.println("Edad: " + elefante.getEdad() + " años");
        System.out.println("Especie: " + elefante.getEspecie());
        System.out.println("Tipo de pelaje: " + elefante.getTipoPelaje());
        elefante.comer();
        elefante.usarTrompa();
        elefante.amamantar();
        System.out.println();

        // Crear un cocodrilo
        Cocodrilo cocodrilo = new Cocodrilo("Coco", 8, "Escamas duras", false);
        System.out.println("COCODRILO:");
        System.out.println("Nombre: " + cocodrilo.getNombre());
        System.out.println("Edad: " + cocodrilo.getEdad() + " años");
        System.out.println("Especie: " + cocodrilo.getEspecie());
        System.out.println("Tipo de escamas: " + cocodrilo.getTipoEscamas());
        System.out.println("¿Es venenoso? " + cocodrilo.isEsVenenoso());
        cocodrilo.comer();
        cocodrilo.nadar();
        cocodrilo.mudarPiel();
        System.out.println();

        // Crear una iguana
        Iguana iguana = new Iguana("Iggy", 3, "Escamas pequeñas", false);
        System.out.println("IGUANA:");
        System.out.println("Nombre: " + iguana.getNombre());
        System.out.println("Edad: " + iguana.getEdad() + " años");
        System.out.println("Especie: " + iguana.getEspecie());
        System.out.println("Tipo de escamas: " + iguana.getTipoEscamas());
        System.out.println("¿Es venenosa? " + iguana.isEsVenenoso());
        iguana.comer();
        iguana.tomarSol();
        iguana.mudarPiel();

        // --- Demostración de Administrador y Cuidador ---
        System.out.println();
        System.out.println("=== DEMOSTRACION: Administrador y Cuidador ===");

        Administrador admin = new Administrador();
        // mostramos ejemplos: registrar hecho, actualizar no hecho, eliminar hecho
        admin.registrar(true);
        admin.actualizar(false);
        admin.eliminar(true);

        System.out.println();
        Cuidador cuidador = new Cuidador();
        // mostramos ejemplos: consultar hecho, clasificar no hecho
        cuidador.consultar(true);
        cuidador.clasificar(false);
    }
}

