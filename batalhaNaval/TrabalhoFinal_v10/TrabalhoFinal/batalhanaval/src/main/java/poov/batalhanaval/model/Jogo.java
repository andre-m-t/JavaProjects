package poov.batalhanaval.model;

public class Jogo {
    private Player player_1;
    private Player player_2;
    private Opcao definicoes;
    
    public Player getPlayer_1() {
        return player_1;
    }
    public void setPlayer_1(Player player_1) {
        this.player_1 = player_1;
    }
    public Player getPlayer_2() {
        return player_2;
    }
    public void setPlayer_2(Player player_2) {
        this.player_2 = player_2;
    }
    public Opcao getDefinicoes() {
        return definicoes;
    }
    public void setDefinicoes(Opcao definicoes) {
        this.definicoes = definicoes;
    }
    public Jogo(Player player_1, Player player_2, Opcao definicoes) {
        this.player_1 = player_1;
        this.player_2 = player_2;
        this.definicoes = definicoes;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((player_1 == null) ? 0 : player_1.hashCode());
        result = prime * result + ((player_2 == null) ? 0 : player_2.hashCode());
        result = prime * result + ((definicoes == null) ? 0 : definicoes.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jogo other = (Jogo) obj;
        if (player_1 == null) {
            if (other.player_1 != null)
                return false;
        } else if (!player_1.equals(other.player_1))
            return false;
        if (player_2 == null) {
            if (other.player_2 != null)
                return false;
        } else if (!player_2.equals(other.player_2))
            return false;
        if (definicoes == null) {
            if (other.definicoes != null)
                return false;
        } else if (!definicoes.equals(other.definicoes))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Jogo [player_1=" + player_1.getNome() + ", player_2=" + player_2.getNome() + ", definicoes=" + definicoes + "]";
    }    
}
