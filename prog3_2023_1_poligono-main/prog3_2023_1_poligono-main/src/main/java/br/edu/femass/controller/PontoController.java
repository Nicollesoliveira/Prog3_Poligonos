package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.femass.model.Ponto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PontoController implements Initializable{
    @FXML
    private TextField TxtX;

    @FXML
    private TextField TxtY;

    @FXML
    private TextField TxtDistancia;

    @FXML
    private TextField TxtLocalizacao;

    @FXML
    private void BtnCalcular_click (ActionEvent action){
        Double x = Double.parseDouble(TxtX.getText());
        Double y = Double.parseDouble(TxtY.getText());

        Ponto p = new Ponto(x, y);
        TxtDistancia.setText(
            p.getDistancia(x,y).toString()
        );

        TxtLocalizacao.setText(
            p.getLocalizacao()
        );
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    
}
