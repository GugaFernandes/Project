package programa;
	
	import java.util.ArrayList;

	public class TarefaDAO
	{
		private TarefaBanco database;
		public TarefaDAO() {
	        this.database = TarefaBanco.getInstance();
	    }

	    public void criarTarefa(Tarefa tarefa) {
	    	database.getTarefas().add(tarefa);
	    }

	    public void removerTarefa(String titulo) {
	        Tarefa tarefaParaRemover = buscarTarefaPorTitulo(titulo);
	        if (tarefaParaRemover != null) {
	        	database.getTarefas().remove(tarefaParaRemover);
	        }
	    }

	    public ArrayList<Tarefa> listarTarefas() {
	    	return database.getTarefas();
	    }

	    public Tarefa buscarTarefaPorTitulo(String titulo) {
	        for (Tarefa tarefa : database.getTarefas()) {
	            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
	                return tarefa;
	            }
	        }
	        return null;
	    }

	    public void atualizarTarefa(Tarefa tarefa, String novaDescricao, String novaDataVencimento) {
	        if (novaDescricao != null && !novaDescricao.isEmpty()) {
	            tarefa.setDescricao(novaDescricao);
	        }
	        if (novaDataVencimento != null && !novaDataVencimento.isEmpty()) {
	            tarefa.setDataVencimento(novaDataVencimento);
	        }
	    }
	}

