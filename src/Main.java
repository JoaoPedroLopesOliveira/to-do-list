import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Tarefa> tarefas = new LinkedList<>();

        Tarefa portifolio = new Tarefa("Criar um portifolio com react", LocalDate.of(2025,5,30), 5);
        Tarefa gameQuizSQL  = new Tarefa("Criar um jogo de perguntas e resopostas", LocalDate.of(2025,5,26), 2);
        Tarefa sistemadeBiblioteca = new Tarefa("Criar um sistema com cadastro de livros, usuários, empréstimos e devoluções.", LocalDate.of(2025,6,25), 3);
        Tarefa apiBancaria = new Tarefa("Simular uma API de banco simples que permita: Cadastro de usuários com saldo. Transferências entre contas. Consulta de extrato.", LocalDate.of(2025,6,15), 4);

        tarefas.add(portifolio);
        tarefas.add(gameQuizSQL);
        tarefas.add(sistemadeBiblioteca);
        tarefas.add(apiBancaria);

        Ordenador.ordenarPrazo(tarefas);

        for (Tarefa t : tarefas){
            System.out.println(t);
        }

        Ordenador.ordenarPrioridade(tarefas);
        System.out.println("________________________");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }
}
