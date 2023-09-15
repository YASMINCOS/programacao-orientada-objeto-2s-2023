package aula05.encapsulamento;

public class Executavel{
    
    public static void main(String[] args)  throws Exception {
       ContaCorrente c1 = new ContaCorrente(123, 10.00);
       ContaCorrente c2 = new ContaCorrente(124, 10.00);
       //c1.setNumero(0);
       System.out.println(c1);
       System.out.println(c2);
       //metodo static para não precisar criar instanias de objetos
       ContaCorrente.transferir(c1, c2, 3.0);
       System.out.println(c1);
       System.out.println(c2);
    }
}