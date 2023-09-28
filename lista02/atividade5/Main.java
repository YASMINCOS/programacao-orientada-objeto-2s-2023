package atividade5;

import atividade5.sistemaVendas.controleClientes.Cliente;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

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

        scanner.close();
    }
}
