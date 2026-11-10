/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Notebook");

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Status inicial: " + pedido.getStatus());

        pedido.setStatus(StatusPedido.APROVADO);
        System.out.println("Status atualizado: " + pedido.getStatus());
    }
}
