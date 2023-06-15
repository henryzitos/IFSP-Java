public class Empresarial extends Contas implements Retirada {
    private String CNPJ;

    public Empresarial(Double saldo, String CNPJ) {
        super(saldo);
        this.CNPJ = CNPJ;
    }

    @Override
    public Double sacar(Double valor) {
        setSaldo(getSaldo() - valor - (valor * 0.005));
        return getSaldo();
    }

    @Override
    public Double dividir(int divisor) {
        setSaldo(getSaldo()/divisor);
        return getSaldo();
    }
}
