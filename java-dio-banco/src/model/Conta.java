package model;

public interface Conta {
    void saque(Double valorSaque);

    void verificaSaque(Conta conta);

    void depositar(Double valorDeposito);

    void transferencia(Conta contaASacar, Conta contaASerDepositada, double valor);
}
