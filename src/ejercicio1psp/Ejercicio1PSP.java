/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1psp;

/**
 *
 * @author Óscar
 */
public class Ejercicio1PSP extends Thread {

    private int n;

    public Ejercicio1PSP(int n) {
        super();
        this.n = n;
    }

    @Override
    public void run() {

        int fib = 1;
        int fib2 = 0;
        System.out.println(fib);
        for (int i = 0; i < n - 1; i++) {
            fib = fib + fib2;
            System.out.println(fib);
            fib2 = fib - fib2;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = new Ejercicio1PSP(7);
        t.start();
    }

}
