package atividade5;

import atividade5.sistemaVendas.CarrinhoDeCompras;
import atividade5.sistemaVendas.Produto;
import atividade5.sistemaVendas.Sistema;
import atividade5.sistemaVendas.controleClientes.Cliente;
import atividade5.sistemaVendas.tiposProdutos.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Sistema sistema = new Sistema();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(); // Crie um carrinho para o cliente
        int opcao = 0;

        // Criação e inicialização de produtos de cada tipo
        Eletronico eletronico1 = new Eletronico("uPhone", 999.99, "Orange", "BR");
        Eletronico eletronico2 = new Eletronico("Notebook Top", 3999.90, "Arte", "BSB");
        Livros livro1 = new Livros("Como Tocar o Sol?", 49.99, "Clark Quente", "29/09/2023", "Alien");
        Livros livro2 = new Livros("Mistérios do JAVA", 99.99, "[Unknown]", "21/12/2012", "JJ");
        Livros livro3 = new Livros("O Curso", 49.99, "Albert Einstein", "14/03/1879", "??");
        Utilitarios utilitario1 = new Utilitarios("SuperWinRAR", 129.49, "Compactador e Descompactador de arquivos");
        Utilitarios utilitario2 = new Utilitarios("VadeRetro", 289.90, "Antivírus");

        sistema.adicionarProduto(eletronico1);
        sistema.adicionarProduto(eletronico2);
        sistema.adicionarProduto(livro1);
        sistema.adicionarProduto(livro2);
        sistema.adicionarProduto(livro3);
        sistema.adicionarProduto(utilitario1);
        sistema.adicionarProduto(utilitario2);

        System.out.println("MERCADINHO\n");
        System.out.println("Faça seu cadastro\n");

        // Cadastro
        System.out.println("-------Cliente-------");
        // Pessoa >>> Cliente
        System.out.print("Digite seu nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Insira seu e-Mail: ");
        cliente.setEmail(scanner.nextLine());
        System.out.print("Digite seu CPF: ");
        cliente.setCpf(scanner.nextBigInteger());
        scanner.nextLine();
        // Cliente
        System.out.print("Telefone para contato: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("Insira seu Endereço: ");
        cliente.setEndereco(scanner.nextLine());

        while (opcao != 4) {
            System.out.println();
            System.out.println("Opções:");
            System.out.println("1. Selecionar Produto e Quantidade");
            System.out.println("2. Ver Carrinho");
            System.out.println("3. Informações dos produtos no carrinho");
            System.out.println("4. Sair");
            System.out.print("Selecione uma opção: ");

            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            System.out.println();

            switch (opcao) {
                case 1:
                    // Adicionar produtos no carrinho
                    System.out.println("Selecione um produto pelo número:");

                    List<Produto> produtosDisponiveis = sistema.listarProdutos();
                    for (int i = 0; i < produtosDisponiveis.size(); i++) {
                        Produto produto = produtosDisponiveis.get(i);
                        System.out.println((i + 1) + ". " + produto.getNome() + " - Preço: " + produto.getPreco());
                    }

                    System.out.print("Digite o número do produto: ");
                    int numeroProduto = scanner.nextInt();

                    if (numeroProduto >= 1 && numeroProduto <= produtosDisponiveis.size()) {
                        Produto produtoSelecionado = produtosDisponiveis.get(numeroProduto - 1);

                        System.out.print("Digite a quantidade desejada: ");
                        int quantidade = scanner.nextInt();
                        System.out.println();

                        carrinho.adicionarProduto(produtoSelecionado, quantidade);
                        System.out.println("Produto adicionado ao carrinho.");
                    } else {
                        System.out.println("Número de produto inválido.");
                    }

                    break;

                case 2:
                    // Mostrar o carrinho e os valores
                    List<Produto> produtosNoCarrinho = carrinho.getProdutos();
                    List<Integer> quantidadesNoCarrinho = carrinho.getQuantidades();

                    if (produtosNoCarrinho.isEmpty()) {
                        System.out.println("Seu carrinho está vazio.");
                    } else {
                        System.out.println("Carrinho de Compras:");
                        for (int i = 0; i < produtosNoCarrinho.size(); i++) {
                            Produto produto = produtosNoCarrinho.get(i);
                            int quantidade = quantidadesNoCarrinho.get(i);
                            System.out.println("Produto: " + produto.getNome() + " - Quantidade: " + quantidade);

                        }
                        double totalCompra = carrinho.calcularTotal();
                        System.out.println("Total: " + totalCompra);
                    }

                    break;

                case 3:
                    List<Produto> prodNoCarrinho = carrinho.getProdutos();

                    if (prodNoCarrinho.isEmpty()) {
                        System.out.println("Selecione algum produto para mostrar suas informações.");
                    } else {
                        for (int i = 0; i < prodNoCarrinho.size(); i++) {
                            System.out.println(prodNoCarrinho.get(i) + "\n");
                        }
                    }

                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }

        }

        double totalCompra = carrinho.calcularTotal();
        System.out.println("Compra finalizada. Obrigado, " + cliente.getNome() + "!");
        System.out.println("Valor Total da Compra: " + String.format("%.2f", totalCompra));

        scanner.close();
    }
}
