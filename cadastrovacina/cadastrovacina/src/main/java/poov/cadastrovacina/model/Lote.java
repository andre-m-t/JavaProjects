package poov.cadastrovacina.model;

import java.time.LocalDate;

public class Lote {
    
    private Long codigo;
    private LocalDate validade;
    private int nroDosesLote;
    private int nroDosesAtual;
    private Vacina vacina;
    
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public LocalDate getValidade() {
        return validade;
    }
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
    public int getNroDosesLote() {
        return nroDosesLote;
    }
    public void setNroDosesLote(int nroDosesLote) {
        this.nroDosesLote = nroDosesLote;
    }
    public int getNroDosesAtual() {
        return nroDosesAtual;
    }
    public void setNroDosesAtual(int nroDosesAtual) {
        this.nroDosesAtual = nroDosesAtual;
    }
    public Vacina getVacina() {
        return vacina;
    }
    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((validade == null) ? 0 : validade.hashCode());
        result = prime * result + nroDosesLote;
        result = prime * result + nroDosesAtual;
        result = prime * result + ((vacina == null) ? 0 : vacina.hashCode());
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
        Lote other = (Lote) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (validade == null) {
            if (other.validade != null)
                return false;
        } else if (!validade.equals(other.validade))
            return false;
        if (nroDosesLote != other.nroDosesLote)
            return false;
        if (nroDosesAtual != other.nroDosesAtual)
            return false;
        if (vacina == null) {
            if (other.vacina != null)
                return false;
        } else if (!vacina.equals(other.vacina))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "\nCodigo: " + codigo + "\nValidade: " + validade + "\nNroDosesLote: " + nroDosesLote
                + "\nNroDosesAtual: " + nroDosesAtual + "\nVacina: " + vacina;
    }

}
