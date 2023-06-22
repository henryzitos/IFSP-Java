package model;

import exceptions.DevolverException;
import exceptions.EmprestarException;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void emprestar() throws EmprestarException {
        if (super.getEmprestado().equals(Boolean.TRUE))
            throw new EmprestarException(this.toString());
        super.setEmprestado(true);
        System.out.println("O livro " + super.getTitulo() + " do autor " + this.autor + " foi emprestado!");
    }

    @Override
    public void devolver() throws DevolverException {
        if (super.getEmprestado().equals(Boolean.FALSE))
            throw new DevolverException(this.toString());
        super.setEmprestado(false);
        System.out.println("O livro " + super.getTitulo() + " do autor " + this.autor + " foi devolvido!");
    }

    @Override
    public String toString() {
        return super.toString() + autor;
    }
}
