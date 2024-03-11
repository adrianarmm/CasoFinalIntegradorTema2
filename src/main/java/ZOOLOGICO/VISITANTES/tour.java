package ZOOLOGICO.VISITANTES;

public abstract class tour {
    protected String descripcion;

    public tour(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void mostrarTour();
}

