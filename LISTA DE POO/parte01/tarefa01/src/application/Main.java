/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package application;

import java.util.Scanner;
import model.entities.Aluno;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = Double.parseDouble(sc.next().replace(',', '.'));

        System.out.print("Matriculado (true/false): ");
        boolean matriculado = sc.nextBoolean();

        System.out.print("Nota 1: ");
        double nota1 = Double.parseDouble(sc.next().replace(',', '.'));

        System.out.print("Nota 2: ");
        double nota2 = Double.parseDouble(sc.next().replace(',', '.'));
        sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno(nome, idade, altura, matriculado, nota1, nota2, curso);

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
