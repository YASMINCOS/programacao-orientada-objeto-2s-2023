package aula06.heranca.empresa;

import java.math.BigDecimal;

public class Funcionario {
    
    private String nome;
    private Integer cpf;
    private Integer telefone;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public BigDecimal getSalario() {
        return this.getSalario();
    }

    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.05));
    } 

}