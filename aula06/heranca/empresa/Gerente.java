package aula06.heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Funcionario{

    private Integer qtdGerenciados;

    public Gerente(){

    }

    public Gerente(String nome, Integer cpf, Integer numero, Integer qtdGerenciados ){
         this.setNome(nome);
         this.setCpf(cpf);
         this.setTelefone(numero);
         this.setQtdGerenciados(qtdGerenciados);
    }

    public Integer getQtdGerenciados() {
        return this.qtdGerenciados;
    }

    public void setQtdGerenciados(Integer qtdGerenciados) {
        this.qtdGerenciados = qtdGerenciados;
    }


    @Override
    public String toString() {
        return "" +
        "Profissao: Gerente \n" +
        "Nome = " + getNome() +" \n"+
        "CPF = " + getCpf() +" \n"+
        "Numero = " + getTelefone() + " \n"+
        "Quantidade de Gerenciados = " + getQtdGerenciados() + " \n" +
        "Salario = " + getSalario() + " \n" +
        "Bonificacao = " + getBonificacao().setScale(2,RoundingMode.HALF_DOWN) + " \n" +
        "";
    }

    @Override
    public BigDecimal getSalario() {
        return new BigDecimal(20000.00);
    }

    @Override
    public BigDecimal getBonificacao() {
        return getSalario().multiply(new BigDecimal(0.35));
    }
    
}
