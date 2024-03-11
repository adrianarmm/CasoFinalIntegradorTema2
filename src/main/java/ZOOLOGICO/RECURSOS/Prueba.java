package ZOOLOGICO.RECURSOS;

public class Prueba {
        public static void main(String[] args) {
            AdministracionRecursos adminRecursos = new AdministracionRecursos();

            // Agregando recursos al inventario
            adminRecursos.agregarRecurso(new Recurso("Alimento para elefantes", 100));
            adminRecursos.agregarRecurso(new Recurso("Vitaminas para aves", 50));

            // Mostrando el inventario
            System.out.println("Inventario actual:");
            adminRecursos.mostrarInventario();

            // Creando y mostrando un pedido
            Pedido pedido = new Pedido();
            pedido.agregarItem(new Recurso("Juguetes para monos", 20));
            System.out.println("\nPedido realizado:");
            pedido.mostrarPedido();

            // Agregando el pedido al inventario
            for (Recurso item : pedido.getItems()) {
                adminRecursos.agregarRecurso(item);
            }

            // Inventario después del pedido
            System.out.println("\nInventario después del pedido:");
            adminRecursos.mostrarInventario();
        }
    }

