package aula08.collections;

import java.util.HashSet;

public class ExemploHasSet {

    public static void main(String[] args) {
        
        HashSet<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(3);

        for (Integer i : inteiros) {
             System.out.println(i);
        }
    }
    
}
