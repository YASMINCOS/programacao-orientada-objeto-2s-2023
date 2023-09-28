package atividade5.sistemaVendas.controleClientes;

public class Pessoa {

    protected String nome;
    protected Integer cpf;
    protected String email;

    public Pessoa(){

    }

    public Pessoa(String nome, Integer cpf, String email){
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

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}