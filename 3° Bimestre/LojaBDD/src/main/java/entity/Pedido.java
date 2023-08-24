package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="Pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NomeCliente")
    private Pessoa cliente;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "PedidoProduto", joinColumns = @JoinColumn(name = "idPedido"), inverseJoinColumns = @JoinColumn(name = "idProduto"))
    private List<Produto> listaProdutos;
    @Column
    private double precoTotal;

    public Pedido(Pessoa cliente, List<Produto> listaProdutos, double precoTotal) {
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
        this.precoTotal = precoTotal;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    @Override
    public String toString() {
        return "Pedido |" + "id=" + id + ", cliente=" + cliente + ", listaProdutos=" + listaProdutos;
    }
}
