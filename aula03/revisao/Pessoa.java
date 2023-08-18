package aula03.revisao;

public class Pessoa {
    
   public String palavraCumprimento;

   public Pessoa(String palaString){
      this.palavraCumprimento = palaString;
   }

   public void cumprimentar(){
    System.out.println(this.palavraCumprimento);
   }
}
