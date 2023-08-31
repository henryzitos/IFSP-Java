package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Professor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String prontuario;
    @Column
    private String senha;
    @Column
    private String nome;
    @Column
    private String cpf;

    public Professor(String prontuario, String senha, String nome, String cpf) {
        this.prontuario = prontuario;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
