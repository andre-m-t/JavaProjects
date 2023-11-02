package poov.batalhanaval.model;

import java.util.ArrayList;

public class Peca {
    private int id;
    private int quantidade;
    private Tipo tipo;
    private ArrayList<Parte> pedacos;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public ArrayList<Parte> getPedacos() {
        return pedacos;
    }
    public void setPedacos(ArrayList<Parte> pedacos) {
        this.pedacos = pedacos;
    }
    public Peca(int id, int quantidade, Tipo tipo, ArrayList<Parte> pedacos) {
        this.id = id;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.pedacos = pedacos;
    }
    @Override
    public String toString() {
        return "\nPeca [id=" + id + ", quantidade=" + quantidade + ", tipo=" + tipo + ", pedacos=" + pedacos + "]";
    }
    
    public void destroy(){
        this.tipo = Tipo.DESTRUIDO;
    }
    public void posicionar(){
        
    }
}
