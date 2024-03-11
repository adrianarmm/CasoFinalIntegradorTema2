package ZOOLOGICO.MANTENIMIENTO;

public class SensorMovimiento extends DispositivoSeguridad {

        public SensorMovimiento(String ubicacion) {
            super(ubicacion);
        }

        @Override
        public void monitorear() {
            System.out.println("Detectando movimiento en la ubicación: " + ubicacion);
        }
    }
