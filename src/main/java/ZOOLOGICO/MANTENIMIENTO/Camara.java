package ZOOLOGICO.MANTENIMIENTO;

public class Camara extends DispositivoSeguridad{


        public Camara(String ubicacion) {
            super(ubicacion);
        }

        @Override
        public void monitorear() {
            System.out.println("Monitoreando a través de la cámara en la ubicación: " + ubicacion);
        }
    }

