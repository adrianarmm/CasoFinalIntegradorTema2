package ZOOLOGICO.ANIMALES;

public class ave extends animal {

    float vuela;
    float pico;
    float plumaje;
    String tipodeave;

    public ave (String nombre, String especie, String raza, String color, String sexo, String edad,
                String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento, float vuela, float pico,
                float plumaje, String tipo_aviario) {
        super(nombre
        );
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipodeave = tipo_aviario;
    }

    public float isVuela() {
        return vuela;
    }

    public void setVuela(float vuela) {
        this.vuela = vuela;
    }

    public float isPico() {
        return pico;
    }

    public void setPico(float pico) {
        this.pico = pico;
    }

    public float isPlumaje() {
        return plumaje;
    }

    public void setPlumaje(float plumaje) {
        this.plumaje = plumaje;
    }

    public String getTipo_aviario() {
        return tipodeave;
    }

    public void setTipo_aviario(String tipo_aviario) {
        this.tipodeave = tipo_aviario;
    }

}

