package intarfaces;

import exceptions.DevolverException;
import exceptions.EmprestarException;

public interface GerenciarEmprestimo {
    public void emprestar() throws EmprestarException;
    public void devolver() throws DevolverException;
}
