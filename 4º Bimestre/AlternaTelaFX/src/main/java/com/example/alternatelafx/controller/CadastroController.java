package com.example.alternatelafx.controller;

import com.example.alternatelafx.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CadastroController {
    @FXML
    void clickLista(ActionEvent event) {
        HelloApplication.mudarTela("lista");
        System.out.println("Clicou em Adicionar Item");
    }
}
