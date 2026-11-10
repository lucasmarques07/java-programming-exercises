/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

package model.threads;

public class ThreadLetras extends Thread {

    @Override
    public void run() {
        for (char letra = 'A'; letra <= 'J'; letra++) {
            System.out.println("Thread 2 - Letra: " + letra);
        }
    }
}
