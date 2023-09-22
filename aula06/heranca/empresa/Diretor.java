package aula06.heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor extends Funcionario{

    private Integer qtdDeGerencia;

    public Diretor(){

    }
    public Diretor(String nome, Integer cpf, Integer numero, Integer qtdGerencias ){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(numero);
        this.setQtdDeGerencia(qtdGerencias);
   }

    public Integer getQtdDeGerencia() {
        return this.qtdDeGerencia;
    }

    public void setQtdDeGerencia(Integer qtdDeGerencia) {
        this.qtdDeGerencia = qtdDeGerencia;
    }

    @Override
    public String toString() {
        return "" +
        "Profissao: Diretor \n" +
        "Nome = " + getNome() +" \n"+
        "CPF = " + getCpf() +" \n"+
        "Numero = " + getTelefone() + " \n"+
        "Quantidade de Gerencias = " + getQtdDeGerencia() + " \n" +
        "Salario = " + getSalario() + " \n" +
        "Bonificacao = " + getBonificacao().setScale(2,RoundingMode.HALF_DOWN) + " \n" +
        "";
    }

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(30000.00);
    }
    
    @Override
    public BigDecimal getBonificacao() {
        return getSalario().multiply(new BigDecimal(0.40));
    }

}
