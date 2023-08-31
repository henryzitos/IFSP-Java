package entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table (name = "Boletim")
public class Nota {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @ManyToOne
    @JoinColumn(name = "Turma")
    private Turma turma;
    @Column
    private double nota;

    public Nota(Turma turma, double nota) {
        this.turma = turma;
        this.nota = nota;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
