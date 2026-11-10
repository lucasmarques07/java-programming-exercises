/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package model.threads;

public class ThreadNumeros extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 - Número: " + i);
        }
    }
}
