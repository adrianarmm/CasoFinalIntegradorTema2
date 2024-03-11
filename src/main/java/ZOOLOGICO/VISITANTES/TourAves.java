package ZOOLOGICO.VISITANTES;

public class TourAves extends Tour {
    public TourAves() {
        super("Tour para aficionados a las aves");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Aprenderás sobre diferentes especies de aves y sus hábitats.");
    }
}
