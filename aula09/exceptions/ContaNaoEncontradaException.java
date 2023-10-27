package aula09.exceptions;

public class ContaNaoEncontradaException extends Exception {
    
    public ContaNaoEncontradaException(){
        super("Conta não encontrada");
    }
}
