package aula04;

public class Livro{ 

     int idLivro;
    private String titulo;
    private String autor;
    private String anoDePublicacao;
    private String editora;
    private int qtdDePaginas;

    public Livro(int idLivro, String titulo ,String autor, String anoDePublicacao, String editora, int qtdDePaginas) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.editora = editora;
        this.qtdDePaginas = qtdDePaginas;
    }

    public String detalhar() {
		return "Livro [id="  + this.idLivro + ", titulo =" + this.titulo 
            + ",\n autor =" + this.autor + ", totPag =" + this.qtdDePaginas
            + ",\n editora =" + this.editora
			+ ",\n ano de publicacao =" + this.anoDePublicacao + "]";
	}

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public int getQtdDePaginas() {
        return qtdDePaginas;
    }

    public void setQtdDePaginas(int qtdDePaginas) {
        this.qtdDePaginas = qtdDePaginas;
    }
}
