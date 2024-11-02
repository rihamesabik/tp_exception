package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    System.out.println("entre un nombre:");
    try {
    	 float nbr =sc.nextFloat();
    	 System.out.println("Vous avez entré : " + nbr);
    }catch( InputMismatchException e) {
    	System.out.println("Erreur:Vous devez entrer un nombre valide.");
    }
	}

}
