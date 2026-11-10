/*
 * Lucas Marques Almeida - 0024283
 * Roberto Carlos Martins - 0023293
 */

public class Main {

    public static void main(String[] args) {
        ThreadNumeros numeros = new ThreadNumeros();
        ThreadLetras letras = new ThreadLetras();

        numeros.start();
        letras.start();
    }
}
