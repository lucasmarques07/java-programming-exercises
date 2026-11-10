/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Matriculado (true/false): ");
        boolean matriculado = sc.nextBoolean();

        System.out.print("Nota final: ");
        double notaFinal = sc.nextDouble();
        sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno(nome, idade, altura, matriculado, notaFinal, curso);

        System.out.println("\n--- Dados do aluno ---");
        aluno.exibirDados();

        if (aluno.verificarAprovacao()) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        sc.close();
    }
}
