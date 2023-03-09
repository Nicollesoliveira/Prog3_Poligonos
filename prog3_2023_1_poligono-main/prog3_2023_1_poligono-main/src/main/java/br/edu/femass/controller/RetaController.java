package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.femass.model.Ponto;
import br.edu.femass.model.Reta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class RetaController implements Initializable{
    @FXML
    private TextField TxtP1;

    @FXML
    private TextField TxtP2;

    @FXML
    private TextField TxtX1;

    @FXML
    private TextField TxtY1;

    @FXML
    private TextField TxtX2;

    @FXML
    private TextField TxtY2;

    @FXML
    private TextField TxtTamanho;


    @FXML
    private void BtnCalcularComPonto_click(ActionEvent action){
        Double p1 = Double.parseDouble(TxtP1.getText());
        Double p2 = Double.parseDouble(TxtP2.getText());
        Ponto p = new Ponto(p1,p2);
/*
        TxtTamanho.setText(
            p.getTamanho().toString()
        );
  */       
    }

    @FXML
    private void BtnCalcularComCoordenadas_click(ActionEvent action){
        Double x1 = Double.parseDouble(TxtX1.getText());
        Double y1 = Double.parseDouble(TxtY1.getText());
        Double x2 = Double.parseDouble(TxtX2.getText());
        Double y2 = Double.parseDouble(TxtY2.getText());

        Reta r = new Reta(x1,y1,x2,y2);

        TxtTamanho.setText(
            r.getTamanho().toString()
        );
        
    }

    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    
}
