package aula04;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
       int opcao = 0;
       Scanner scanner = new Scanner(System.in);
       Livraria livraria = new Livraria()
;
       while(opcao != 4){
           System.out.println("1 - Adicionar livro");
           System.out.println("2 - Listar os livros");
           System.out.println("3 - Detalhar livros");
           System.out.println("4 - Sair");
           opcao = scanner.nextInt();
           executarOperacao(opcao, scanner, livraria);
       } 
       System.out.println("Sistema encerrado.");
       scanner.close();
    }

    public static void executarOperacao(int op, Scanner scanner, Livraria livraria ){
        switch(op){
            case 1:
              System.out.println("Adicionar livro");
              System.out.println("Digite o id do livro");
              int id = scanner.nextInt();
              scanner.nextLine();
              System.out.println("Digite o titulo do livro");
              String titulo = scanner.nextLine();
              System.out.println("Digite o autor do livro");
              String autor = scanner.nextLine();
              System.out.println("Digite o ano de publicacao do livro");
              String ano = scanner.nextLine();
              System.out.println("Digite a editora do livro");
              String editora = scanner.nextLine();
              System.out.println("Digite a quantidade de paginas do livro");
              int qtdDePaginas = scanner.nextInt();

              Livro livro = new Livro(id, titulo, autor, ano, editora, qtdDePaginas);
              livraria.adicionarLivro(livro);
              
              break;
            case 2:
              System.out.println("Listar os livros"); 
              System.out.println(livraria.listarLivros()); 
              break;
            case 3:
              System.out.println("Detalhar livros");  
              System.out.println("Digite o id do livro");
              int idLivro = scanner.nextInt();
              livraria.detalharLivros(idLivro);
              break;
            default:
              System.out.println("saindo do sistema...");  
              break;  
              
        }
    }
}
