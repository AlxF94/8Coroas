
package pkg8rainhas;

import java.util.Scanner;

/**
 *
 * @author Álex
 */
public class AllQueens {
    public static void main(String[] args) {
      
        Scanner stdin = new Scanner(System.in);
        System.out.println("Numero de rainhas a colocar?");
        int nr= stdin.nextInt();
        Queens q = new Queens(nr);
        q.colocaRainha();
    }
    
}
