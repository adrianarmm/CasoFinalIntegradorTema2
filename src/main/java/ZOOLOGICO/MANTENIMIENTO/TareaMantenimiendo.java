

package ZOOLOGICO.MANTENIMIENTO;
public class TareaMantenimiento {
    private String descripcion;
    private String tipo; // Regular o Urgente
    private boolean completada;

    public TareaMantenimiento(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.completada = false;
    }

    // Métodos getter y setter
    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void completarTarea() {
        this.completada = true;
    }

    @Override
    public String toString() {
        return "TareaMantenimiento{" +
                "descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", completada=" + completada +
                '}';
    }
}
