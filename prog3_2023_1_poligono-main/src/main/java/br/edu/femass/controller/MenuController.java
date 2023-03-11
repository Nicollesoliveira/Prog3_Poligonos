package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private  Pane pane;

    @FXML
    private void BtnPonto (ActionEvent action){
        try{
            Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Ponto.fxml"));
            
            Scene scene = new Scene (raiz);
            Stage stage = new Stage();
            stage.setTitle("Ponto");
            stage.setScene(scene);
            stage.show();
             

        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }

    @FXML
    private void BtnReta (ActionEvent action){
        try{
            Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Reta.fxml"));
            
            Scene scene = new Scene (raiz);
            Stage stage = new Stage();
            stage.setTitle("Reta");
            stage.setScene(scene);
            stage.show();
             

        } catch (Exception ex){
            ex.printStackTrace();
        } 
    }

    @FXML
    private void BtnQuadrado (ActionEvent action){
        try{
            Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Quadrado.fxml"));
            
            Scene scene = new Scene (raiz);
            Stage stage = new Stage();
            stage.setTitle("Quadrado");
            stage.setScene(scene);
            stage.show();
             

        } catch (Exception ex){
            ex.printStackTrace();
        }   
    }

    @FXML
    private void BtnRetangulo (ActionEvent action){
        try{
            Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Retangulo.fxml"));
            
            Scene scene = new Scene (raiz);
            Stage stage = new Stage();
            stage.setTitle("Retangulo");
            stage.setScene(scene);
            stage.show();
             

        } catch (Exception ex){
            ex.printStackTrace();
        }   
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    
}
