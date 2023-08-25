package map.contactListMap;

public class Contato {
    private String nome;
    private Integer num;

    public Contato(String nome, Integer num) {
        this.nome = nome;
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNum() {
        return num;
    }

    protected void setNum(Integer num) {
        this.num = num;
    }
}
