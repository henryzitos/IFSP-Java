package model;

import exception.ComercializarException;

public class Servico extends Item{
    private Boolean disponivel;

    public Servico(String nome, Double valor) {
        super(nome, valor);
        this.disponivel = true;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return super.toString() + "Servico{" +
                "disponivel=" + disponivel +
                '}';
    }

    @Override
    public void comercializar() throws ComercializarException {
        if (disponivel == false)
            throw new ComercializarException("Serviço indisponivel");
        disponivel = false;
    }

    public void liberar() throws ComercializarException {
        if (disponivel == true)
            throw new ComercializarException("Serviço já disponivel");
        disponivel = true;
    }
}
