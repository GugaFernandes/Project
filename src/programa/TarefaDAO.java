package programa;
	
	import java.util.ArrayList;

	public class TarefaDAO {
	    private ArrayList<Tarefa> tarefas = new ArrayList<>();

	    public void criarTarefa(Tarefa tarefa) {
	        tarefas.add(tarefa);
	    }

	    public void removerTarefa(String titulo) {
	        Tarefa tarefaParaRemover = buscarTarefaPorTitulo(titulo);
	        if (tarefaParaRemover != null) {
	            tarefas.remove(tarefaParaRemover);
	        }
	    }

	    public ArrayList<Tarefa> listarTarefas() {
	        return tarefas;
	    }

	    public Tarefa buscarTarefaPorTitulo(String titulo) {
	        for (Tarefa tarefa : tarefas) {
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

