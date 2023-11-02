package poov.cadastrovacina.model.filter;

import java.time.LocalDate;

public class LoteFilter {
    private Long codigo;
    private LocalDate validadeInicial;
    private LocalDate validadeFinal;
    private int nroDosesDoLoteInicial;
    private int nroDosesDoLoteFinal;
    private int nroDosesAtualInicial;
    private int nroDosesAtualFinal;
    private String nomeVacina;
    
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public LocalDate getValidadeInicial() {
        return validadeInicial;
    }
    public void setValidadeInicial(LocalDate validadeInicial) {
        this.validadeInicial = validadeInicial;
    }
    public LocalDate getValidadeFinal() {
        return validadeFinal;
    }
    public void setValidadeFinal(LocalDate validadeFinal) {
        this.validadeFinal = validadeFinal;
    }
    public int getNroDosesDoLoteInicial() {
        return nroDosesDoLoteInicial;
    }
    public void setNroDosesDoLoteInicial(int nroDosesDoLoteInicial) {
        this.nroDosesDoLoteInicial = nroDosesDoLoteInicial;
    }
    public int getNroDosesDoLoteFinal() {
        return nroDosesDoLoteFinal;
    }
    public void setNroDosesDoLoteFinal(int nroDosesDoLoteFinal) {
        this.nroDosesDoLoteFinal = nroDosesDoLoteFinal;
    }
    public int getNroDosesAtualInicial() {
        return nroDosesAtualInicial;
    }
    public void setNroDosesAtualInicial(int nroDosesAtualInicial) {
        this.nroDosesAtualInicial = nroDosesAtualInicial;
    }
    public int getNroDosesAtualFinal() {
        return nroDosesAtualFinal;
    }
    public void setNroDosesAtualFinal(int nroDosesAtualFinal) {
        this.nroDosesAtualFinal = nroDosesAtualFinal;
    }
    public String getNomeVacina() {
        return nomeVacina;
    }
    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((validadeInicial == null) ? 0 : validadeInicial.hashCode());
        result = prime * result + ((validadeFinal == null) ? 0 : validadeFinal.hashCode());
        result = prime * result + nroDosesDoLoteInicial;
        result = prime * result + nroDosesDoLoteFinal;
        result = prime * result + nroDosesAtualInicial;
        result = prime * result + nroDosesAtualFinal;
        result = prime * result + ((nomeVacina == null) ? 0 : nomeVacina.hashCode());
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
        LoteFilter other = (LoteFilter) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (validadeInicial == null) {
            if (other.validadeInicial != null)
                return false;
        } else if (!validadeInicial.equals(other.validadeInicial))
            return false;
        if (validadeFinal == null) {
            if (other.validadeFinal != null)
                return false;
        } else if (!validadeFinal.equals(other.validadeFinal))
            return false;
        if (nroDosesDoLoteInicial != other.nroDosesDoLoteInicial)
            return false;
        if (nroDosesDoLoteFinal != other.nroDosesDoLoteFinal)
            return false;
        if (nroDosesAtualInicial != other.nroDosesAtualInicial)
            return false;
        if (nroDosesAtualFinal != other.nroDosesAtualFinal)
            return false;
        if (nomeVacina == null) {
            if (other.nomeVacina != null)
                return false;
        } else if (!nomeVacina.equals(other.nomeVacina))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "\nCodigo: " + codigo + "\nValidadeInicial: " + validadeInicial + "\nValidadeFinal: "
                + validadeFinal + "\nNroDosesDoLoteInicial: " + nroDosesDoLoteInicial + "\nNroDosesDoLoteFinal: "
                + nroDosesDoLoteFinal + "\nNroDosesAtualInicial: " + nroDosesAtualInicial + "\nNroDosesAtualFinal: "
                + nroDosesAtualFinal + "\nNomeVacina: " + nomeVacina;
    }
    public LoteFilter() {
    }
    public LoteFilter(Long codigo, LocalDate validadeInicial, LocalDate validadeFinal, int nroDosesDoLoteInicial,
            int nroDosesDoLoteFinal, int nroDosesAtualInicial, int nroDosesAtualFinal, String nomeVacina) {
        this.codigo = codigo;
        this.validadeInicial = validadeInicial;
        this.validadeFinal = validadeFinal;
        this.nroDosesDoLoteInicial = nroDosesDoLoteInicial;
        this.nroDosesDoLoteFinal = nroDosesDoLoteFinal;
        this.nroDosesAtualInicial = nroDosesAtualInicial;
        this.nroDosesAtualFinal = nroDosesAtualFinal;
        this.nomeVacina = nomeVacina;
    }   

}
