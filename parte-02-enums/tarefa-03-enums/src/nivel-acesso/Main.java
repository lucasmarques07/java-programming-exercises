/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nível de acesso (ADMINISTRADOR, GERENTE, USUARIO): ");

        try {
            NivelAcesso nivel = NivelAcesso.valueOf(sc.nextLine().trim().toUpperCase());

            switch (nivel) {
                case ADMINISTRADOR:
                    System.out.println("Permissões: cadastrar, consultar, alterar e excluir.");
                    break;
                case GERENTE:
                    System.out.println("Permissões: cadastrar, consultar e alterar.");
                    break;
                case USUARIO:
                    System.out.println("Permissões: consultar.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Nível de acesso inválido.");
        }

        sc.close();
    }
}
