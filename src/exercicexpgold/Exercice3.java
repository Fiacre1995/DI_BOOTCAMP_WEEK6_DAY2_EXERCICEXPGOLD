package exercicexpgold;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("veuillez entrer une suite de nombre : ");
		Scanner sc = new Scanner(System.in);
        int nombreUser = sc.nextInt();
        int nbrePositif = 0;
        int nbreNegatif = 0;
        int nbreZero = 0;
        
        while(String.valueOf(nombreUser).length() != 0) {
            if(nombreUser > 0) {
                nbrePositif++;
            } else if(nombreUser < 0) {
                nbreNegatif++;
            }else {
                nbreZero++;
            }
            System.out.print("entrer un nombre : ");
            nombreUser = sc.nextInt();
        }
        System.out.println("le nombre de valeur positive est : " + nbrePositif + 
                "le nombre de nombre négative est : " + nbreNegatif +
                " le nombre de zero saisi est : " + nbreZero);
        

	}

}
