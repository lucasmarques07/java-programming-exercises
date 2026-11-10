/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class SaqueThread extends Thread {

    private ContaBancaria conta;
    private double valor;

    public SaqueThread(String nome, ContaBancaria conta, double valor) {
        super(nome);
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void run() {
        if (conta.sacar(valor)) {
            System.out.println(getName() + ": saque de R$ " + valor + " realizado.");
        } else {
            System.out.println(getName() + ": saque não realizado. Saldo insuficiente.");
        }
    }
}
