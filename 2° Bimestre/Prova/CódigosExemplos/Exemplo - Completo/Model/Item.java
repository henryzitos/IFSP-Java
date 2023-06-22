package model;

import inteface.ComercializarInterface;

public abstract class Item implements ComercializarInterface {
    private static Long idBase = 0L;
    private Long id;
    private String nome;
    private Double valor;

    public Item(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
        id = idBase++;
    }

    public static Long getIdBase() {
        return idBase;
    }

    public static void setIdBase(Long isBase) {
        Item.idBase = isBase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}

