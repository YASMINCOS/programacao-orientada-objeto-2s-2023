package lista01.atividade03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarProduto(new Produto(nome, quantidade));
                    break;
                case 2:
                    System.out.print("Nome do Produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    Produto produtoRemover = null;
                    for (Produto produto : estoque.getProdutos()) {
                        if (produto.getNome().equals(nomeRemover)) {
                            produtoRemover = produto;
                            break;
                        }
                    }
                    if (produtoRemover != null) {
                        estoque.removerProduto(produtoRemover);
                        System.out.println("Produto removido do estoque.");
                    } else {
                        System.out.println("Produto não encontrado no estoque.");
                    }
                    break;
                case 3:
                    System.out.println("Produtos no Estoque:");
                    estoque.listarProdutos();
                    break;
                case 4:
                    System.out.print("Nome do Produto para atualizar a quantidade: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    Produto produtoAtualizar = null;
                    for (Produto produto : estoque.getProdutos()) {
                        if (produto.getNome().equals(nomeAtualizar)) {
                            produtoAtualizar = produto;
                            break;
                        }
                    }
                    if (produtoAtualizar != null) {
                        estoque.atualizarQuantidade(produtoAtualizar, novaQuantidade);
                        System.out.println("Quantidade atualizada.");
                    } else {
                        System.out.println("Produto não encontrado no estoque.");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
