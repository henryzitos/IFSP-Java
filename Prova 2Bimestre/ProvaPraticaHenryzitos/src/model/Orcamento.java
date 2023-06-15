package model;

import model.*;
import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

import repository.ExibirInterface;

public class Orcamento implements ExibirInterface{
    static long idBase = 0L;
    long id;
    List<ItemPedido> itens = new ArrayList();
    double valorTotal;

    void addItem(ItemPedido Item){
        itens.add(Item);
    }

    void removerItem(Long ID){
    }

    public long getId() {
        return id;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public void exibir(Boolean cr) {
        if (cr == true){
        }
    }

}
