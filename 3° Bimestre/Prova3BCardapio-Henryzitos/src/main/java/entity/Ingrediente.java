package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Ingrediente {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private Double peso;
    @Column
    private String unidade;

    public Ingrediente(String nome, Double peso, String unidade) {
        this.unidade = unidade;
        this.peso = peso;
        this.nome = nome;
    }

    public Ingrediente() {

    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                ", unidade='" + unidade + '\'' +
                '}';
    }
}
