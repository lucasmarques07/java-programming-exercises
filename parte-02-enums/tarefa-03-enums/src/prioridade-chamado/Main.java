/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Descrição do chamado: ");
        String descricao = sc.nextLine();

        System.out.print("Prioridade (BAIXA, MEDIA, ALTA, URGENTE): ");

        try {
            Prioridade prioridade = Prioridade.valueOf(sc.nextLine().trim().toUpperCase());
            Chamado chamado = new Chamado(descricao, prioridade);

            System.out.println("Chamado: " + chamado.getDescricao());
            System.out.println("Prioridade: " + chamado.getPrioridade());
            chamado.exibirMensagem();
        } catch (IllegalArgumentException e) {
            System.out.println("Prioridade inválida.");
        }

        sc.close();
    }
}
