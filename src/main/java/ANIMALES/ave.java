package ANIMALES;

public class ave extends animal {

    boolean vuela;
    boolean pico;
    boolean plumaje;
    String tipodeave;

    public ave (String nombre, String especie, String raza, String color, String sexo, String edad,
                          String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion,
                          String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento,  boolean vuela, boolean pico,
                          boolean plumaje, String tipo_aviario) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados,
                enfermedades, vacunas, id, salud, comportamiento);
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
        this.tipodeave = tipo_aviario;
    }
}
