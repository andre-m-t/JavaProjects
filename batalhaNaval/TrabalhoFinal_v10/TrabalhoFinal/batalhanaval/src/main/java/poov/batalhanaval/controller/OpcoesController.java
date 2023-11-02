package poov.batalhanaval.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import poov.batalhanaval.App;
import poov.batalhanaval.model.Opcao;


public class OpcoesController extends App{

    @FXML
    private Button cancelButton;

    @FXML
    private TextField columnTextField;

    @FXML
    private TextField couracadoTextField;

    @FXML
    private Button goButton;

    @FXML
    private TextField portaAviaoTextField;

    @FXML
    private TextField rowTextField;

    @FXML
    private TextField submarinoTextField;

    @FXML
    void cancelSelected() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    void goSelected(ActionEvent event) throws IOException {
        Opcao definicoes = new Opcao(Integer.parseInt(rowTextField.getText()), 
                                        Integer.parseInt(columnTextField.getText()), 
                                            Integer.parseInt(submarinoTextField.getText()), 
                                                Integer.parseInt(portaAviaoTextField.getText()), 
                                                    Integer.parseInt(couracadoTextField.getText()));
        App.setOpcoes(definicoes);
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Sucesso");
        alert.setHeaderText("Opções alteradas com sucesso!");
        alert.showAndWait();
        App.setRoot("primary");
    }

}
