public class Infantil extends Contas implements Gastar{

    public Infantil(Double saldo) {
        super(saldo);
    }

    @Override
    public Double comprar(Double valorCompra) {
        setSaldo(getSaldo() - (valorCompra/2));
        return getSaldo();
    }
}
