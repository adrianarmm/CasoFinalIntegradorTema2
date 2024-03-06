package ZOOLOGICO.ANIMALES.HABITATS.HABITATS;

public class habitats {
    float temperatura;
    float humedad;
    boolean limpieza;

    public habitats(float temperatura,float humedad,boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    @Override
    public String toString() {
        return "habitats []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}
