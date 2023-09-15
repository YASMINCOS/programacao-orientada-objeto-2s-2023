package aula05.encapsulamento;

public class ContaCorrente{

    private Integer numero;
    private Double saldo;

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) throws Exception {
        //controle sobre a atribuicao
        if(numero > 0){
            this.numero = numero;
        }else{
            //declarar que o metodo esta lidando com excecao
            throw new Exception("Numero invalido");
        }
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public ContaCorrente(){
        //sobrecarga de metodo- metodo com mesmo nome mas com assinaturas diferentes
    }

    public ContaCorrente(Integer numero){
        this.numero = numero;
    }
    
    public ContaCorrente(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;

    }

    public void transferir (ContaCorrente contaDestino, Double valorTransferencia) throws Exception{
       if(getSaldo() >= valorTransferencia){
           this.saldo = getSaldo() - valorTransferencia;
           contaDestino.depositar(valorTransferencia);
       }else{
           //getsaldo- retorna o valor do this saldo
           throw new Exception("Erro na tarnsferencia, contate um administrador.");
       }
    }

    public void depositar(Double valorDeposito) throws Exception{
        if(valorDeposito >0 ){
           this.saldo = getSaldo() + valorDeposito;
        }else{
            throw new Exception("O valor deve ser maior que 0.");
        }
    }

    public static void transferir(ContaCorrente cOrigem, ContaCorrente cDestino, Double valorTranseferencia) throws Exception{
       cOrigem.transferir(cDestino, valorTranseferencia);
    }

    @Override
    public String toString() {
        return "{" +
            " numero da conta='" + getNumero()+ "'" +
            ", saldo da conta='" + getSaldo() + "'" +
            "}";
    }

}