package ZOOLOGICO.ANIMALES;

public class acuatico extends animal {

    float aletas;
    float branquias;
    float escamas;
    String tipodeagua;

    public acuatico(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento, float aletas, float branquias, float escamas, String tipodeagua) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, id, salud, comportamiento);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipodeagua = tipodeagua;
    }

    public float isAletas() {
            return aletas;
        }

        public void setAletas(float aletas) {
            this.aletas = aletas;
        }

    public float isBranquias() {
        return branquias;
    }

    public void setBranquias(float branquias) {
        this.branquias = branquias;
    }

    public float isEscamas() {
        return escamas;
    }

    public void setEscamas(float escamas) {
        this.escamas = escamas;
    }

    public String getTipo_agua() {
        return tipodeagua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipodeagua = tipo_agua;
    }



}
