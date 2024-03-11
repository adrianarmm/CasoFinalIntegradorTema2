package ZOOLOGICO.VISITANTES;

public class TourNinos extends tour {
    public TourNinos() {
        super("Tour especial para niños");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": incluye juegos y actividades interactivas diseñadas para educar y entretener a los niños.");
    }
}

public class TourNinos extends tour {
    public TourNinos() {
        super("Tour especial para niños");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": incluye juegos y actividades interactivas diseñadas para educar y entretener a los niños.");
    }
}

public class TourAves extends Tour {
    public TourAves() {
        super("Tour para aficionados a las aves");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": ofrece observación de aves, información sobre diferentes especies y consejos para los aficionados.");
    }
}


public class TourMamiferos extends Tour {
    public TourMamiferos() {
        super("Tour para amantes de los mamíferos");
    }

    @Override
    public void mostrarTour() {
        System.out.println(descripcion + ": incluye visitas a los hábitats de los mamíferos y charlas sobre su comportamiento y conservación.");
    }
}








