package com.example.alternatelafx.controller;

import com.example.alternatelafx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListaController {
    @FXML
    void clickCadastro(ActionEvent event) {
        HelloApplication.mudarTela("cadastro");
        System.out.println("Clicou em Adicionar");
    }

}

