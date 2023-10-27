package aula09.exceptions;

import aula09.exceptions.banco.Banco;

public class Main {

    public static void main(String[] args) {
        
        Banco brb = new Banco();
        brb.abrirConta(2.44,"Maria", 123);

        Banco itau = new Banco();
        itau.abrirConta(5.66,"Ana", 234);

        brb.pesquisarConta("Maria");
        itau.pesquisarConta("Ana");
        
        try {
            brb.depositar(123, 1000.0);
            itau.depositar(234, 4000.0);
        } catch (Exception e) {
            System.out.println("Não foi possível depositar. Tente novamente mais tarde");
            e.printStackTrace();
        }
    

    }
    
}
