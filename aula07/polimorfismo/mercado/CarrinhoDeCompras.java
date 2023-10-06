package aula07.polimorfismo.mercado;

import java.util.ArrayList;

import aula07.polimorfismo.mercado.produtos.Produto;

public class CarrinhoDeCompras {

    private ArrayList<Produto> produtos;

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public String finalizarCompra(){
       String notaFiscal ="";
       Double precoTotal = 0.0;

       for (Produto produto : produtos) {
            precoTotal += produto.calcularTotal();
            notaFiscal += produto.imprimirNotaFiscal() + "\n";
       }
       notaFiscal += "\n Preço total: R$ " + precoTotal;
       return notaFiscal;
    }
    
}
