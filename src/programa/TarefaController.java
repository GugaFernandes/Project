package programa;

import java.util.ArrayList;

public class TarefaController {

	
	
    private TarefaDAO tarefaDAO;

    public TarefaController(){
        this.tarefaDAO = new TarefaDAO();
    }

    public void criarTarefa(String titulo, String descricao, String dataVencimento){
        Tarefa tarefa = new Tarefa(titulo, descricao, dataVencimento);
        tarefaDAO.criarTarefa(tarefa);
    }

    public void removerTarefa(String titulo){
        tarefaDAO.removerTarefa(titulo);
    }

    public ArrayList<Tarefa> listarTarefas(){
        return tarefaDAO.listarTarefas();
    }

    public Tarefa buscarTarefaPorTitulo(String titulo){
        return tarefaDAO.buscarTarefaPorTitulo(titulo);
   }

    public void atualizarTarefa(Tarefa tarefa, String novaDescricao, String novaDataVencimento){
        tarefaDAO.atualizarTarefa(tarefa, novaDescricao, novaDataVencimento);
    }
}
	
	
	
	
	
	
	


