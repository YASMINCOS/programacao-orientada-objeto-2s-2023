package atividade5.sistemaVendas.tiposProdutos;

import atividade5.sistemaVendas.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Livros extends Produto {
    private String autor;
    private String dataPublicacao;
    private String editora;

    public Livros() {
    }

    public Livros(String nome, Double preco, String autor, String dataPublicacao, String editora) {
        super(nome, preco);
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String formatarData() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
            Date data = sdf.parse(this.dataPublicacao); 
            SimpleDateFormat novoSdf = new SimpleDateFormat("zz-zz-zzzz"); 
            return novoSdf.format(data); 
        } catch (ParseException e) {
            e.printStackTrace();
            return "Data inválida"; 
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nPreço: " + getPreco() + "\nAutor: " + autor +
               "\nData de Publicação: " + formatarData() + "\nEditora: " + editora;
    }
}
