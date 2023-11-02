package poov.batalhanaval;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import poov.batalhanaval.model.Jogo;
import poov.batalhanaval.model.Opcao;
import poov.batalhanaval.model.Parte;
import poov.batalhanaval.model.Peca;
import poov.batalhanaval.model.Player;
import poov.batalhanaval.model.Tabuleiro;
import poov.batalhanaval.model.Tipo;

public class App extends Application {

    private static Scene scene;
    private static Opcao definicoesIniciais = new Opcao(10, 10, 3, 1, 2);
    private static ArrayList<Peca> pecasAgua = incicializarTabuleiro(definicoesIniciais.getLinhas(), definicoesIniciais.getColunas());
    private static ArrayList<Peca> pecasPlayer= inicializarPecasPlayer();
    private static Tabuleiro tabuleiro = new Tabuleiro(definicoesIniciais.getLinhas(), definicoesIniciais.getColunas(), pecasAgua);
    private static Player playerUm = new Player(1, null, tabuleiro, pecasPlayer);
    private static Player playerDois = new Player(2, null, tabuleiro, pecasPlayer);
    private static Jogo novJogo = new Jogo(playerUm, playerDois, definicoesIniciais);
 
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 600, 410);
        Image imagem = new Image(getClass().getResourceAsStream("/poov/images/batalhaNavalicon.png"));
        stage.setScene(scene);
        stage.setTitle("Batalha Naval");
        stage.getIcons().add(imagem);
        stage.show();
    }
    
    public static void setOpcoes(Opcao nova){
        definicoesIniciais = nova;
        pecasAgua = incicializarTabuleiro(definicoesIniciais.getLinhas(), definicoesIniciais.getColunas());
        pecasPlayer= inicializarPecasPlayer();
        tabuleiro = new Tabuleiro(definicoesIniciais.getLinhas(), definicoesIniciais.getColunas(), pecasAgua);
        playerUm = new Player(1, null, tabuleiro, pecasPlayer);
        playerDois = new Player(2, null, tabuleiro, pecasPlayer);
        novJogo = new Jogo(playerUm, playerDois, definicoesIniciais);
    }
    public static ArrayList<Peca> incicializarTabuleiro(int row, int column){
        ArrayList<Peca> novo = new ArrayList<>();
        int cont=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                Parte uma = new Parte(i, j);
                ArrayList<Parte> partAgua = new ArrayList<>();
                partAgua.add(uma);
                Peca agua = new Peca(cont++, (row*column), Tipo.AGUA, partAgua);
                novo.add(agua);
            }
        }
        return novo;
    }
  
    public static ArrayList<Peca> inicializarPecasPlayer(){
        ArrayList<Peca> todas = new ArrayList<>();
        for(int i=1;i<=definicoesIniciais.getSubmarinos();i++){
            Parte umaS = new Parte(0, 1);
            ArrayList<Parte> partSub = new ArrayList<>();
            partSub.add(umaS);
            umaS = new Parte(0, 2);
            partSub.add(umaS);
            Peca sub = new Peca(i, definicoesIniciais.getSubmarinos(), Tipo.SUBMARINO, partSub);
            todas.add(sub);
        }
        for(int i=1;i<=definicoesIniciais.getCouracados();i++){
            Parte umaC = new Parte(0, 1);
            ArrayList<Parte> partcoura = new ArrayList<>();
            partcoura.add(umaC);
            Peca cour = new Peca(i, definicoesIniciais.getCouracados(), Tipo.COURACADO, partcoura);
            todas.add(cour);
        }
        for(int i=1;i<=definicoesIniciais.getPortaAvioes();i++){
            Parte umaP = new Parte(-1, -1);
            ArrayList<Parte> partporta = new ArrayList<>();
            partporta.add(umaP);
            Peca porta = new Peca(i, definicoesIniciais.getPortaAvioes(), Tipo.PORTA_AVIAO, partporta);
            todas.add(porta);
        }
        return todas;
    }
    public static Jogo obterJogo(){
        return novJogo;
    }
    public static void definirJogo(Jogo novo){
        novJogo = novo;
    }
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}