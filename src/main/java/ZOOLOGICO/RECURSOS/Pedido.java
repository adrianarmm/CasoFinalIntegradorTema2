package ZOOLOGICO.RECURSOS;

    import java.util.ArrayList;
    import java.util.List;

    public class Pedido {
        private List<Recurso> items;

        public Pedido() {
            this.items = new ArrayList<>();
        }

        public void agregarItem(Recurso item) {
            this.items.add(item);
        }

        public List<Recurso> getItems() {
            return items;
        }

        public void mostrarPedido() {
            for (Recurso item : items) {
                System.out.println(item);
            }
        }
    }


