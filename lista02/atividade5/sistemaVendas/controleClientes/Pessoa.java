package atividade5.sistemaVendas.controleClientes;

import java.math.BigInteger;

public class Pessoa {

    protected String nome;
    protected BigInteger cpf;
    protected String email;

    public Pessoa(){

    }

    public Pessoa(String nome, BigInteger cpf, String email){
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getCpf() {
        return this.cpf;
    }

    public void setCpf(BigInteger cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}