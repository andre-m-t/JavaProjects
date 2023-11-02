package poov.batalhanaval.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import poov.batalhanaval.App;

public class Autenticacao {

    private static String senha = "admin";

    @FXML
    private Button okButton;

    @FXML
    private TextField senhaTextField;

    @FXML
    void senhaSelected(ActionEvent event) throws IOException {
        String recebido = senhaTextField.getText();
        if(recebido.compareTo(senha)==0){
            App.setRoot("opcoes");
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Autenticação");
            alert.setHeaderText("Senha incorreta!");
            alert.showAndWait();
            App.setRoot("primary");
        }
    }

}
