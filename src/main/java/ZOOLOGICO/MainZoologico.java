
package ZOOLOGICO;

import ZOOLOGICO.ANIMALES.animal;
import ZOOLOGICO.ANIMALES.acuatico;
import ZOOLOGICO.ANIMALES.ave;
import ZOOLOGICO.ANIMALES.terrestre;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Animal-related options
        System.out.println("1. Create an animal");
        System.out.println("2. Create an aquatic animal");
        System.out.println("3. Create a bird");
        System.out.println("4. Create a terrestrial animal");
        System.out.println("5. Perform animal actions");
        System.out.println("6. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Create an animal
                System.out.println("Enter the animal's name:");
                String animalName = scanner.next();
                animal animal = new animal(animalName, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true);
                System.out.println("Animal created: " + animal);
                break;
            case 2:
                // Create an aquatic animal
                System.out.println("Enter the aquatic animal's name:");
                String aquaticAnimalName = scanner.next();
                boolean aletas, branquias, escamas;
                String tipodeagua;
                System.out.println("Enter aletas (true/false):");
                aletas = scanner.nextBoolean();
                System.out.println("Enter branquias (true/false):");
                branquias = scanner.nextBoolean();
                System.out.println("Enter escamas (true/false):");
                escamas = scanner.nextBoolean();
                System.out.println("Enter the type of water (fresh/salt):");
                tipodeagua = scanner.next();
                acuatico aquaticAnimal = new acuatico(aquaticAnimalName, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, aletas, branquias, escamas, tipodeagua);
                System.out.println("Aquatic animal created: " + aquaticAnimal);
                break;
            case 3:
                // Create a bird
                System.out.println("Enter the bird's name:");String birdName = scanner.next();
                boolean vuela, pico, plumaje;
                String tipodeave;
                System.out.println("Enter vuela (true/false):");
                vuela = scanner.nextBoolean();
                System.out.println("Enter pico (true/false):");
                pico = scanner.nextBoolean();
                System.out.println("Enter plumaje (true/false):");
                plumaje = scanner.nextBoolean();
                System.out.println("Enter the type of aviario (cage/aviary):");
                tipodeave = scanner.next();
                ave bird = new ave(birdName, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, vuela, pico, plumaje, tipodeave);
                System.out.println("Bird created: " + bird);
                break;
            case 4:
                // Create a terrestrial animal
                System.out.println("Enter the terrestrial animal's name:");
                String terrestrialAnimalName = scanner.next();
                boolean patas, cola, pelaje;
                String tipo_terrestre;
                System.out.println("Enter patas (true/false):");
                patas = scanner.nextBoolean();
                System.out.println("Enter cola (true/false):");
                cola = scanner.nextBoolean();
                System.out.println("Enter pelaje (true/false):");
                pelaje = scanner.nextBoolean();
                System.out.println("Enter the type of terrestrial (forest/savannah):");
                tipo_terrestre = scanner.next();
                terrestre terrestrialAnimal = new terrestre(terrestrialAnimalName, "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, true, true, patas, cola, pelaje, tipo_terrestre);
                System.out.println("Terrestrial animal created: " + terrestrialAnimal);
                break;
            case 5:
                // Perform animal actions
                System.out.println("1. Register alimentation");
                System.out.println("2. Register reproduction");
                System.out.println("3. Register cuidados");
                System.out.println("4. Register enfermedades");
                System.out.println("5. Register vacunas");
                System.out.println("6. Register habitat");
                System.out.println("7. Register peso");
                System.out.println("8. Register altura");
                System.out.println("9. Register edad");
                System.out.println("10. Register color");
                System.out.println("11. Register raza");
                System.out.println("12. Register especie");
                System.out.println("13. Register nombre");
                System.out.println("14. Register sexo");
                System.out.println("15. Register tipo");
                System.out.println("16. Register id");
                System.out.println("17. Register salud");
                System.out.println("18. Register comportamiento");
                System.out.println("19. Exit");

                int animalActionChoice = scanner.nextInt();
                switch (animalActionChoice) {
                    case 1:
                        // Register alimentation
                        System.out.println("Enter the animal's name:");
                        String animalForAlimentation = scanner.next();
                        System.out.println("Enter the alimentation:");
                        String alimentacion = scanner.next();
                        // Find the animal and register the alimentation
                        break;
                    case 2:
                        // Register reproduction
                        System.out.println("Enter the animal's name:");
                        String animalForReproduction = scanner.next();
                        System.out.println("Enter the reproduction:");
                        String reproduccion = scanner.next();
                        // Find the animal and register the reproduction
                        break;
                    case 3:
                        // Register cuidados
                        System.out.println("Enter the animal's name:");
                        String animalForCuidados = scanner.next();
                        System.out.println("Enter the cuidados:");
                        String cuidados = scanner.next();
                        // Find the animal and register the cuidados
                        break;
                    case 4:
                        // Register enfermedades
                        System.out.println("Enter the animal's name:");
                        String animalForEnfermedades = scanner.next();
                        System.out.println("Enter the enfermedades:");
                        String enfermedades = scanner.next();
                        // Find the animal and register the enfermedades
                        break;
                    case 5:
                        // Register vacunas
                        System.out.println("Enter the animal's name:");
                        String animalForVacunas = scanner.next();
                        System.out.println("Enter the vacunas:");
                        String vacunas = scanner.next();
                        // Find the animal and register the vacunas
                        break;
                    case 6:
                        // Register habitat
                        System.out.println("Enter the animal's name:");
                        String animalForHabitat = scanner.next();
                        System.out.println("Enter the habitat:");
                        String habitat = scanner.next();
                        // Find the animal and register the habitat
                        break;
                    case 7:
                        // Register peso
                        System.out.println("Enter the animal's name:");
                        String animalForPeso = scanner.next();
                        System.out.println("Enter the peso:");
                        String peso = scanner.next();
                        // Find the animal and register the peso
                        break;
                    case 8:
                        // Register altura
                        System.out.println("Enter the animal's name:");
                        String animalForAltura = scanner.next();
                        System.out.println("Enter the altura:");
                        String altura = scanner.next();
                        // Find the animal and register the altura
                        break;
                    case 9:
                        // Register edad
                        System.out.println("Enter the animal's name:");
                        String animalForEdad = scanner.next();
                        System.out.println("Enter the edad:");
                        String edad = scanner.next();
                        // Find the animal and register the edad
                        break;
                    case 10:
                        // Register color
                        System.out.println("Enter the animal's name:");
                        String animalForColor = scanner.next();
                        System.out.println("Enter the color:");
                        String color = scanner.next();
                        // Find the animal and register the color
                        break;
                    case 11:
                        // Register raza
                        System.out.println("Enter the animal's name:");
                        String animalForRaza = scanner.next();
                        System.out.println("Enter the raza:");
                        String raza = scanner.next();
                        // Find the animal and register the raza
                        break;
                    case 12:
                        // Register especie
                        System.out.println("Enter the animal's name:");
                        String animalForEspecie = scanner.next();
                        System.out.println("Enter the especie:");
                        String especie = scanner.next();
                        // Find the animal and register the especie
                        break;
                    case 13:
                        // Register nombre
                        System.out.println("Enter the animal's name:");
                        String animalForNombre = scanner.next();
                        System.out.println("Enter the nombre:");
                        String nombre = scanner.next();
                        // Find the animal and register the nombre
                        break;
                    case 14:
                        // Register sexo
                        System.out.println("Enter the animal's name:");
                        String animalForSexo = scanner.next();
                        System.out.println("Enter the sexo:");
                        String sexo = scanner.next();
                        // Find the animal and register the sexo
                        break;
                    case 15:
                        // Register tipo
                        System.out.println("Enter the animal's name:");
                        String animalForTipo = scanner.next();
                        System.out.println("Enter the tipo:");
                        String tipo = scanner.next();
                        // Find the animal and register the tipo
                        break;
                    case 16:
                        // Register id
                        System.out.println("Enter the animal's name:");
                        String animalForId = scanner.next();
                        System.out.println("Enter the id:");
                        int id = scanner.nextInt();
                        // Find the animal and register the id
                        break;
                    case 17:
                        // Register salud
                        System.out.println("Enter the animal's name:");
                        String animalForSalud = scanner.next();
                        System.out.println("Enter the salud (true/false):");
                        boolean salud = scanner.nextBoolean();
                        // Find the animal and register the salud
                        break;
                    case 18:
                        // Register comportamiento
                        System.out.println("Enter the animal's name:");
                        String animalForComportamiento = scanner.next();
                        System.out.println("Enter the comportamiento (true/false):");
                        boolean comportamiento = scanner.nextBoolean();
                        // Find the animal and register the comportamiento
                        break;
                    case 19:
                        // Exit
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            case 6:
                // Exit
                break;
            default:
                System.out.println("Invalid option.");
        }

        // Habitat-related options
        System.out.println("1. Create a habitat");
        System.out.println("2. Perform habitat actions");
        System.out.println("3. Exit");

        int habitatChoice = scanner.nextInt();
        switch (habitatChoice) {
            case 1:
                // Create a habitat
                System.out.println("1. Create an aviary");
                System.out.println("2. Create an aquatic habitat");
                System.out.println("3. Create a terrestrial habitat");
                System.out.println("4. Exit");

                int createHabitatChoice = scanner.nextInt();
                switch (createHabitatChoice) {
                    case 1:
                        // Create an aviary
                        System.out.println("Enter the aviary's temperature:");
                        float aviaryTemperature = scanner.nextFloat();
                        System.out.println("Enter the aviary's humedad:");
                        float aviaryHumedad = scanner.nextFloat();
                        System.out.println("Enter the aviary's limpieza (true/false):");
                        boolean aviaryLimpieza = scanner.nextBoolean();
                        HabitatAve aviary = new HabitatAve(aviaryTemperature, aviaryHumedad, aviaryLimpieza);
                        System.out.println("Aviary created: " + aviary);
                        break;
                    case 2:
                        // Create an aquatic habitat
                        System.out.println("Enter the aquatic habitat's temperature:");
                        float aquaticHabitatTemperature = scanner.nextFloat();
                        System.out.println("Enter the aquatic habitat's humedad:");
                        float aquaticHabitatHumedad = scanner.nextFloat();
                        System.out.println("Enter the aquatic habitat's limpieza (true/false):");
                        boolean aquaticHabitatLimpieza = scanner.nextBoolean();
                        HabitatAcuaticos aquaticHabitat = new HabitatAcuaticos(aquaticHabitatTemperature, aquaticHabitatHumedad, aquaticHabitatLimpieza, true);
                        System.out.println("Aquatic habitat created: " + aquaticHabitat);
                        break;
                    case 3:
                        // Create a terrestrial habitat
                        System.out.println("Enter the terrestrial habitat's temperature:");
                        float terrestrialHabitatTemperature = scanner.nextFloat();
                        System.out.println("Enter the terrestrial habitat's humedad:");
                        float terrestrialHabitatHumedad = scanner.nextFloat();
                        System.out.println("Enter the terrestrial habitat's limpieza (true/false):");
                        boolean terrestrialHabitatLimpieza = scanner.nextBoolean();
                        HabitatTerrestres terrestrialHabitat = new HabitatTerrestres(terrestrialHabitatTemperature, terrestrialHabitatHumedad, terrestrialHabitatLimpieza, true);
                        System.out.println("Terrestrial habitat created: " + terrestrialHabitat);
                        break;
                    case 4:
                        // Exit
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            case 2:
                // Perform habitat actions
                System.out.println("1. Monitor a habitat");
                System.out.println("2. Exit");

                int habitatActionChoice = scanner.nextInt();
                switch (habitatActionChoice) {
                    case 1:
                        // Monitor a habitat
                        System.out.println("1. Monitor an aviary");
                        System.out.println("2. Monitor an aquatic habitat");
                        System.out.println("3. Monitor a terrestrial habitat");
                        System.out.println("4. Exit");

                        int monitorHabitatChoice = scanner.nextInt();
                        switch (monitorHabitatChoice) {
                            case 1:
                                // Monitor an aviary
                                System.out.println("Enter the aviary's temperature:");
                                float aviaryTemperatureToMonitor = scanner.nextFloat();
                                System.out.println("Enter the aviary's humedad:");
                                float aviaryHumedadToMonitor = scanner.nextFloat();
                                System.out.println("Enter the aviary's limpieza (true/false):");
                                boolean aviaryLimpiezaToMonitor = scanner.nextBoolean();
                                HabitatAve aviaryToMonitor = new HabitatAve(aviaryTemperatureToMonitor, aviaryHumedadToMonitor, aviaryLimpiezaToMonitor);
                                aviaryToMonitor.monitorear();
                                break;
                            case 2:
                                // Monitor an aquatic habitat
                                System.out.println("Enter the aquatic habitat's temperature:");
                                float aquaticHabitatTemperatureToMonitor = scanner.nextFloat();
                                System.out.println("Enter the aquatic habitat's humedad:");
                                float aquaticHabitatHumedadToMonitor = scanner.nextFloat();
                                System.out.println("Enter the aquatic habitat's limpieza (true/false):");
                                boolean aquaticHabitatLimpiezaToMonitor = scanner.nextBoolean();
                                HabitatAcuaticos aquaticHabitatToMonitor = new HabitatAcuaticos(aquaticHabitatTemperatureToMonitor, aquaticHabitatHumedadToMonitor, aquaticHabitatLimpiezaToMonitor, true);
                                aquaticHabitatToMonitor.monitorear();
                                break;
                            case 3:
                                // Monitor a terrestrial habitat
                                System.out.println("Enter the terrestrial habitat's temperature:");
                                float terrestrialHabitatTemperatureToMonitor = scanner.nextFloat();
                                System.out.println("Enter the terrestrial habitat's humedad:");
                                float terrestrialHabitatHumedadToMonitor = scanner.nextFloat();
                                System.out.println("Enter the terrestrial habitat's limpieza (true/false):");
                                boolean terrestrialHabitatLimpiezaToMonitor = scanner.nextBoolean();
                                HabitatTerrestres terrestrialHabitatToMonitor = new HabitatTerrestres(terrestrialHabitatTemperatureToMonitor, terrestrialHabitatHumedadToMonitor, terrestrialHabitatLimpiezaToMonitor, true);
                                terrestrialHabitatToMonitor.monitorear();
                                break;
                            case 4:
                                // Exit
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                        break;
                    case 2:
                        // Exit
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            case 3:
                // Exit
                break;
            default:
                System.out.println("Invalid option.");
        }

        // Visitor-related options
        System.out.println("1. Create a tour");
        System.out.println("2. Visit the zoo");
        System.out.println("3. Exit");

        int visitorChoice = scanner.nextInt();
        switch (visitorChoice) {
            case 1:
                // Create a tour
                System.out.println("1. Create a bird tour");
                System.out.println("2. Create a mammal tour");
                System.out.println("3. Create a children's tour");
                System.out.println("4. Exit");

                int createTourChoice = scanner.nextInt();
                switch (createTourChoice) {
                    case 1:
                        // Create a bird tour
                        TourAves birdTour = new TourAves();
                        System.out.println("Bird tour created: " + birdTour);
                        break;
                    case 2:
                        // Create a mammal tour
                        TourMamiferos mammalTour = new TourMamiferos();
                        System.out.println("Mammal tour created: " + mammalTour);
                        break;
                    case 3:
                        // Create a children's tour
                        TourNiños childrenTour = new TourNiños();
                        System.out.println("Children's tour created: " + childrenTour);
                        break;
                    case 4:
                        // Exit
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            case 2:
                // Visit the zoo
                System.out.println("1. Select a tour");
                System.out.println("2. Visit the zoo without a tour");
                System.out.println("3. Exit");

                int visitZooChoice = scanner.nextInt();
                switch (visitZooChoice) {
                    case 1:
                        // Select a tour
                        System.out.println("1. Bird tour");
                        System.out.println("2. Mammal tour");
                        System.out.println("3. Children's tour");
                        System.out.println("4. Exit");

                        int selectTourChoice = scanner.nextInt();
                        switch (selectTourChoice) {
                            case 1:
                                // Bird tour
                                QuioscoInteractivo quioscoInteractivo = new QuioscoInteractivo();
                                TourAves birdTourInteractive = new TourAves();
                                quioscoInteractivo.seleccionarTour(birdTourInteractive);
                                break;
                            case 2:
                                // Mammal tour
                                QuioscoInteractivo quioscoInteractivoMammal = new QuioscoInteractivo();
                                TourMamiferos mammalTourInteractive = new TourMamiferos();
                                quioscoInteractivoMammal.seleccionarTour(mammalTourInteractive);
                                break;
                            case 3:
                                // Children's tour
                                QuioscoInteractivo quioscoInteractivoChildren = new QuioscoInteractivo();
                                TourNiños childrenTourInteractive = new TourNiños();
                                quioscoInteractivoChildren.seleccionarTour(childrenTourInteractive);
                                break;
                            case 4:
                                // Exit
                                break;
                            default:
                                System.out.println("Invalid option.");
                        }
                        break;
                    case 2:
                        // Visit the zoo without a tour
                        System.out.println("Visiting the zoo without a tour...");
                        break;
                    case 3:
                        // Exit
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
                break;
            case 3:
                // Exit
                break;
            default:
                System.out.println("Invalid option.");
        }

        // Maintenance-related options
        System.out.println("1. Add a maintenance task");
        System.out.println("2. Show maintenance tasks");
        System.out.println("3. Exit");

        int maintenanceChoice = scanner.nextInt();
        switch (maintenanceChoice) {
            case 1:
                // Add a maintenance task
                System.out.println("Enter the task description:");
                String taskDescription = scanner.next();
                System.out.println("Enter the task type (regular/urgent):");
                String taskType = scanner.next();
                GestorMantenimiento gestorMantenimiento = new GestorMantenimiento();
                TareaMantenimiento tareaMantenimiento = new TareaMantenimiento(taskDescription, taskType);
                gestorMantenimiento.agregarTarea(tareaMantenimiento);
                System.out.println("Maintenance task added: " + tareaMantenimiento);
                break;
            case 2:
                // Show maintenance tasks
                System.out.println("Maintenance tasks:");
                GestorMantenimiento gestorMantenimientoShow = new GestorMantenimiento();
                gestorMantenimientoShow.mostrarTareasPendientes();
                break;
            case 3:
                // Exit
                break;
            default:
                System.out.println("Invalid option.");
        }

        // Resource-related options
        System.out.println("1. Add a resource");
        System.out.println("2. Show resources");
        System.out.println("3. Create a purchase order");
        System.out.println("4. Add a provider");
        System.out.println("5. Exit");

        int resourceChoice = scanner.nextInt();
        switch (resourceChoice) {
            case 1:
                // Add a resource
                System.out.println("Enter the resource name:");
                String resourceName = scanner.next();
                System.out.println("Enter the resource quantity:");
                int resourceQuantity = scanner.nextInt();
                AdministracionRecursos administracionRecursos = new AdministracionRecursos();
                Recurso recurso = new Recurso(resourceName, resourceQuantity);
                administracionRecursos.agregarRecurso(recurso);
                System.out.println("Resource added: " + recurso);
                break;
            case 2:
                // Show resources
                System.out.println("Resources:");
                AdministracionRecursos administracionRecursosShow = new AdministracionRecursos();
                administracionRecursosShow.mostrarInventario();
                break;
            case3:
            // Create a purchase order
            System.out.println("Enter the resource name to order:");
            String resourceNameToOrder = scanner.next();
            System.out.println("Enter the resource quantity to order:");
            int resourceQuantityToOrder = scanner.nextInt();
            Pedido pedido = new Pedido();
            Recurso recursoToOrder = new Recurso(resourceNameToOrder, resourceQuantityToOrder);
            pedido.agregarItem(recursoToOrder);
            System.out.println("Purchase order created: " + pedido);
            break3:
            // Create a purchase order
            System.out.println("Enter the resource name to order:");
            String resourceNameToOrder = scanner.;
            case next();
                System.out.println("Enter the resource quantity to order:");
                int resourceQuantity4:
                // Add a provider
                System.out.println("Enter the provider name:");
                String providerName = scanner.next();
                System.out.println("Enter the resources offered (commaToOrder = scanner.-separated):");
                String resourcesOffered = scanner.next();
                String[] resourcesOfferedArray = resourcesOffered.split(",");
                Proveedor proveedor = newnextInt();
                Pedido pedido = new Pedido();
                Recurso recursoToOrder = new Recurso(resourceNameToOrder, Proveedor( resourceQuantityToOrder);
                pedido.agregarItem(recursoToOrder);
                System.out.println("Purchase order created: " + pedido);
                break;
            case 4:
                // Add a provider
                System.out.println("Enter the provider name:");
                String providerName = scanner.next();
                System.out.println("Enter the resources offered (comma-separated):");
                String resourcesOffered = scanner.next();
                String[] resourcesOfferedArray = resourcesOffered.split(",");
                Proveedor proveedor = new Proveedor(providerName);
                for (String resourceOffered : resourcesOfferedArray) {
                    proveedor.agregarRecursoOfrecido(resourceOffered.trim());
                }
                System.out.println("Provider added: " + proveedor);
                break;
            case 5:
                // Exit
                break;
            default:
                System.out.println("Invalid option.");
        }

        // Security-related options
        System.out.println("1. Add a camera");
        System.out.println("2. Add a motion sensor");
        System.out.println("3. Monitor security devices");
        System.out.println("4. Exit");

        int securityChoice = scanner.nextInt();
        switch (securityChoice) {
            case 1:
                // Add a cameraproviderName);
                for (String resourceOffered : resourcesOfferedArray) {
                    proveedor.agregarRecursoOfrecido(resourceOffered.trim());
                }
                System.out.println("Provider added: " + proveedor);
                break;
            case 5:
                // Exit
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
