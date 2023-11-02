package poov.batalhanaval.controller;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import poov.batalhanaval.App;
import poov.batalhanaval.model.Jogo;
import poov.batalhanaval.model.Parte;
import poov.batalhanaval.model.Peca;
import poov.batalhanaval.model.Player;
import poov.batalhanaval.model.Tipo;

public class PosicionarController {

    private Jogo jogo = App.obterJogo();
    private Player usuario = jogo.getPlayer_1();
    private ArrayList<Peca> pecasUser = new ArrayList<>();
    private int user = 1;
    private int Sub = 1;
    private int Crc = 1;
    private int Prt = 1;

    @FXML
    private Label CrcRestante;

    @FXML
    private Label PrtRestante;

    @FXML
    private Label SubRestante;

    @FXML
    private TextField clmnCrcP1;

    @FXML
    private TextField clmnCrcP2;

    @FXML
    private TextField clmnCrcP3;

    @FXML
    private TextField clmnCrcP4;

    @FXML
    private TextField clmnPrtP1;

    @FXML
    private TextField clmnPrtP2;

    @FXML
    private TextField clmnPrtP3;

    @FXML
    private TextField clmnPrtP4;

    @FXML
    private TextField clmnPrtP5;

    @FXML
    private TextField clmnSubP1;

    @FXML
    private TextField clmnSubP2;

    @FXML
    private Label playerLabel;

    @FXML
    private Button posicionarCouracado;

    @FXML
    private Button posicionarPortaAviao;

    @FXML
    private Button posicionarSubmarino;

    @FXML
    private TextField rowCrcP1;

    @FXML
    private TextField rowCrcP2;

    @FXML
    private TextField rowCrcP3;

    @FXML
    private TextField rowCrcP4;

    @FXML
    private TextField rowPrtP1;

    @FXML
    private TextField rowPrtP2;

    @FXML
    private TextField rowPrtP3;

    @FXML
    private TextField rowPrtP4;

    @FXML
    private TextField rowPrtP5;

    @FXML
    private TextField rowSubP1;

    @FXML
    private TextField rowSubP2;

    @FXML
    void posicionarCouracadoClicado(ActionEvent event) throws IOException {
        ArrayList<Parte> partes = new ArrayList<>();
        Parte nova = new Parte();
        if (!rowCrcP1.getText().isBlank() || !clmnCrcP1.getText().isBlank()) {
            nova.setRow(Integer.valueOf(rowCrcP1.getText()));
            nova.setColumn(Integer.valueOf(clmnCrcP1.getText()));
            if (nova.getRow() < jogo.getDefinicoes().getLinhas()
                    && nova.getColumn() < jogo.getDefinicoes().getColunas()) {
                partes.add(nova);
                if (!rowCrcP2.getText().isBlank() || !clmnCrcP2.getText().isBlank()) {
                    nova = new Parte();
                    nova.setRow(Integer.valueOf(rowCrcP2.getText()));
                    nova.setColumn(Integer.valueOf(clmnCrcP2.getText()));
                    if (posicaoCorreta(partes.get(0), nova)) {
                        partes.add(nova);
                        if (!rowCrcP3.getText().isBlank() || !clmnCrcP3.getText().isBlank()) {
                            nova = new Parte();
                            nova.setRow(Integer.valueOf(rowCrcP3.getText()));
                            nova.setColumn(Integer.valueOf(clmnCrcP3.getText()));
                            if (posicaoCorreta(partes.get(1), nova)) {
                                partes.add(nova);
                                if (!rowCrcP4.getText().isBlank() || !clmnCrcP4.getText().isBlank()) {
                                    nova = new Parte();
                                    nova.setRow(Integer.valueOf(rowCrcP4.getText()));
                                    nova.setColumn(Integer.valueOf(clmnCrcP4.getText()));
                                    if (posicaoCorreta(partes.get(2), nova)) {
                                        partes.add(nova);
                                        if (Crc <= jogo.getDefinicoes().getCouracados()) {
                                            // System.out.println(partes.toString());
                                            Peca criada = new Peca(Crc, jogo.getDefinicoes().getCouracados(),
                                                    Tipo.COURACADO, partes);
                                            pecasUser.add(criada);
                                            CrcRestante.setText((2 - Crc) + " Couraçados");
                                            Crc++;
                                            verificaNumeroDePecas();

                                        }
                                    }
                                } else {
                                    mensagemDePosicionamento();
                                }
                            } else {
                                mensagemDePosicionamento();
                            }
                        } else {
                            mensagemDePosicionamento();
                        }
                    } else {
                        mensagemDePosicionamento();
                    }
                } else {
                    mensagemDePreenchimentoIncorreto();
                }
            } else {
                mensagemDeErro();
            }
        } else {
            mensagemDeErro();
        }
    }

