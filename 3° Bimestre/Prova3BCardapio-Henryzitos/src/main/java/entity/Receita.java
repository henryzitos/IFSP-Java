package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Receita {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Double custo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receitas")
    @JoinColumn(name = "ListaIngredientes")
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Receita(Double custo) {
        this.custo = custo;
        this.ingredientes = ingredientes;
    }

    public void addIngredientes(Ingrediente i) {
        ingredientes.add(i);
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "id=" + id +
                ", custo=" + custo +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
