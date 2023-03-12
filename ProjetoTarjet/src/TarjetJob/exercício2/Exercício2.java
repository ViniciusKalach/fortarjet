package TarjetJob.exercício2;

import java.util.Scanner;

/**
 *
 * @author Vinícius Kalach
 */
public class Exercício2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int f = 0;
        
        System.out.println("Escreva um valor.");
        int n = ler.nextInt();
        
        for (int i = 1; i <= n; i++ ) {
            int i_ant = i - 1;
            f = i + i_ant;
            System.out.println(i + " + " + i_ant + " = " + f);
            
            if (f == n) {
                System.out.println("O valor " + n + " pertence a sequência de Fibonacci.");
                break;
            }
        }
        
        if (f != n) { 
            System.out.println("O valor " + n + " não pertence a sequencia de Fibonacci.");
        }
        
        
        ler.close();
    }
}
