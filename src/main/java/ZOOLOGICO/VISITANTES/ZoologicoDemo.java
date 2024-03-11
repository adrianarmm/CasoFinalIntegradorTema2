package ZOOLOGICO.VISITANTES;

    public class ZoologicoDemo {
        public static void main(String[] args) {
            QuioscoInteractivo quiosco = new QuioscoInteractivo();

            Tour tourNinos = new TourNiños();
            Tour tourAves = new TourAves();
            Tour tourMamiferos = new TourMamiferos();

            // Simulación de un visitante eligiendo un tour para niños
            System.out.println("Seleccionando el tour para niños:");
            quiosco.seleccionarTour(tourNinos);

            // Simulación de otro visitante eligiendo el tour para aficionados a las aves
            System.out.println("\nSeleccionando el tour para aficionados a las aves:");
            quiosco.seleccionarTour(tourAves);
        }
    }

