package ZOOLOGICO.MANTENIMIENTO;

public class Camara extends DispositivoSeguridad{


        public Camara(int ubicacion) {
            super(String.valueOf(ubicacion));
        }

        @Override
        public void monitorear() {
            System.out.println("Monitoreando a través de la cámara en la ubicación: " + ubicacion);
        }
    }

