package aula06.heranca;

import aula06.heranca.empresa.Diretor;
import aula06.heranca.empresa.Engenheiro;
import aula06.heranca.empresa.Gerente;

public class Main {
    
    public static void main(String[] args) {
        
        Engenheiro eng1 = new Engenheiro("Nome",2445555,44555,"234","");
        System.out.println(eng1);

        Gerente gerente = new Gerente("Marcelo", 3, 3, 2);
        System.out.println(gerente);

        Diretor di = new Diretor("N",22233,2222,23);
        System.out.println(di);

    }
}
