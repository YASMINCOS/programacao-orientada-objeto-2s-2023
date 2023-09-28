package atividade5;

import atividade5.sistemaVendas.controleClientes.Cliente;
import atividade5.sistemaVendas.tiposProdutos.*;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        //Criação e inicialização de 2 produtos de cada tipo
        Eletronico eletronico1 = new Eletronico("uPhone",999.99,"Orange","BR");
        Eletronico eletronico2 = new Eletronico("Notebook Top",3999.90,"Arte","BSB");
        Livros livro1 = new Livros("Como Tocar o Sol?",49.99,"Clark Quente","29092023","Alien");
        Livros livro2 = new Livros("Mistérios do JAVA",99.99,"[Unknown]","21122012","JJ");
        Utilitarios utilitario1 = new Utilitarios("SuperWinRAR", 129.49, "Compactador e Descompactador de arquivos");
        Utilitarios utilitario2 = new Utilitarios("VadeRetro", 289.90, "Antivírus");

        System.out.println("MERCADINHO\n");

        //Cadastro
        System.out.println("Cliente");

        //Pessoa >>> Cliente
        System.out.print("        Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("      E-mail: ");
        cliente.setEmail(scanner.nextLine());
        System.out.print("         CPF: ");
        cliente.setCpf(scanner.nextInt());
        scanner.nextLine();
        
        //Cliente
        System.out.print("    Telefone: ");
        cliente.setTelefone(scanner.nextLine());
        System.out.print("    Endereço: ");
        cliente.setTelefone(scanner.nextLine());

        /*
            Coming soon...
        */

        scanner.close();
    }
}
