package ZOOLOGICO.MANTENIMIENTO;

public class prueba {

        public static void main(String[] args) {
            // Sistema de mantenimiento
            GestorMantenimiento gestorMantenimiento = new GestorMantenimiento();
            gestorMantenimiento.agregarTarea(new TareaMantenimiento("Reparación de la cerca del león", "Urgente"));
            gestorMantenimiento.agregarTarea(new TareaMantenimiento("Revisión de sensores de movimiento", "Urgente"));
            gestorMantenimiento.agregarTarea(new TareaMantenimiento("Revision camaras de seguridad", "Urgente"));

