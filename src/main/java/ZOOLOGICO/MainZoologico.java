package ZOOLOGICO;

import ZOOLOGICO.ANIMALES.*;
import ZOOLOGICO.HABITATS.*;
import ZOOLOGICO.VISITANTES.*;
import ZOOLOGICO.MANTENIMIENTO.*;
import ZOOLOGICO.RECURSOS.*;

import java.util.Scanner;

public class MainZoologico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("Bienvenido al Sistema de Gestión del Zoológico");
            System.out.println("1. Gestión de Animales");
            System.out.println("2. Gestión de Habitats");
            System.out.println("3. Gestión de Visitantes y Tours");
            System.out.println("4. Gestión de Mantenimiento y Seguridad");
            System.out.println("5. Gestión de Recursos");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionAnimales(scanner);
                    break;
                case 2:
                    // Aquí podrías llamar a una función similar para gestionar los hábitats
                    break;
                case 3:
                    gestionTours(scanner);
                    break;
                case 4:
                    // Funciones de gestión de mantenimiento y seguridad
                    break;
                case 5:
                    // Funciones de gestión de recursos
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        }
    }

    private static void gestionAnimales(Scanner scanner) {
        // Ejemplo de cómo podrías estructurar la creación de un animal
        System.out.println("Creación de un nuevo animal");
        // Aquí solicitarías los datos necesarios al usuario y crearías el animal
        // Por ejemplo, podrías tener métodos para registrarAlimentacion, registrarReproduccion, etc.
    }

    private static void gestionTours(Scanner scanner) {
        QuioscoInteractivo quiosco = new QuioscoInteractivo();
        Tour tourAves = new TourAves();
        Tour tourMamiferos = new TourMamiferos();
        Tour tourNiños = new TourNiños();

        System.out.println("Seleccione el Tour que desea:");
        System.out.println("1. Tour de Aves");
        System.out.println("2. Tour de Mamíferos");
        System.out.println("3. Tour para Niños");
        int opcionTour = scanner.nextInt();

        switch (opcionTour) {
            case 1:
                quiosco.seleccionarTour(tourAves);
                break;
            case 2:
                quiosco.seleccionarTour(tourMamiferos);
                break;
            case 3:
                quiosco.seleccionarTour(tourNiños);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    private static void gestionHabitats(Scanner scanner) {
        System.out.println("Gestión de Hábitats");
        System.out.println("1. Registrar un nuevo hábitat");
        System.out.println("2. Mostrar hábitats");
        // Aquí puedes expandir las opciones como necesites (editar, eliminar, etc.)
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                // Lógica para registrar un nuevo hábitat
                break;
            case 2:
                // Lógica para mostrar todos los hábitats
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void gestionMantenimientoYSeguridad(Scanner scanner) {
        System.out.println("Gestión de Mantenimiento y Seguridad");
        System.out.println("1. Registrar dispositivo de seguridad");
        System.out.println("2. Registrar tarea de mantenimiento");
        // Más opciones como necesites
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                // Registrar dispositivo de seguridad
                break;
            case 2:
                // Registrar tarea de mantenimiento
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void gestionRecursos(Scanner scanner) {
        System.out.println("Gestión de Recursos");
        System.out.println("1. Agregar recurso al inventario");
        System.out.println("2. Mostrar inventario");
        // Y otras opciones relacionadas
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                // Lógica para agregar un recurso al inventario
                break;
            case 2:
                // Lógica para mostrar el inventario
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    // Lugar para más métodos de gestión según sea necesario

// Final de MainZoologico.java

}
