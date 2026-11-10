/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package model.entities;

import model.exceptions.DomainException;
import model.exceptions.SaldoInsuficienteException;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor < 0) {
            throw new DomainException("O valor do saque não pode ser negativo.");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }

        saldo -= valor;
    }
}
