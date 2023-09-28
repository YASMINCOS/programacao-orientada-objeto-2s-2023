package atividade5.sistemaVendas;

public class Produto {
    
    protected String nome;
    protected Double preco;

    public Produto(){

    }

    public Produto(String nome, Double preco){
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
