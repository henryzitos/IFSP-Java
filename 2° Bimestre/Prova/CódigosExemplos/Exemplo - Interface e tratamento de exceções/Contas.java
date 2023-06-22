public abstract class Contas {
    private Double saldo;

    public Contas(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }
}