    @FXML
    void posicionarPortaAviaoClicado(ActionEvent event) throws IOException {
        ArrayList<Parte> partes = new ArrayList<>();
        Parte nova = new Parte();
        if (!rowPrtP1.getText().isBlank() || !clmnPrtP1.getText().isBlank()) {
            nova.setRow(Integer.valueOf(rowPrtP1.getText()));
            nova.setColumn(Integer.valueOf(clmnPrtP1.getText()));
            if (nova.getRow() < jogo.getDefinicoes().getLinhas()
                    && nova.getColumn() < jogo.getDefinicoes().getColunas()) {
                partes.add(nova);
                if (!rowPrtP2.getText().isBlank() || !clmnPrtP2.getText().isBlank()) {
                    nova = new Parte();
                    nova.setRow(Integer.valueOf(rowPrtP2.getText()));
                    nova.setColumn(Integer.valueOf(clmnPrtP2.getText()));
                    if (posicaoCorreta(partes.get(0), nova)) {
                        partes.add(nova);
                        if (!rowPrtP3.getText().isBlank() || !clmnPrtP3.getText().isBlank()) {
                            nova = new Parte();
                            nova.setRow(Integer.valueOf(rowPrtP3.getText()));
                            nova.setColumn(Integer.valueOf(clmnPrtP3.getText()));
                            if (posicaoCorreta(partes.get(1), nova)) {
                                partes.add(nova);
                                if (!rowPrtP4.getText().isBlank() || !clmnPrtP4.getText().isBlank()) {
                                    nova = new Parte();
                                    nova.setRow(Integer.valueOf(rowPrtP4.getText()));
                                    nova.setColumn(Integer.valueOf(clmnPrtP4.getText()));
                                    if (posicaoCorreta(partes.get(2), nova)) {
                                        partes.add(nova);
                                        // System.out.println(partes.toString());
                                        if (!rowPrtP5.getText().isBlank() || !clmnPrtP5.getText().isBlank()) {
                                            nova = new Parte();
                                            nova.setRow(Integer.valueOf(rowPrtP5.getText()));
                                            nova.setColumn(Integer.valueOf(clmnPrtP5.getText()));
                                            if (posicaoCorreta(partes.get(3), nova)) {
                                                partes.add(nova);
                                                if (Prt <= jogo.getDefinicoes().getPortaAvioes()) {
                                                    // System.out.println(partes.toString());
                                                    Peca criada = new Peca(Prt, jogo.getDefinicoes().getPortaAvioes(),
                                                            Tipo.PORTA_AVIAO, partes);
                                                    pecasUser.add(criada);
                                                    PrtRestante.setText((1 - Prt) + " Porta-Avião");
                                                    Prt++;
                                                    verificaNumeroDePecas();

                                                }
                                            }
                                        }
                                    } else {
                                        mensagemDePosicionamento();
                                    }
                                } else {
                                    mensagemDePosicionamento();
                                }
                            } else {
                                mensagemDePosicionamento();
                            }
                        } else {
                            mensagemDePosicionamento();
                        }
                    } else {
                        mensagemDePosicionamento();
                    }
                } else {
                    mensagemDePreenchimentoIncorreto();
                }
            } else {
                mensagemDeErro();
            }
        } else {
            mensagemDeErro();
        }
    }

    @FXML
    void posicionarSubmarionoClicado(ActionEvent event) throws IOException {
        ArrayList<Parte> partes = new ArrayList<>();
        Parte nova = new Parte();
        if (!rowSubP1.getText().isBlank() || !clmnSubP1.getText().isBlank()) {
            nova.setRow(Integer.valueOf(rowSubP1.getText()));
            nova.setColumn(Integer.valueOf(clmnSubP1.getText()));
            if (nova.getRow() < jogo.getDefinicoes().getLinhas()
                    && nova.getColumn() < jogo.getDefinicoes().getColunas()) {
                partes.add(nova);
                if (!rowSubP2.getText().isBlank() || !clmnSubP2.getText().isBlank()) {
                    nova = new Parte();
                    nova.setRow(Integer.valueOf(rowSubP2.getText()));
                    nova.setColumn(Integer.valueOf(clmnSubP2.getText()));
                    if (posicaoCorreta(partes.get(0), nova)) {
                        if (Sub <= jogo.getDefinicoes().getSubmarinos()) {
                            partes.add(nova);
                            Peca criada = new Peca(Sub, jogo.getDefinicoes().getSubmarinos(), Tipo.SUBMARINO, partes);
                            pecasUser.add(criada);
                            SubRestante.setText((3 - Sub) + " Submarinos");
                            Sub++;
                            verificaNumeroDePecas();

                        }
                    } else {
                        mensagemDePosicionamento();
                    }
                } else {
                    mensagemDePreenchimentoIncorreto();
                }
            } else {
                mensagemDeErro();
            }
        } else {
            mensagemDeErro();
        }
    }

