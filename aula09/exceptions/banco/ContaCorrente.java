package aula09.exceptions.banco;

public class ContaCorrente {

    private Double saldo;
    private String nomeTitular;
    private Integer numeroConta;

    private ContaCorrente(){};

    public ContaCorrente(Double saldo, String nomeTitular, Integer numeroConta){
        setSaldo(saldo);
        setNomeTitular(nomeTitular);
        setNumeroConta(numeroConta);
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public String toString() {
        return
            " saldo ='" + getSaldo() + "'" +
            ", nomeTitular ='" + getNomeTitular() + "'" +
            ", numeroConta ='" + getNumeroConta() + "'" ;
    }
}
