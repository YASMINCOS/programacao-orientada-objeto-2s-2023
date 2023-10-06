package aula07.polimorfismo.mercado.produtos;

import aula07.polimorfismo.mercado.interfaces.ProdutoGranel;

public class VendaAlho extends Produto implements ProdutoGranel {

    private Double peso;

    public VendaAlho(String nome, Double preco, Double peso) {
        super(nome, preco);
        setPeso(peso);
    }

    @Override
    public Double calcPrecoGranel() {
        return getPeso() * this.preco;
    }

    @Override
    public Double calcularTotal() {
        return calcPrecoGranel();
    }

    @Override
    public String imprimirNotaFiscal(){
        return this.nome + "- R$ " + this.preco + " - Kg. "+ this.getPeso() + " Valor final - R$ " +
        calcPrecoGranel();
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
}
