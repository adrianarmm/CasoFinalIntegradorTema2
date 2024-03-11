package ZOOLOGICO.VISITANTES;

public abstract class tour {
    protected String descripcion;

    public tour(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void mostrarTour();
}

public class TourAves extends tour {
    public TourAves() {
        super("Tour para aficionados a las aves");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Observación de aves y explicaciones sobre diferentes especies. Incluye recomendaciones para la mejor experiencia de observación.");
    }
}

public class TourMamiferos extends tour {
    public TourMamiferos() {
        super("Tour para amantes de los mamíferos");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": Visita a los hábitats de mamíferos y charlas sobre su cuidado y comportamiento. Aprende sobre las especies en peligro de extinción y cómo contribuir a su conservación.");
    }
}


