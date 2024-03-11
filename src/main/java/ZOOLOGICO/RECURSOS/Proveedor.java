package ZOOLOGICO.RECURSOS;

import java.util.ArrayList;
import java.util.List;

    public class Proveedor {
        private String nombre;
        private List<String> recursosOfrecidos;

        public Proveedor(String nombre) {
            this.nombre = nombre;
            this.recursosOfrecidos = new ArrayList<>();
        }

        public void agregarRecursoOfrecido(String recurso) {
            recursosOfrecidos.add(recurso);
        }

        public String getNombre() {
            return nombre;
        }

        public List<String> getRecursosOfrecidos() {
            return recursosOfrecidos;
        }
    }

}
