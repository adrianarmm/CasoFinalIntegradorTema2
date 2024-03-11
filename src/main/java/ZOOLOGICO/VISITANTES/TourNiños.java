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
public class TourAves extends tour {
    public TourAves() {
        super("Tour para aficionados a las aves");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Observación de aves y explicaciones sobre diferentes especies.");
    }
}

public class TourMamiferos extends tour {
    public TourMamiferos() {
        super("Tour para amantes de los mamíferos");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Visita a los hábitats de mamíferos y charlas sobre su cuidado.");
    }
}
