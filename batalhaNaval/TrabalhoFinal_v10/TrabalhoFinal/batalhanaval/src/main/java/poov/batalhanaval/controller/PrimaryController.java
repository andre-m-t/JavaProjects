package poov.batalhanaval.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import poov.batalhanaval.App;

public class PrimaryController extends App {
     @FXML
    private ImageView imageView;

    @FXML
    private Button jogarButton;

    @FXML
    private Button opcaoButton;

    @FXML
    private Button sairButton;

    @FXML
    void opcaoClicado() throws IOException {
        App.setRoot("Autenticacao");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void sairClicado(ActionEvent event) {
        ((Button) event.getSource()).getScene().getWindow().hide();
    }
}
