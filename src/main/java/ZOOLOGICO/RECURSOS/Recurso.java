package ZOOLOGICO.RECURSOS;

public class Recurso {public class Recurso {
    private String nombre;
    private int cantidad;

    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String
    toString() {
        return "Recurso{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
}
}
}


