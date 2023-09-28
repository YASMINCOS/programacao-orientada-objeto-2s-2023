package atividade5.sistemaVendas;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static List<Produto> produtos;
    private static List<Integer> quantidades;

    public Carrinho() {
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

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static List<Integer> getQuantidades() {
        return quantidades;
    }

    public static double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            total += produto.getPreco() * quantidade;
        }
        return total;
    }
}
