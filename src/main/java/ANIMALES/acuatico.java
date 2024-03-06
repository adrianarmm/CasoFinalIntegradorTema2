package ANIMALES;

public class acuatico extends animal {

    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipodeagua;

    public acuatico(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, int id, boolean salud, boolean comportamiento, boolean aletas, boolean branquias, boolean escamas, String tipodeagua) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, id, salud, comportamiento);
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipodeagua = tipodeagua;
    }

    public boolean isAletas() {
            return aletas;
        }

        public void setAletas(boolean aletas) {
            this.aletas = aletas;
        }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getTipo_agua() {
        return tipodeagua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipodeagua = tipo_agua;
    }



}
