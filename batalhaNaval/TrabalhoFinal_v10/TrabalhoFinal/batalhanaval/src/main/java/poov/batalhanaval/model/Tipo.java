package poov.batalhanaval.model;

public enum Tipo {
    AGUA("A",1),
    SUBMARINO("S", 2),
    PORTA_AVIAO("P", 5),
    COURACADO("C",4),
    DESTRUIDO("M",1);
    private String descricao;
    private int tamanho;
    
    private Tipo (String descricao, int tamanho){
        this.descricao = descricao;
        this.tamanho = tamanho;
    }
    public String geDescricao(){
        return descricao;
    }
    public int getTamanho(){
        return tamanho;
    }
}
