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

    }
