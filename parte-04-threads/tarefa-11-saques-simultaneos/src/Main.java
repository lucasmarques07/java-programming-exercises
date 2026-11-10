/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ContaBancaria conta = new ContaBancaria(1000.0);

        SaqueThread saque1 = new SaqueThread("Thread 1", conta, 700.0);
        SaqueThread saque2 = new SaqueThread("Thread 2", conta, 700.0);

        saque1.start();
        saque2.start();

        saque1.join();
        saque2.join();

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
