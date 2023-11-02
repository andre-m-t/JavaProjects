package poov.batalhanaval.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import poov.batalhanaval.App;
import poov.batalhanaval.model.Jogo;

public class SecondaryController extends App {
     @FXML
    private Button goButton;

    @FXML
    private ColorPicker playerDoisCor;

    @FXML
    private TextField playerDoisTextField;

    @FXML
    private ColorPicker playerUmCor;

    @FXML
    private TextField playerUmTextField;

    @FXML
    private Button secondaryButton;

    @FXML
    void goSelected(ActionEvent event) throws IOException{
        Jogo novo = App.obterJogo();
        novo.getPlayer_1().setNome(playerUmTextField.getText());
        novo.getPlayer_2().setNome(playerDoisTextField.getText());
        novo.getPlayer_1().setCor(playerUmCor.getValue());
        novo.getPlayer_2().setCor(playerDoisCor.getValue());
        App.definirJogo(novo);
        App.setRoot("posicionar");
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}