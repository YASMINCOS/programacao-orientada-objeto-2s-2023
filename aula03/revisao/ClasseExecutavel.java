package aula03.revisao;

import aula03.revisao.ferramenta.Calculadora;

public class ClasseExecutavel {
    

    public static void main(String[] args)  throws Exception {

        Calculadora calculadora = new Calculadora();

        calculadora.a = 3;
        calculadora.b = 5;
        calculadora.setOperador("+"); 
        System.out.println(calculadora.operar());

        Pessoa joao = new Pessoa("ola");
        Pessoa pedro = new Pessoa("Fala meu patrao");

        joao.cumprimentar();
        pedro.cumprimentar();
    }
}
