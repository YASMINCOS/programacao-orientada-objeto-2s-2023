package atividade5.sistemaVendas.controleClientes;

public class Cliente extends Pessoa {
    private String telefone;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, Integer cpf, String email, String telefone, String endereco) {
        super(nome, cpf, email);
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String formatarTelefone() {
        if (telefone != null && telefone.length() == 10) {
            String formattedTelefone = "(" + telefone.substring(0, 2) + ") " +
                                       telefone.substring(2, 6) + "-" +
                                       telefone.substring(6, 10);
            return formattedTelefone;
        } else {
            return "Telefone inválido";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() +
               "\nTelefone: " + formatarTelefone() + "\nEndereço: " + endereco;
    }
}
