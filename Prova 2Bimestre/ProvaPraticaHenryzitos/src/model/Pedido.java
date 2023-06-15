package model;

public class Pedido extends Orcamento {
    String dataEntrega;
    boolean entregue = false;

    void entregar(){
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
