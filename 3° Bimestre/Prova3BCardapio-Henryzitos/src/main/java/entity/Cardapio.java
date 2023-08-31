package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Cardapio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CardapioReceitas", joinColumns = @JoinColumn(name = "idCardapio"), inverseJoinColumns = @JoinColumn(name = "idReceita"))
    private List<Receita> receitas = new ArrayList<>();

    public Cardapio() {
        this.receitas = receitas;
    }

    public void addReceitas(Receita r){
        receitas.add(r);
    }

    public float valorTotal(){
        double valorT = 0;
        for (Receita r: receitas) {
            valorT = valorT + r.getCusto();
        }
        return (float) valorT;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "id=" + id +
                ", receitas=" + receitas +
                '}';
    }
}
