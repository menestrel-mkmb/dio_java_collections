package map.calendar;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    protected void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return nome + ": " + atracao;
    }
}
