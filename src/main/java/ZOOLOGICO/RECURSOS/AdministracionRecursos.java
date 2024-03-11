package ZOOLOGICO.RECURSOS;

    import java.util.HashMap;
import java.util.Map;

    public class AdministracionRecursos {
        private Map<String, Recurso> inventario;

        public AdministracionRecursos() {
            this.inventario = new HashMap<>();
        }

        public void agregarRecurso(Recurso recurso) {
            if(inventario.containsKey(recurso.getNombre())) {
                Recurso existente = inventario.get(recurso.getNombre());
                existente.setCantidad(existente.getCantidad() + recurso.getCantidad());
            } else {
                inventario.put(recurso.getNombre(), recurso);
            }
        }

        public void mostrarInventario() {
            for (Recurso recurso : inventario.values()) {
                System.out.println(recurso);
            }
        }
    }

}
