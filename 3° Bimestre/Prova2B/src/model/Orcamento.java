package model;

import model.*;
import repository.ExibirInterface;

import java.util.ArrayList;
import java.util.List;

import repository.ExibirInterface;

public class Orcamento implements ExibirInterface{
    private static long idBase = 0L;
    private long id;
    private List<ItemPedido> itens = new ArrayList();
    private double valorTotal;
    //Não tinha declarado eles como "private".


    public Orcamento(List<ItemPedido> itens, double valorTotal) {
        this.id = idBase++;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    void addItem(ItemPedido Item){
        itens.add(Item);
    }

    void removerItem(Long ID){
    }

    public static long getIdBase() {
        return idBase;
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
