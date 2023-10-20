package aula08.collections;

import java.util.Vector;

public class ExemploVetor {

    public static void main(String[] args) {
        
        Vector<String> frutas = new Vector<>();
        
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Pêra");

        System.out.println(frutas.get(0));

        if(frutas.contains("Banana")){
            System.out.println("Banana esta no vetor");
        }

        frutas.remove("Banana");

        if(!frutas.contains("Banana")){
            System.out.println("Banana NÃO está no vetor");
        }

        frutas.clear();

        if(frutas.isEmpty()){
            System.err.println("O vetor está vazio");
        }

    }
    
}
