
package ZOOLOGICO.MANTENIMIENTO;

import java.util.HashSet;
import java.util.Set;

public class SistemaSeguridad {
    private Set<DispositivoSeguridad> dispositivos;

    public SistemaSeguridad() {
        this.dispositivos = new HashSet<>();
    }

    public void agregarDispositivo(DispositivoSeguridad dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void monitorearZoologico() {
        for (DispositivoSeguridad dispositivo : dispositivos) {
            dispositivo.monitorear();
        }
    }
}
