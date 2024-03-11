package ZOOLOGICO.VISITANTES;

public class TourMamiferos extends tour{
    public TourMamiferos() {
        super("Tour para amantes de los mamíferos");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Visita a los hábitats de mamíferos y charlas sobre su cuidado y comportamiento. Aprende sobre las especies en peligro de extinción y cómo contribuir a su conservación.");
    }
}
