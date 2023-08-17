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
    @Column
    private List<Produto> listaProdutos = new ArrayList<>();

    public Pedido(Pessoa cliente, List<Produto> listaProdutos) {
        this.cliente = cliente;
        this.listaProdutos = listaProdutos;
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
}
