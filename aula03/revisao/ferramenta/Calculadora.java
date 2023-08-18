package aula03.revisao.ferramenta;

public class Calculadora {

    public int a;
    public int b;
    private String operador;

    public String getOperador(){
      return this.operador;
    }

    public void setOperador(String op) throws Exception{
        this.operador = op;
    }
    
    public int operar(){
        int ret = 0;

        switch(this.operador){
            case "+":
              ret = this.a + this.b;
              break;
            case "-":
              ret = this.a - this.b;
              break; 
            case "*":
              ret = this.a * this.b;
              break; 
            case "/":
              ret = this.a / this.b;
              break;     
            case "%":
              ret = this.a % this.b;
              break; 
            default:
              System.out.println("Operação invalida!");
              break;  
        }
        return ret;
    }
    
}
