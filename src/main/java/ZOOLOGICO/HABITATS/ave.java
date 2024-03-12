package ZOOLOGICO.HABITATS;

public class ave extends habitats {
    boolean puede_volar;

    public ave(float temperatura,float humedad,boolean limpieza, boolean puede_volar) {
        super();
        this.puede_volar = puede_volar;
    }

    public ave(float temperatura, float humedad, boolean limpieza) {
        super();
    }

    public ave(float temperaturaAviario) {
        super();
    }

    public String toString() {
        return "aviario []";
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isPuede_volar() {
        return puede_volar;
    }

    public void setPuede_volar(boolean puede_volar) {
        this.puede_volar = puede_volar;
    }



    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = Float.parseFloat(humedad);
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = Float.parseFloat(temperatura);
    }
}
