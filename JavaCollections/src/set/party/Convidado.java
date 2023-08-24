package set.party;

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
}
