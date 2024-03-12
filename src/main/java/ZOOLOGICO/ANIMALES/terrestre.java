package ZOOLOGICO.ANIMALES;

public class terrestre extends animal {

    float patas;
    float cola;
    float pelaje;
    String tipo_terrestre;

    public terrestre(String nombre, String especie, String raza, String color, String sexo, String edad,
                     String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                     String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento, float patas, float cola,
                     float pelaje, String tipo_terrestre) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
                enfermedades, vacunas, id, salud, comportamiento);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
        this.tipo_terrestre = tipo_terrestre;
    }

    public float isPatas() {
        return patas;
    }

    public void setPatas(float patas) {
        this.patas = patas;
    }

    public float isCola() {
        return cola;
    }

    public void setCola(float cola) {
        this.cola = cola;
    }

    public float isPelaje() {
        return pelaje;
    }

    public void setPelaje(float pelaje) {
        this.pelaje = pelaje;
    }

    public String getTipo_terrestre() {
        return tipo_terrestre;
    }

    public void setTipo_terrestre(String tipo_terrestre) {
        this.tipo_terrestre = tipo_terrestre;
    }



}
