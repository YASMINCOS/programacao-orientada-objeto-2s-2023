package aula04;

import java.util.ArrayList;

public class Livraria implements GenericLivro{
    
   ArrayList <Livro> livros;
   Livraria(){
    this.livros = new ArrayList<Livro>();
   }

    @Override
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    @Override
    public String detalharLivros(int p) {
        String detalhe = "";
        for(Livro livro : livros){
            if(livro.getIdLivro() == p){
                detalhe = livro.detalhar();
            }

        }
        return detalhe;
    }

    @Override
    public String listarLivros() {
        String txt = "";

        for (Livro livro : this.livros) {
              txt += "\n" + livro.getIdLivro() + "-" + livro.getTitulo();
        }
        return txt;        
    }

}
