package ZOOLOGICO;

import ZOOLOGICO.ANIMALES.*;
import ZOOLOGICO.HABITATS.*;
import ZOOLOGICO.VISITANTES.*;
import ZOOLOGICO.MANTENIMIENTO.*;
import ZOOLOGICO.RECURSOS.*;

public class ZooApp {
    public static void main(String[] args) {
        // Crear algunos animales
        animal leon = new terrestre("Simba", "Felino", "León", "Amarillo", "M", "10 años", "190kg", "1.2m", "Carnívoro", "Sabana", "Carne", "Vivíparo", "Regular", "Ninguna", "Ninguna", 1, true, true, true, true, true, "Sabana");
        animal tiburon = new acuatico("Bruce", "Pez", "Tiburón Blanco", "Gris", "M", "15 años", "600kg", "4m", "Carnívoro", "Océano", "Peces", "Ovovivíparo", "Regular", "Ninguna", "Ninguna", 2, true, false, true, true, true, "Salada");

        // Crear un hábitat
        habitats savana = new terrestres(35, 40, true, true);

        // Crear tours
        Tour tourAves = new TourAves();
        Tour tourNiños = new TourNiños();
        QuioscoInteractivo quiosco = new QuioscoInteractivo();

        // Seleccionar un tour
        quiosco.seleccionarTour(tourAves);
        quiosco.seleccionarTour(tourNiños);

        // Gestión de mantenimiento
        Camara camara = new Camara("Entrada Principal");
        SensorMovimiento sensor = new SensorMovimiento("Cerca de los felinos");
        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        sistemaSeguridad.agregarDispositivo(camara);
        sistemaSeguridad.agregarDispositivo(sensor);

        // Administración de recursos
        Recurso carne = new Recurso("Carne", 500);
        AdministracionRecursos adminRecursos = new AdministracionRecursos();
        adminRecursos.agregarRecurso(carne);

        // Mostrar estado actual del inventario de recursos
        adminRecursos.mostrarInventario();
    }
}
