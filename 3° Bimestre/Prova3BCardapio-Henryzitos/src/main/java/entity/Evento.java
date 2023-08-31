package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Evento {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Cardapio cardapio;
    @Column
    private String nome;
    @Column
    private Double orcamento;

    public Evento(String nome, Double orcamento) {
        this.cardapio = cardapio;
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public void addCardapio(Cardapio c){
        if (orcamento > c.valorTotal()){
            cardapio = c;
        } else {
            System.err.println("Seu orçamento é menor do que o valor desse cardapio!");
        }
    }

    public Evento(){

    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", cardapio=" + cardapio +
                ", nome='" + nome + '\'' +
                ", orcamento=" + orcamento +
                '}';
    }
}
