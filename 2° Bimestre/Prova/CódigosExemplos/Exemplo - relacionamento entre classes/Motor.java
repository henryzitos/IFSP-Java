public class Motor {
    private int potencia;
    private int valvulas;

    public Motor(int potencia, int valvulas){
        this.potencia = potencia;
        this.valvulas = valvulas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }
}
