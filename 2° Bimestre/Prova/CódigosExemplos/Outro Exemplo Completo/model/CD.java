package model;

import exceptions.DevolverException;
import exceptions.EmprestarException;

public class CD extends ItemBiblioteca{
    private String artista;

    public CD(String titulo, String artista) {
        super(titulo);
        this.artista = artista;
    }

    @Override
    public void emprestar() throws EmprestarException {
        if (super.getEmprestado().equals(Boolean.TRUE))
            throw new EmprestarException(this.toString());
        super.setEmprestado(true);
        System.out.println("O CD " + super.getTitulo() + " do artista " + this.artista + " foi emprestado!");
    }

    @Override
    public void devolver() throws DevolverException {
        if (super.getEmprestado().equals(Boolean.FALSE))
            throw new DevolverException(this.toString());
        super.setEmprestado(false);
        System.out.println("O CD " + super.getTitulo() + " do artista " + this.artista + " foi devolvido!");
    }

    @Override
    public String toString() {
        return super.toString() + artista;
    }
}
