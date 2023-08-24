package set.party;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    protected void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + ": " +  codigoConvite + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
}
