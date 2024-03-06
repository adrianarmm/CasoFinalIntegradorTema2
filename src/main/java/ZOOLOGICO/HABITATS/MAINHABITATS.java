package HABITATS;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de un hábitat acuático
        acuaticos habitatAcuatico = new acuaticos(25.5f, 70.2f, true, true);

        // Mostrar información del hábitat acuático
        System.out.println("Información del hábitat acuático:");
        System.out.println("Temperatura: " + habitatAcuatico.getTemperatura());
        System.out.println("Humedad: " + habitatAcuatico.getHumedad());
        System.out.println("Limpieza: " + habitatAcuatico.isLimpieza());
        System.out.println("Puede nadar: " + habitatAcuatico.isPuede_nadar());

        // Crear instancia de un hábitat de aves
        ave habitatAve = new ave(20.0f, 60.8f, false, true);

        // Mostrar información del hábitat de aves
        System.out.println("\nInformación del hábitat de aves:");
        System.out.println("Temperatura: " + habitatAve.getTemperatura());
        System.out.println("Humedad: " + habitatAve.getHumedad());
        System.out.println("Limpieza: " + habitatAve.isLimpieza());
        System.out.println("Puede volar: " + habitatAve.isPuede_volar());

        // Crear instancia de un hábitat terrestre
        terrestres habitatTerrestre = new terrestres(30.0f, 40.5f, true, true);

        // Mostrar información del hábitat terrestre
        System.out.println("\nInformación del hábitat terrestre:");
        System.out.println("Temperatura: " + habitatTerrestre.getTemperatura());
        System.out.println("Humedad: " + habitatTerrestre.getHumedad());
        System.out.println("Limpieza: " + habitatTerrestre.isLimpieza());
        System.out.println("Puede caminar: " + habitatTerrestre.isPuede_caminar());
    }
}
