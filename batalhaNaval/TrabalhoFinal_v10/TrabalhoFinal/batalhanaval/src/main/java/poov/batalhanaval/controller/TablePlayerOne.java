package poov.batalhanaval.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import poov.batalhanaval.App;
import poov.batalhanaval.model.Jogo;
import poov.batalhanaval.model.Parte;
import poov.batalhanaval.model.Peca;
import poov.batalhanaval.model.Tipo;


public class TablePlayerOne implements Initializable{

    @FXML
    private GridPane gridPane;
    private Button nButton = new Button();
    private Jogo jogo = App.obterJogo();
    private Boolean posicionadas = false;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //DEFININDO COR DO GRID PANE
        Double red = jogo.getPlayer_1().getCor().getRed()*100;
        int rInt = red.intValue();
        Double green = jogo.getPlayer_1().getCor().getGreen()*100;
        int gInt = green.intValue();
        Double blue = jogo.getPlayer_1().getCor().getBlue()*100;
        int bInt = blue.intValue();
        String hex = String.format("#%02X%02X%02X", rInt, gInt, bInt);
        gridPane.setStyle("-fx-background-color: " + hex + ";");
        //VOLTANDO A LOgICA DOS BOTOES


        
        int newId = 0;
        for(int i =0; i<jogo.getDefinicoes().getLinhas();i++){
            for(int j=0; j<jogo.getDefinicoes().getColunas();j++){
                nButton = new Button();
                nButton.setId(String.valueOf(newId));
                newId++;
                nButton.setMinSize(40, 40);
                nButton.setOnAction((javafx.event.EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent e){
                        //CONVERTENDO TO STRING DO BOTAO PARA APENAS NUMEROS E SUBSTITUINDO LETRAS POR VAZIO
                        String id = e.getSource().toString().replaceAll("[\\D]", "");
                        Peca clicada = jogo.getPlayer_1().getTabuleiro().getTodasPecas().get(Integer.valueOf(id));
                        
                        if(clicada.getTipo() == Tipo.AGUA){
                            //jogo.getPlayer_1().getTabuleiro().getTodasPecas().get(Integer.valueOf(id)).destroy();
                            for(Parte atual : clicada.getPedacos()){
                                nButton = new Button(Tipo.AGUA.geDescricao());
                                nButton.setMinSize(40, 40);
                                gridPane.add(nButton, atual.getColumn(), atual.getRow());
                            }
                            // System.out.println(clicada.toString());
                        }
                        if(clicada.getTipo() == Tipo.COURACADO){
                            jogo.getPlayer_1().getTabuleiro().getTodasPecas().get(Integer.valueOf(id)).destroy();
                            for(Parte atual : clicada.getPedacos()){
                                nButton = new Button(Tipo.DESTRUIDO.geDescricao());
                                nButton.setMinSize(40, 40);
                                gridPane.add(nButton, atual.getColumn(), atual.getRow());
                            }
                        }
                        if(clicada.getTipo() == Tipo.SUBMARINO){
                            jogo.getPlayer_1().getTabuleiro().getTodasPecas().get(Integer.valueOf(id)).destroy();
                            for(Parte atual : clicada.getPedacos()){
                                nButton = new Button(Tipo.DESTRUIDO.geDescricao());
                                nButton.setMinSize(40, 40);
                                gridPane.add(nButton, atual.getColumn(), atual.getRow());
                            }
                        }
                        if(clicada.getTipo() == Tipo.PORTA_AVIAO){
                            jogo.getPlayer_1().getTabuleiro().getTodasPecas().get(Integer.valueOf(id)).destroy();
                            for(Parte atual : clicada.getPedacos()){
                                nButton = new Button(Tipo.DESTRUIDO.geDescricao());
                                nButton.setMinSize(40, 40);
                                gridPane.add(nButton, atual.getColumn(), atual.getRow());
                            }
                        }
                    }
                });
                gridPane.add(nButton, j, i);
            }
        }
        // throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }

}
