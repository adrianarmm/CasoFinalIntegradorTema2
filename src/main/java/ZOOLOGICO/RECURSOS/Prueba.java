package ZOOLOGICO.RECURSOS;

public class Prueba {
    public static void main(String[] args) {
        // Creación de la instancia de AdministracionRecursos para gestionar el inventario
        AdministracionRecursos adminRecursos = new AdministracionRecursos();

        // Agregando recursos al inventario
        adminRecursos.agregarRecurso(new Recurso("Alimento para elefantes", 100));
        adminRecursos.agregarRecurso(new Recurso("Vitaminas para aves", 50));

        // Mostrando el estado actual del inventario
        System.out.println("Inventario actual:");
        adminRecursos.mostrarInventario();

        // Creación de un nuevo pedido y agregando items al mismo
        Pedido pedido = new Pedido();
        pedido.agregarItem(new Recurso("Juguetes para monos", 20));

        // Mostrando los detalles del pedido realizado
        System.out.println("\nPedido realizado:");
        pedido.mostrarPedido();

        // Agregando los items del pedido al inventario
        for (Recurso item : pedido.getItems()) {
            adminRecursos.agregarRecurso(item);
        }

        // Mostrando el inventario después de procesar el pedido
        System.out.println("\nInventario después del pedido:");
        adminRecursos.mostrarInventario();
    }
}
