package list.basicOperations;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getTarefa() {
        return descricao;
    }

    public void alterarTarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "descricao='" + descricao + "'}";
    }
}
