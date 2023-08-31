package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Aluno {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String prontuario;
    @Column
    private String senha;
    @Column
    private String nome;
    @Column
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinTable (name = "Aluno_Nota", joinColumns = @JoinColumn (name = "aluno_id"), inverseJoinColumns = @JoinColumn (name = "nota_id"))
    private List<Nota> notas;
    @Column
    private double media;

    public Aluno(String nome, String prontuario, String senha, double media) {
        this.prontuario = prontuario;
        this.senha = senha;
        this.nome = nome;
        this.notas = notas;
        this.media = media;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
