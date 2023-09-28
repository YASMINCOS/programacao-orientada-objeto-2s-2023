package atividade5.sistemaVendas.tiposProdutos;

import atividade5.sistemaVendas.Produto;

public class Eletronico extends Produto {

    private String marca;
    private String modelo;

    public Eletronico() {
    }

    public Eletronico(String nome, Double preco, String marca, String modelo) {
        super(nome, preco);
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}
