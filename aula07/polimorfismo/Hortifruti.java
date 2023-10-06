package aula07.polimorfismo;

import aula07.polimorfismo.mercado.CarrinhoDeCompras;
import aula07.polimorfismo.mercado.produtos.VendaAbacaxi;
import aula07.polimorfismo.mercado.produtos.VendaAlho;

public class Hortifruti {
    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        VendaAbacaxi a1 = new VendaAbacaxi("abacaxi comum", 5.99, 2);
        VendaAlho a2 = new VendaAlho("Alho", 12.99, 0.5);
        carrinhoDeCompras.adicionarProduto(a1);
        carrinhoDeCompras.adicionarProduto(a2);


        System.out.println(carrinhoDeCompras.finalizarCompra());
    }
}
