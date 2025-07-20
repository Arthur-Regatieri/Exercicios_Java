import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    protected List<Pessoas> agenda = new ArrayList<>(10);
    Scanner scanner = new Scanner(System.in);


    public void armazenarPessoa(){
        System.out.println("Digite o nome do contato:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Digite a idade do contato:");
        int idadePessoa = scanner.nextInt();
        System.out.println("Digite a altura do contato:");
        float alturaPessoa = scanner.nextFloat();
        scanner.nextLine();
        Pessoas pessoa = new Pessoas(nomePessoa, idadePessoa, alturaPessoa);
        agenda.add(pessoa);
    }
    public void removerPessoa(){
        System.out.println("Qual pessoa deseja remover da agenda?");
        String remover = scanner.nextLine();
        Pessoas pessoaRemover = null;
        for(Pessoas pessoa: agenda){
            if (pessoa.getNome().equalsIgnoreCase(remover)) {
                pessoaRemover = pessoa;
                break;
            }
        }
        if (pessoaRemover != null) {
            agenda.remove(pessoaRemover);
            System.out.println("Pessoa removida com sucesso!");            
        }else{
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void buscarPessoa(){
        System.out.println("Informe a pessoa que contato deseja buscar:");
        String busca = scanner.nextLine();
        Pessoas bPessoas = null;
        for (Pessoas pessoas : agenda) {
            if (pessoas.getNome().equalsIgnoreCase(busca)) {
                bPessoas = pessoas;
                break;
            }            
        }
        if (bPessoas != null) {
            int posicao = agenda.indexOf(bPessoas) + 1;
            System.out.println("Este contato está em " + posicao + " em sua agenda");            
        }else{
            System.out.println("Não existe ninguém com este nome");
        }
    }
    public void imprimirAgenda(){
        for (Pessoas pessoa : agenda){
            System.out.println("Contato: " + pessoa.getNome() 
            + "| Idade: "+ pessoa.getIdade() 
            + "| Altura: " + pessoa.getAltura());
        }
    }
    public void imprimirPessoa(){
        System.out.println("Digite o número do contato na agenda: ");
        int ncontato = scanner.nextInt() - 1;
        scanner.nextLine();
        Pessoas contatoSelecionado = agenda.get(ncontato);
        System.out.println("Contato: " + contatoSelecionado.getNome() 
        + "\nIdade: "+ contatoSelecionado.getIdade() 
        + "\nAltura: " + contatoSelecionado.getAltura());  
        
    }
}
