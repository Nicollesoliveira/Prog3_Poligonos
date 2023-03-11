package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.femass.model.Retangulo;
import br.edu.femass.model.Reta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

/* Initializable (contrato) é uma interface que obriga a todo mundo que fizer um controller
precisa inserir o método obridatório, fazendo com que a tela funcione. E caso não 
tenha esse método, não é possível a realização da classe.
 */
public class RetanguloController implements Initializable {

    @FXML
    private TextField TxtX1_Reta1;

    @FXML
    private TextField TxtY1_Reta1;

    @FXML
    private TextField TxtX2_Reta1;

    @FXML
    private TextField TxtY2_Reta1;

    @FXML
    private TextField TxtX1_Reta2;

    @FXML
    private TextField TxtY1_Reta2;

    @FXML
    private TextField TxtX2_Reta2;

    @FXML
    private TextField TxtY2_Reta2;

    @FXML
    private TextField TxtArea;

    @FXML
    private TextField TxtPerimetro;

    @FXML
    private void BtnCalcular_click (ActionEvent action){
        try{
            Double R1x1 = Double.parseDouble(TxtX1_Reta1.getText());
            Double R1y1 = Double.parseDouble(TxtY1_Reta1.getText());
            Double R1x2 = Double.parseDouble(TxtX2_Reta1.getText());
            Double R1y2 = Double.parseDouble(TxtY2_Reta1.getText());

            Double R2x1 = Double.parseDouble(TxtX1_Reta2.getText());
            Double R2y1 = Double.parseDouble(TxtY1_Reta2.getText());
            Double R2x2 = Double.parseDouble(TxtX2_Reta2.getText());
            Double R2y2 = Double.parseDouble(TxtY2_Reta2.getText());

            Retangulo ret = new Retangulo(
                new Reta (R1x1, R1y1, R1x2, R1y2),
                new Reta (R2x1, R2y1, R2x2, R2y2)
            );

            TxtArea.setText(
                ret.getArea().toString()
            );
            
            TxtPerimetro.setText(
                ret.getPerimetro().toString()
            );
             

        }catch (NumberFormatException ne){
            Alert alerta = new Alert (AlertType.ERROR);
            alerta.setTitle("Número incorreto! Tente novamente.");
            alerta.show();
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }

}
