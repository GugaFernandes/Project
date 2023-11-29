package controle;

import java.util.ArrayList;

import modelo.ITarefaDAO;
import modelo.Tarefa;

public class TarefaDAO implements ITarefaDAO {

	private static TarefaDAO instancia;
	private static ArrayList<Tarefa> database;

	private TarefaDAO() {
	}

	public static TarefaDAO getInstancia() {
		if (instancia == null) {
			instancia = new TarefaDAO();
			database = new ArrayList<>();
		}

		return instancia;
	}

	public void criarTarefa(Tarefa tarefa) {
		database.add(tarefa);
	}

	public void removerTarefa(String titulo) {
		Tarefa tarefaParaRemover = buscarTarefaPorTitulo(titulo);
		if (tarefaParaRemover != null) {
			database.remove(tarefaParaRemover);
		}
	}

	public ArrayList<Tarefa> listarTarefas() {
		return database;
	}

	public Tarefa buscarTarefaPorTitulo(String titulo) {
		for (Tarefa tarefa : database) {
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
