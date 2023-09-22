package aula06.heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Engenheiro extends Funcionario{
    
    //private String nome;
    //private Integer cpf;
    //private Integer telefone;
    //todos os funcionario terao o mesmo dado, por esse motivo criaremos uma class chmada FUNCIONARIO com os atributos;
    
    //ja esses atributos são unicos de um engenheiro 
    private String crea;
    private String projeto;

    public Engenheiro(){
        
    }

    public Engenheiro(String nome, Integer cpf, Integer numero, String crea, String projeto){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(numero);
        this.setCrea(crea);
        this.setProjeto(projeto);
    } 

    public String getCrea() {
        return this.crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getProjeto() {
        return this.projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    @Override
    public String toString() {
        return "" +
            "Profissao: Engenheiro \n" +
            "Nome = " + getNome() +" \n"+
            "CPF = " + getCpf() +" \n"+
            "Numero = " + getTelefone() + " \n"+
            "Crea = " + getCrea() + " \n" +
            "Projeto = " + getProjeto() + " \n" +
            "Salario = " + getSalario() + " \n" +
            //limitar o numero de casas decimais
            //TIPOS DE ARRENDONADMENO https://docs.oracle.com/javase/8/docs/api/java/math/RoundingMode.html#CEILING
            "Bonificacao = " + getBonificacao().setScale(2,RoundingMode.HALF_DOWN) + " \n" +
           // "Total = " + getSalario() + getBonificacao() + " \n" +
            "";
    }

        //BigDecimal - traz mais exatidao dos resultados com casas decimais, bastante utilizado para calculos grandes. Exemplo: em sistemas bancario
    //programa que calcula a rota de um foguete - maio exatidao possivel
    //o double arrendondoria o valor 

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(10000.00);
    }

     //nao é possivel fazer operacoes diretas, 
        //se estivesse usando double seria apenas getsalario * 0.5, porem o bigdecimal nos traz maior precisao
        //ocupa maior memoria- no c usamos o free aqui em java é feito automaticamente 
        //garbage collector - libera espaço em memória - é o processo pelo qual os programas Java executam o gerenciamento automático de memória.

    @Override
    public BigDecimal getBonificacao() {
        return getSalario().multiply(new BigDecimal(0.15));
    }

}
