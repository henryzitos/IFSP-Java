package model;

public class Pedido extends Orcamento {
    private String dataEntrega;
    private boolean entregue = false;
    //Não declarei com "private".

    public Pedido(String dataEntrega){
        this.dataEntrega = dataEntrega;
    }

    void entregar(){
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
