package ZOOLOGICO;
import ZOOLOGICO.ANIMALES.acuatico;
import ZOOLOGICO.ANIMALES.animal;
import ZOOLOGICO.ANIMALES.ave;
import ZOOLOGICO.ANIMALES.terrestre;



import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Opciones relacionadas con los animales
        System.out.println("1. Crear un animal");
        System.out.println("2. Crear un animal acuático");
        System.out.println("3. Crear un ave");
        System.out.println("4. Crear un animal terrestre");
        System.out.println("5. Realizar acciones de animal");
        System.out.println("6. Salir");

        int eleccion = scanner.nextInt();
        switch (eleccion) {
            case 1:
                // Crear un animal
                System.out.println("Introduce el nombre del animal:");
                String nombreAnimal = scanner.next();
                animal animal = new animal(nombreAnimal, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true);
                System.out.println("Animal creado: " + animal);
                break;
            case 2:
                // Crear un animal acuático
                System.out.println("Introduce el nombre del animal acuático:");
                String nombreAnimalAcuatico = scanner.next();
                boolean aletas, branquias, escamas;
                String tipoDeAgua;
                System.out.println("¿Tiene aletas? (true/false):");
                aletas = scanner.nextBoolean();
                System.out.println("¿Tiene branquias? (true/false):");
                branquias = scanner.nextBoolean();
                System.out.println("¿Tiene escamas? (true/false):");
                escamas = scanner.nextBoolean();
                System.out.println("Introduce el tipo de agua (dulce/salada):");
                tipoDeAgua = scanner.next();
                acuatico animalAcuatico = new acuatico(nombreAnimalAcuatico, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, aletas, branquias, escamas, tipoDeAgua);
                System.out.println("Animal acuático creado: " + animalAcuatico);
                break;
            case 3:
                // Crear un ave
                System.out.println("Introduce el nombre del ave:");
                String nombreAve = scanner.next();
                boolean vuela, pico, plumaje;
                String tipoDeAve;
                System.out.println("¿Puede volar? (true/false):");
                vuela = scanner.nextBoolean();
                System.out.println("¿Tiene pico? (true/false):");
                pico = scanner.nextBoolean();
                System.out.println("¿Tiene plumaje? (true/false):");
                plumaje = scanner.nextBoolean();
                System.out.println("Introduce el tipo de ave (jaula/aviario):");
                tipoDeAve = scanner.next();
                ave ave = new ave(nombreAve, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, vuela, pico, plumaje, tipoDeAve);
                System.out.println("Ave creada: " + ave);
                break;
            case 4:
                // Crear un animal terrestre
                System.out.println("Introduce el nombre del animal terrestre:");
                String nombreAnimalTerrestre = scanner.next();
                boolean patas, cola, pelaje;
                String tipoTerrestre;
                System.out.println("¿Tiene patas? (true/false):");
                patas = scanner.nextBoolean();
                System.out.println("¿Tiene cola? (true/false):");
                cola = scanner.nextBoolean();
                System.out.println("¿Tiene pelaje? (true/false):");
                pelaje = scanner.nextBoolean();
                System.out.println("Introduce el tipo de terreno (bosque/sabana):");
                tipoTerrestre = scanner.next();
                terrestre animalTerrestre = new terrestre(nombreAnimalTerrestre, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, patas, cola, pelaje, tipoTerrestre);
                System.out.println("Animal terrestre creado: " + animalTerrestre);
                break;
            case 5:
                // Realizar acciones con el animal
                System.out.println("1. Registrar alimentación");
                System.out.println("2. Registrar reproducción");
                System.out.println("3. Registrar cuidados");
                System.out.println("4. Registrar enfermedades");
                System.out.println("5. Registrar vacunas");
                System.out.println("6. Registrar hábitat");
                System.out.println("7. Registrar peso");
                System.out.println("8. Registrar altura");
                System.out.println("9. Registrar edad");
                System.out.println("10. Registrar color");
                System.out.println("11. Registrar raza");
                System.out.println("12. Registrar especie");
                System.out.println("13. Registrar nombre");
                System.out.println("14. Registrar sexo");
                System.out.println("15. Registrar tipo");
                System.out.println("16. Registrar ID");
                System.out.println("17. Registrar salud");
                System.out.println("18. Registrar comportamiento");
                System.out.println("19. Salir");

                // La implementación de estas opciones dependería de tener una colección de animales para buscar y modificar
                break;
            case 6:
                // Salir
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
