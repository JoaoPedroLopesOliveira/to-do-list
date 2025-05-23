public class Tarefa {

    private String nome;
    private String prazo;
    private int importancia;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public Tarefa(String nome, String prazo, int importancia) {
        this.nome = nome;
        this.prazo = prazo;
        this.importancia = importancia;
    }

    public void imprime() {
        System.out.println("Tarefa: " + this.nome + (this.importancia != 0 ? "\nGrau de importancia: " + this.importancia + "\nPrazo para: " + this.prazo : ""));
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