    private void verificaNumeroDePecas() throws IOException {
        if (Sub > jogo.getDefinicoes().getSubmarinos()) {
            posicionarSubmarino.setDisable(true);
            // if (Sub > jogo.getDefinicoes().getSubmarinos() && Crc > jogo.getDefinicoes().getCouracados()
            //         && Prt > jogo.getDefinicoes().getPortaAvioes()) {
            //     verificaUsuario();
            // }
        }
        if (Sub > jogo.getDefinicoes().getSubmarinos() && Crc > jogo.getDefinicoes().getCouracados()
                && Prt > jogo.getDefinicoes().getPortaAvioes()) {
            verificaUsuario();
        }
        if (Crc > jogo.getDefinicoes().getCouracados()) {
            posicionarCouracado.setDisable(true);
            // if (Sub > jogo.getDefinicoes().getSubmarinos() && Crc > jogo.getDefinicoes().getCouracados()
            //         && Prt > jogo.getDefinicoes().getPortaAvioes()) {
            //     verificaUsuario();
            // }
        }
        if (Prt > jogo.getDefinicoes().getPortaAvioes()) {
            posicionarPortaAviao.setDisable(true);
            // if (Sub > jogo.getDefinicoes().getSubmarinos() && Crc > jogo.getDefinicoes().getCouracados()
            //         && Prt > jogo.getDefinicoes().getPortaAvioes()) {
            //     verificaUsuario();
            // }
        }

    }

    private boolean parteUsada(Parte nova) {
        for (Peca atual : pecasUser) {
            for (int i = 0; i < atual.getPedacos().size(); i++) {
                if (atual.getPedacos().get(i) == nova) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean posicaoCorreta(Parte antiga, Parte nova) {
        if (nova.getRow() < jogo.getDefinicoes().getLinhas() && nova.getColumn() < jogo.getDefinicoes().getColunas()) {
            if (nova.getColumn() == antiga.getColumn()) {
                if (nova.getRow() == antiga.getRow() + 1 || nova.getRow() == antiga.getRow() - 1) {
                    // POSICIONAMENTO VERTICAL
                    return true;
                } else {
                    return false;
                }
            }
            if (nova.getRow() == antiga.getRow()) {
                if (nova.getColumn() == antiga.getColumn() + 1 || nova.getColumn() == antiga.getColumn() - 1) {
                    // POSICIONAMENTO HORIZONTAL
                    return true;
                } else {
                    return false;
                }

            }
            // CASO NAO ENTRAR EM NENHUM
            return false;

        } else {
            // mensagemDeErro();
            return false;
        }
    }

    private void mensagemDePreenchimentoIncorreto() {
        Alert info = new Alert(AlertType.ERROR);
        info.setTitle("Erro");
        info.setHeaderText("Você deve preencher todas as lacunas!");
        info.showAndWait();
    }

    private void mensagemDePosicionamento() {
        Alert info = new Alert(AlertType.ERROR);
        info.setTitle("Erro");
        info.setHeaderText("As peças devem ser posicionadas \n na vertical ou horizontal!");
        info.showAndWait();
    }

    private void mensagemDeErro() {
        Alert info = new Alert(AlertType.ERROR);
        info.setTitle("Erro");
        info.setHeaderText("Você deve inserir um número entre 0 e " + jogo.getDefinicoes().getLinhas());
        info.showAndWait();
    }

    private void verificaUsuario() throws IOException {
        if (user == 1) {
            usuario.setPosicionadas(true);
            usuario.setPecasDisp(pecasUser);
            jogo.setPlayer_1(usuario);
            usuario = jogo.getPlayer_2();
            Alert info = new Alert(AlertType.INFORMATION);
            info.setTitle("Aviso");
            info.setHeaderText("Player 2, Posicione suas peças!");
            info.showAndWait();
            playerLabel.setText("2");
            pecasUser = new ArrayList<>();
            Sub = 1;
            Crc = 1;
            Prt = 1;
            posicionarCouracado.setDisable(false);
            posicionarPortaAviao.setDisable(false);
            posicionarSubmarino.setDisable(false);
            SubRestante.setText(jogo.getDefinicoes().getSubmarinos() + " Submarinos");
            CrcRestante.setText(jogo.getDefinicoes().getCouracados() + " Couraçados");
            PrtRestante.setText(jogo.getDefinicoes().getPortaAvioes() + " Porta-Avião");
        }
        if (user == 2) {
            usuario.setPosicionadas(true);
            usuario.setPecasDisp(pecasUser);
            jogo.setPlayer_2(usuario);
            mensagemDePecasPosicionadas();
            App.definirJogo(jogo);
            System.out.println(jogo.getPlayer_1().getPecasDisp().toString());
            System.out.println(jogo.getPlayer_2().getPecasDisp().toString());
            App.setRoot("tableOne");
            user = 3;
        }
        user = 2;
    }

    private void mensagemDePecasPosicionadas() {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Aviso");
        info.setHeaderText("Todas as peças foram posicionadas!");
        info.showAndWait();
    }
}
