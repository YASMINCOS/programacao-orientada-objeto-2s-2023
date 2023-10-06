package aula07.polimorfismo.mercado.produtos;

import aula07.polimorfismo.mercado.interfaces.ProdutoUnidade;

public class VendaAbacaxi extends Produto implements ProdutoUnidade{

    private Integer unidades;

    public VendaAbacaxi(String nome, Double preco, Integer unidades) {
        super(nome, preco);
        setUnidades(unidades);
    }

     public Integer getUnidades() {
        return this.unidades;
    }

    public void setUnidades(Integer unidade) {
        this.unidades = unidade;
    }

    @Override
    public Double calcPrecoUnidade() {
        return this.preco * getUnidades();
    }

    @Override
    public Double calcularTotal() {
        return calcPrecoUnidade();
    }

    @Override
    public String imprimirNotaFiscal(){
        return this.nome + "- R$ " + this.preco + " - Un. "+ this.getUnidades() + " Valor final - R$ " +
        calcPrecoUnidade();
    }
}
