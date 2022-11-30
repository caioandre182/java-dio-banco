package model;

public class ContaCorrente implements Conta{

    private Integer numeroConta;
    private Integer numeroAgencia;
    private Double saldo;

    public ContaCorrente(Integer numeroConta, Integer numeroAgencia, Double saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }

    @Override
    public void saque(Double valorSaque) {
        if(verificaSaldo(valorSaque)){
            this.saldo = this.saldo - valorSaque;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void verificaSaque(Conta conta) {
        System.out.println("O saldo é de: R$" + this.saldo);
    }

    @Override
    public void depositar(Double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public void transferencia(Conta contaASacar, Conta contaASerDepositada, double valor) {
        contaASacar.saque(valor);
        contaASerDepositada.depositar(valor);
    }

    private Boolean verificaSaldo(Double valorSaque){
        if(valorSaque > this.saldo)
            return false;
        return true;
    }
}
