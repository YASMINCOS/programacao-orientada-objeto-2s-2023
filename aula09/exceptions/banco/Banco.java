package aula09.exceptions.banco;

import java.io.EOFException;
import java.util.ArrayList;

import aula09.exceptions.ContaNaoEncontradaException;
import aula09.exceptions.ValorDepositoInvalidoException;

public class Banco {
    
    private ArrayList<ContaCorrente> contas;

    public Banco(){
         this.contas = new ArrayList<>();
    }
    
    public void abrirConta(Double saldo,String nome, Integer numero){
         ContaCorrente conta = new ContaCorrente(saldo,nome, numero);
         contas.add(conta);
    }

    public ContaCorrente pesquisarConta(String nomeTitular){
        ContaCorrente contaEncontrada = null;

        for (ContaCorrente contaCorrente : this.contas) {
           if(contaCorrente.getNomeTitular().equals(nomeTitular)){
               System.out.println("Nome encontrado: " + nomeTitular + " Numero da conta " + contaCorrente.getNumeroConta());
               contaCorrente = contaCorrente;
           }else{
              System.out.println("Nome" + nomeTitular + " não encontrado.");
           }
        }

        return contaEncontrada;
    }

    public void depositar(Integer numero, Double valorDeposito) throws Exception{
        
        if(valorDeposito <= 0){
            throw new ValorDepositoInvalidoException();
        }

        ContaCorrente contaDeposito = null;

        for (ContaCorrente contaCorrente : this.contas) {

            if(contaCorrente.getNumeroConta() == numero){
                System.out.println("valor a ser depositado: " + valorDeposito + " na conta de numero: " + numero);
                contaDeposito = contaCorrente;
            }
        }

        if(contaDeposito == null){
            throw new ContaNaoEncontradaException();
        }

        contaDeposito.setSaldo(contaDeposito.getSaldo() + valorDeposito);
        System.out.println("saldo atual : " + contaDeposito.getSaldo());
    }
}
