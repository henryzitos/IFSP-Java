package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table
public class Turma {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String codigo;
    @Column
    private Professor professor;
    @JoinColumn(name = "Alunos")
    private List<Aluno> alunos;
    @Column
    private int horario;

    public Turma(String codigo, Professor professor, List<Aluno> alunos, int horario) {
        this.codigo = codigo;
        this.professor = professor;
        this.alunos = alunos;
        this.horario = horario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
}
