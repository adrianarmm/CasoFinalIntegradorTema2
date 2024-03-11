package ZOOLOGICO.MANTENIMIENTO;

public abstract class DispositivoSeguridad {
    protected String ubicacion;

    public DispositivoSeguridad(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public abstract void monitorear();
}

