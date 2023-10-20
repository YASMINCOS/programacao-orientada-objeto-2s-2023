package aula08.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class ExemploHasMap {

    public static void main(String[] args) {
        
        HashMap<String, String> capitais = new HashMap<>();

        capitais.put("Brasil", "Brasilia");
        capitais.put("França", "Paris");
        capitais.put("Japão", "Tóquio");
        System.out.println(capitais.entrySet());
        System.out.println(capitais.values());

        if(capitais.containsKey("França")){
            System.out.println(capitais.get("França"));
        }

        for (String chave : capitais.keySet()) {
            System.out.println(chave + '-' + capitais.get(chave));
        }
    }
    
}
