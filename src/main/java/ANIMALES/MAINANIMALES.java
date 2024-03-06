package ANIMALES;

public class MAINANIMALES {

    public static void main(String[] args) {
        // Crear instancia de un animal acuático
        acuatico delfin = new acuatico("Delfín", "Mamífero", "Delfín común", "Gris", "Macho", "10 años",
                "200 kg", "2 m", "Acuático", "Océano", "Peces y calamares", "Vivíparo", "Nadar en aguas profundas",
                "Fiebre", "Vacuna contra la fiebre", 1, true, true, true, true, true, "Salada");


        // Mostrar información del delfín
        System.out.println("Información del delfín:");
        System.out.println("Nombre: " + delfin.getNombre());
        System.out.println("Especie: " + delfin.getEspecie());
        System.out.println("Color: " + delfin.getColor());
        System.out.println("Tipo de agua: " + delfin.getTipo_agua());
        delfin.buenasalud(true);
        delfin.registrarAlimentacion("Peces");

        // Crear instancia de un animal ave
        ave aguila = new ave("Águila", "Ave", "Águila real", "Café", "Hembra", "5 años",
                "5 kg", "1 m", "Ave", "Montañas", "Pequeños mamíferos y aves", "Ovíparo", "Volar a grandes alturas",
                "Gripe aviar", "Vacuna contra la gripe aviar", 2, true, true, true, true, true, "Aire");

        // Mostrar información del águila
        System.out.println("\nInformación del águila:");
        System.out.println("Nombre: " + aguila.getNombre());
        System.out.println("Especie: " + aguila.getEspecie());
        System.out.println("Color: " + aguila.getColor());
        System.out.println("Tipo de aviario: " + aguila.getTipo_aviario());
        aguila.buencomportamiento(true);
        aguila.registrarReproduccion("Águila macho");

        // Crear instancia de un animal terrestre
        terrestre leon = new terrestre("León", "Mamífero", "León africano", "Amarillo", "Macho", "8 años",
                "150 kg", "1.2 m", "Terrestre", "Savanna", "Cervidos y antílopes", "Vivíparo", "Cazar en manada",
                "Parásitos intestinales", "Vacuna antiparasitaria", 3, true, true, true, true, true, "Savanna");

        // Mostrar información del león
        System.out.println("\nInformación del león:");
        System.out.println("Nombre: " + leon.getNombre());
        System.out.println("Especie: " + leon.getEspecie());
        System.out.println("Color: " + leon.getColor());
        System.out.println("Tipo terrestre: " + leon.getTipo_terrestre());
        leon.registrarCuidados("Cepillado diario");
        leon.registrarEnfermedades("Parásitos intestinales");
    }
    }
