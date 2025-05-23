import java.time.LocalDate;

public class Tarefa {

    private String descricao;
    private LocalDate prazo;
    private int prioridade;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa(String descricao, LocalDate prazo, int prioridade) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return descricao + "| prioridade: " + prioridade + " | prazo: " + prazo;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }


}
