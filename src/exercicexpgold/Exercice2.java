package exercicexpgold;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double log = 1;
        
        System.out.print("entrer un nombre :");
        Scanner sc = new Scanner(System.in);
        int nombreUser = sc.nextInt();
        
        double i = 1;
        
        while(i < nombreUser) {
            if(i % 2 == 0) {
                log = log - (1/i);
            }else {
                log = log + (1/i);
            }
            i++;
        }
        
        System.out.println("le logarithme de " + nombreUser + " est : " + log);
        

	}

}
