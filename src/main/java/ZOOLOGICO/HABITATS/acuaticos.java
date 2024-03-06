package ZOOLOGICO.HABITATS;


public class acuaticos extends habitats{

    boolean puede_nadar;

    public acuaticos(float temperatura,float humedad,boolean limpieza,boolean puede_nadar) {
        super(temperatura, humedad, limpieza);
        this.puede_nadar = puede_nadar;
    }


    @Override
    public String toString() {
        return "acuaticos []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }



    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }


    public boolean isPuede_nadar() {
        return puede_nadar;
    }


    public void setPuede_nadar(boolean puede_nadar) {
        this.puede_nadar = puede_nadar;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = Float.parseFloat(temperatura);
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
}

