package lista01.atividade03;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarQuantidade(Produto produto, int novaQuantidade) {
        if (produtos.contains(produto)) {
            produto.setQuantidade(novaQuantidade);
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }
}

