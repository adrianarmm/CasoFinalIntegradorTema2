package ZOOLOGICO.MANTENIMIENTO;
import java.util.ArrayList;
import java.util.List;

public class GestorMantenimiento {
    private List<TareaMantenimiento> tareas;

    public GestorMantenimiento() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(TareaMantenimiento tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareasPendientes() {
        for (TareaMantenimiento tarea : tareas) {
            if (!tarea.isCompletada()) {
                System.out.println(tarea);
            }
        }
    }

    // Podríamos agregar más métodos según se necesiten, como buscar tareas, completar tareas, etc.
}
