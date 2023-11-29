package modelo;

import java.util.ArrayList;


public class TarefaBanco{
    private static TarefaBanco instance;
    private ArrayList<Tarefa> tarefas;
    private TarefaBanco(){
        tarefas = new ArrayList<>();
    }
    public static TarefaBanco getInstance(){
        if (instance==null){
            instance = new TarefaBanco();
        }
        return instance;
    }
    public ArrayList<Tarefa> getTarefas(){
        return tarefas;
    }
}
