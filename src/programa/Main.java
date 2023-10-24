package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Integer opcaoSelecionada=Integer.MAX_VALUE;
        Scanner leitura=new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        TarefaDAO tarefaDAO=new TarefaDAO();

        while (opcaoSelecionada!=0){

            System.out.println("------- SISTEMA DE GERENCIAMENTO DE TAREFAS -------");
            System.out.println("0 SAIR");
            System.out.println("1 CRIAR TAREFA");
            System.out.println("2 REMOVER TAREFA");
            System.out.println("3 LISTAR TAREFAS");
            System.out.println("4 ATUALIZAR TAREFA");

            opcaoSelecionada = Integer.valueOf(leitura.nextLine());

            switch (opcaoSelecionada){
                case 0:{
                    System.out.println("Saindo do sistema. Adeus!");
                    break;}
                case 1:{
                    System.out.println("Criando uma nova tarefa:");
                    System.out.println("Título:");
                    String titulo=leitura.nextLine();
                    System.out.println("Descrição:");
                    String descricao=leitura.nextLine();
                    System.out.println("Data de validade:");
                    String dataVencimento=leitura.nextLine();
                    Tarefa tarefa=new Tarefa(titulo,descricao,dataVencimento);
                    tarefaDAO.criarTarefa(tarefa);

                    System.out.println("Tarefa criada com sucesso!");
                    break;}
                case 2:{
                    System.out.println("Digite o título da tarefa que deseja remover:");
                    String titulo = leitura.nextLine();
                    tarefaDAO.removerTarefa(titulo);
                    System.out.println("Tarefa removida com sucesso!");
                    break;}
                case 3:{
                    System.out.println("Listagem de tarefas cadastradas: \n");
                    ArrayList<Tarefa> todasTarefas=tarefaDAO.listarTarefas();
                    for (Tarefa tarefa:todasTarefas) {
                        System.out.println("Título: "+tarefa.getTitulo());
                        System.out.println("Descrição: "+tarefa.getDescricao());
                        System.out.println("Data de Vencimento: "+tarefa.getDataVencimento());
                        System.out.println("\n------------------------\n");}
                    break;}
                case 4:{
                    System.out.println("Digite o título da tarefa que deseja atualizar:");
                    String titulo=leitura.nextLine();
                    Tarefa tarefaExistente=tarefaDAO.buscarTarefaPorTitulo(titulo);

                    if (tarefaExistente!=null){
                        System.out.println("Nova descrição (ou deixe em branco para manter a mesma):");
                        String novaDescricao=leitura.nextLine();
                        System.out.println("Nova data de vencimento (ou deixe em branco para manter a mesma):");
                        String novaDataVencimento=leitura.nextLine();

                        tarefaDAO.atualizarTarefa(tarefaExistente,novaDescricao,novaDataVencimento);
                        System.out.println("Tarefa atualizada com sucesso!");
                    }else{
                        System.out.println("Tarefa não encontrada.");}
                    break;}
                default:{
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
        }
        }
        }
        leitura.close();}
}
