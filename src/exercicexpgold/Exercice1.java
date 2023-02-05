package exercicexpgold;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.print("entrer un nombre : ");
		 Scanner sc = new Scanner(System.in);
	        int nombreUser = sc.nextInt();
	        
	        int a = 0;
	        int b = 1;
	        int fibo;
	        System.out.println(a);
	        System.out.println(b);
	        for(int i = 1; i < nombreUser; i++) {
	            fibo = a + b;
	            a = b;
	            b = i;
	            System.out.println(fibo);
	        }

	}

}
