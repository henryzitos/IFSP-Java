import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String renavam;
    private String cor;
    private Motor motor;
    private List<Roda> rodas = new ArrayList<>();

    public Carro(String renavam, String cor, Motor motor){
        this.renavam = renavam;
        this.cor = cor;
        this.motor = motor;
    }

    public List<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }

    public void addRodas(Roda roda){
        rodas.add(roda);
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
