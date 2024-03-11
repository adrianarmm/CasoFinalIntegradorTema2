package ZOOLOGICO.VISITANTES;

    public abstract class Tour {
        protected String descripcion;

        public Tour(String descripcion) {
            this.descripcion = descripcion;
        }

        public abstract void mostrarTour();
    }
