package ZOOLOGICO.VISITANTES;

public class TourNiños extends tour {
    public TourNiños() {
        super("Tour especial para niños");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Incluye juegos y actividades interactivas.");
    }
}
