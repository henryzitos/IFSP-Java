package model;

import exceptions.DevolverException;
import exceptions.EmprestarException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {
    List<ItemBiblioteca> itensBiblioteca = new ArrayList<>();

    public void  adicionarItem(ItemBiblioteca item){
        itensBiblioteca.add(item);
    }

    public void listarItens(){
        for (ItemBiblioteca i: itensBiblioteca) {
            System.out.println(i);
        }
    }

    public void emprestrarItem(Integer id){
        for (ItemBiblioteca i: itensBiblioteca) {
            if (i.getId() == id.longValue()) {
                try {
                    i.emprestar();
                } catch (EmprestarException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
    }

    public void devolverItem(Integer id){
        for (ItemBiblioteca i: itensBiblioteca) {
            if (i.getId() == id.longValue()) {
                try {
                    i.devolver();
                } catch (DevolverException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
    }
}
