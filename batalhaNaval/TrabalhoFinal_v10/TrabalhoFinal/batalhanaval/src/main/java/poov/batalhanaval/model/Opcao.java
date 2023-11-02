package poov.batalhanaval.model;

public class Opcao {
    
    private int linhas;
    private int colunas;
    private int submarinos;
    private int portaAvioes;
    private int couracados;
    
    public int getLinhas() {
        return linhas;
    }
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
    public int getColunas() {
        return colunas;
    }
    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    public int getSubmarinos() {
        return submarinos;
    }
    public void setSubmarinos(int submarinos) {
        this.submarinos = submarinos;
    }
    public int getPortaAvioes() {
        return portaAvioes;
    }
    public void setPortaAvioes(int portaAvioes) {
        this.portaAvioes = portaAvioes;
    }
    public int getCouracados() {
        return couracados;
    }
    public void setCouracados(int couracados) {
        this.couracados = couracados;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + linhas;
        result = prime * result + colunas;
        result = prime * result + submarinos;
        result = prime * result + portaAvioes;
        result = prime * result + couracados;
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
        Opcao other = (Opcao) obj;
        if (linhas != other.linhas)
            return false;
        if (colunas != other.colunas)
            return false;
        if (submarinos != other.submarinos)
            return false;
        if (portaAvioes != other.portaAvioes)
            return false;
        if (couracados != other.couracados)
            return false;
        return true;
    }
    public Opcao(int linhas, int colunas, int submarinos, int portaAvioes, int couracados) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.submarinos = submarinos;
        this.portaAvioes = portaAvioes;
        this.couracados = couracados;
    }
    @Override
    public String toString() {
        return "Linhas: " + linhas + "Colunas: " + colunas + "Submarinos: " + submarinos + "PortaAvioes: "
                + portaAvioes + "Couracados: " + couracados;
    }

    
}
