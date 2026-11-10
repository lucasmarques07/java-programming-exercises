/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package service;

import enums.StatusPedido;
import model.Pedido;

public class ProcessadorPedido extends Thread {

    private Pedido pedido;

    public ProcessadorPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void run() {
        try {
            // Simula o tempo de processamento do pedido.
            Thread.sleep(3000);
            pedido.setStatus(StatusPedido.CONCLUIDO);
        } catch (InterruptedException e) {
            pedido.setStatus(StatusPedido.PENDENTE);
            Thread.currentThread().interrupt();
        }
    }
}
