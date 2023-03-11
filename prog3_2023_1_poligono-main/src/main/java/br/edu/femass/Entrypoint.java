package br.edu.femass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/* Entrypoint é um requisito no fx significa que é uma classe pra dizer que é 
uma aplicação do Java FX
 */
public class Entrypoint extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent raiz = FXMLLoader.load(getClass().getResource("/fxml/Menu.fxml"));
       
        Scene scene = new Scene (raiz);
        scene.getStylesheets().add("/styles/Styles.css");
        scene.getRoot().setStyle("-fx-font-family: 'serif'");
        stage.setTitle("Prog 3");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
