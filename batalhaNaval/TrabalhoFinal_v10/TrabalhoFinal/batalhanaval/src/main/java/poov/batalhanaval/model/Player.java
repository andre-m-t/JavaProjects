package poov.batalhanaval.model;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Player {
    private int id;
    private String nome;
    private Tabuleiro tabuleiro;
    private ArrayList<Peca> pecasDisp;
    private Color cor;
    private boolean posicionadas;
    
    
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public ArrayList<Peca> getPecasDisp() {
        return pecasDisp;
    }
    public void setPecasDisp(ArrayList<Peca> pecasDisp) {
        this.pecasDisp = pecasDisp;
    }
    public Player(int id, String nome, Tabuleiro tabuleiro, ArrayList<Peca> pecasDisp) {
        this.id = id;
        this.nome = nome;
        this.tabuleiro = tabuleiro;
        this.pecasDisp = pecasDisp;
        this.posicionadas = false;
    }
    public Color getCor() {
        return cor;
    }
    public void setCor(Color cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Player [id=" + id + ", nome=" + nome + ", tabuleiro=" + tabuleiro + ", pecasDisp=" + pecasDisp
                + ", cor=" + cor + "]";
    }
    public boolean isPosicionadas() {
        return posicionadas;
    }
    public void setPosicionadas(boolean posicionadas) {
        this.posicionadas = posicionadas;
    }
    
}
