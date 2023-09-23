package lista02.sistemaVendas;
import java.util.List;

import lista02.sistemaVendas.controleClientes.Cliente;

public class Compra {

    private String data;
    private List<Produto> produto;
    private Cliente cliente;

    public Compra(){

    }

    public Compra(String data,Cliente cliente, List<Produto> produtosComprados) {
    }

    public Cliente getNomeCliente() {
        return this.cliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.cliente = nomeCliente;
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Produto> getProduto() {
        return this.produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    
}
