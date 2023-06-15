package model;

import intarfaces.GerenciarEmprestimo;

public abstract class ItemBiblioteca implements GerenciarEmprestimo {
    private static Long baseId = 0L;
    private Long id;
    private String titulo;

    private Boolean emprestado;

    public ItemBiblioteca(String titulo) {
        this.id = baseId++;
        this.titulo = titulo;
        this.emprestado = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + " - ";
    }
}

