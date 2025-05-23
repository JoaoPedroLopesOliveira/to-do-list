import java.util.Comparator;
import java.util.LinkedList;


public class Ordenador {
    public static void ordenarPrioridade (LinkedList <Tarefa> tarefas){
        tarefas.sort(Comparator.comparingInt(Tarefa::getPrioridade));
    }

    public static void ordenarPrazo (LinkedList <Tarefa> tarefas){
        tarefas.sort(Comparator.comparing(Tarefa::getPrazo));
    }
}
