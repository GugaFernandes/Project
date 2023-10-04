package programa;


	public class Tarefa {
	    private String titulo;
	    private String descricao;
	    private String dataVencimento;

	    public Tarefa(String titulo, String descricao, String dataVencimento) {
	        this.titulo = titulo;
	        this.descricao = descricao;
	        this.dataVencimento = dataVencimento;
	    }

	    // Getters e setters

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public String getDataVencimento() {
	        return dataVencimento;
	    }

	    public void setDataVencimento(String dataVencimento) {
	        this.dataVencimento = dataVencimento;
	    }
	}

