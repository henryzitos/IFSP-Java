public class Pessoal extends Contas implements Gastar, Retirada {
    private String CPF;

    public Pessoal(Double saldo, String CPF) {
        super(saldo);
        this.CPF = CPF;
    }

    @Override
    public Double comprar(Double valorCompra) {
        setSaldo(getSaldo() - valorCompra);
        return getSaldo();
    }

    @Override
    public Double sacar(Double valor) {
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }

    @Override
    public Double dividir(int divisor) throws Exception {
        if (divisor == 0)
            throw new Exception("Impossivel dividir");
        setSaldo(getSaldo()/divisor);
        return getSaldo();
    }
}
