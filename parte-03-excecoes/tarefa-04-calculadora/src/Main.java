/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Primeiro número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Segundo número: ");
            double numero2 = sc.nextDouble();

            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Escolha uma operação: ");
            int opcao = sc.nextInt();

            Calculadora calculadora = new Calculadora(numero1, numero2);
            double resultado;

            if (opcao == 1) {
                resultado = calculadora.somar();
            } else if (opcao == 2) {
                resultado = calculadora.subtrair();
            } else if (opcao == 3) {
                resultado = calculadora.multiplicar();
            } else if (opcao == 4) {
                resultado = calculadora.dividir();
            } else {
                throw new IllegalArgumentException("Operação inválida. Escolha de 1 a 4.");
            }

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números nos campos solicitados.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Calculadora encerrada.");
        }
    }
}
