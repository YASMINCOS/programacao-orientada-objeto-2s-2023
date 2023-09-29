package atividade5.sistemaVendas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private List<Integer> quantidades;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
        quantidades = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
    }

    public void removerProduto(int indice) {
        produtos.remove(indice);
        quantidades.remove(indice);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            total += produto.getPreco() * quantidade;
        }
        return total;
    }

    public List<Integer> getQuantidadesNoCarrinho() {
        return null;
    }

    public List<Produto> getProdutosNoCarrinho() {
        return null;
    }
}
