package model;

import exception.ComercializarException;

public class Produto extends Item{
    private Integer estoque;

    public Produto(String nome, Double valor, Integer estoque) {
        super(nome, valor);
        this.estoque = estoque;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return super.toString() + "Produto{" +
                "estoque=" + estoque +
                '}';
    }

    @Override
    public void comercializar() throws ComercializarException {
        if (estoque <= 0)
            throw new ComercializarException("Sem estoque");
        estoque -= estoque;
    }
}
