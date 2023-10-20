package aula08.collections;
import java.util.ArrayList;

public class ExemploArrayList{

    public static void main (String args[]){
        ArrayList<String> listaDeNomes = new ArrayList();

        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Carol");

        System.out.println(listaDeNomes.get(1));

        for(String nome : listaDeNomes){
            System.out.println(nome);
        }

        if(listaDeNomes.contains("Carol")){
            System.out.println("Carol esta na lista");
        }

        listaDeNomes.remove("Carol");

        if(!listaDeNomes.contains("Carol")){
            System.out.println("Carol NÃO esta na lista");
        }
    }

}
