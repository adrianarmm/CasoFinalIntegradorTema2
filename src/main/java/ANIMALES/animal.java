package ANIMALES;

public class animal {

    String nombre;
    String especie;
    String raza;
    String color;
    String sexo;
    String edad;
    String peso;
    String altura;
    String tipo;
    String habitat;
    String alimentacion;
    String reproduccion;
    String cuidados;
    String enfermedades;
    String vacunas;
    boolean salud;
    boolean comportamiento;
    int id;

    public animal(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.tipo = tipo;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.reproduccion = reproduccion;
        this.cuidados = cuidados;
        this.enfermedades = enfermedades;
        this.vacunas = vacunas;
        this.id = id;
        this.salud = salud;
        this.comportamiento = comportamiento;
    }

    @Override
    public String toString() {
        return "animal []";
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
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


}

