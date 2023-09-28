package atividade5.sistemaVendas.tiposProdutos;

import atividade5.sistemaVendas.Produto;

public class Utilitarios extends Produto {
    private String tipo;

    public Utilitarios() {
    }

    public Utilitarios(String nome, Double preco, String tipo) {
        super(nome, preco); 
        setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nTipo: " + tipo;
    }
}
