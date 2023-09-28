package atividade5.sistemaVendas;

import java.util.ArrayList;
import java.util.List;
import atividade5.sistemaVendas.controleClientes.Cliente;

public class Sistema {

    private static List<Produto> produtos;
    private List<Cliente> clientes;
    private List<Compra> compras;
    //private static Produto[] listaDeProdutos;

    public Sistema() {
        produtos = new ArrayList<>();
        clientes = new ArrayList<>();
        compras = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

     public List<Produto> listarProdutos() {
        return produtos;
    }
    
    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto; 
            }
        }
        return null; 
    }

    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarClientePorCPF(Integer cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente; 
            }
        }
        return null; 
    }

    public void realizarCompra(String data,Cliente cliente, List<Produto> produtosComprados) {
        Compra compra = new Compra(data,cliente, produtosComprados);
        compras.add(compra);
    }

    public List<Compra> listarComprasCliente(Cliente cliente) {
        List<Compra> comprasCliente = new ArrayList<>();
        for (Compra compra : compras) {
            if (compra.getNomeCliente().equals(cliente)) {
                comprasCliente.add(compra);
            }
        }
        return comprasCliente;
    }

    public List<Compra> listarComprasProdutos() {
        return compras;
    }

    public List<Compra> listarComprasProduto(Produto produto) {
        List<Compra> comprasProduto = new ArrayList<>();
        for (Compra compra : compras) {
            if (compra.getProduto().contains(produto)) {
                comprasProduto.add(compra);
            }
        }
        return comprasProduto;
    }
}
