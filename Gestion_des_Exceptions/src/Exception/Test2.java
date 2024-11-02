package Exception;

import java.util.Scanner;

public class Test2 {
public static int convertirEnEntier(String nombre) {
    	return Integer.parseInt(nombre)  ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc =new Scanner(System.in);
    String nbr;
    System.out.println("entrer un nombre:");
    nbr=sc.nextLine();
    try {
    	System.out.println(convertirEnEntier(nbr));
    	System.out.println("nombre:"+nbr);
    }catch(NumberFormatException e) {
    	System.out.println("Erreur : La saisie '" + nbr + "' n'est pas un nombre valide.");
    	
    	
    }
    finally {
    	System.out.println("Conversion terminée.");
    }
	}

}
