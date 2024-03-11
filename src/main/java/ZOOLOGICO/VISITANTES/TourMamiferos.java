package ZOOLOGICO.VISITANTES;

public class TourMamiferos extends Tour {
    public TourMamiferos() {
        super("Tour para amantes de los mamíferos");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Incluye visitas a los hábitats de mamíferos y charlas educativas.");
    }
}
