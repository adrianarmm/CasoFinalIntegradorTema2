package ZOOLOGICO.VISITANTES;

public class MAIN {
    public static void main(String[] args) {
        QuioscoInteractivo quiosco = new QuioscoInteractivo();

        tour tourNinos = new TourNiños();
        tour tourAves = new TourAves();
        tour tourMamiferos = new TourMamiferos();

        // Ejemplo de selección de un tour por un visitante
        System.out.println("Tour seleccionado para niños:");
        quiosco.seleccionarTour(tourNinos);

        System.out.println("\nTour seleccionado para aficionados a las aves:");
        quiosco.seleccionarTour(tourAves);

        System.out.println("\nTour seleccionado para amantes de los mamíferos:");
        quiosco.seleccionarTour(tourMamiferos);
    }
}

