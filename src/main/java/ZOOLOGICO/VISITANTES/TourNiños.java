package ZOOLOGICO.VISITANTES;

public class TourNiños extends Tour {
    public TourNiños() {
        super("Tour especial para niños");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Este tour incluye juegos y actividades interactivas.");
    }
}
