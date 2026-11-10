/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package application;

import java.util.Scanner;
import model.entities.ContaBancaria;
import model.exceptions.DomainException;
import model.exceptions.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo inicial: R$ ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        System.out.print("Valor do saque: R$ ");
        double valor = sc.nextDouble();

        try {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (DomainException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        sc.close();
    }
}
