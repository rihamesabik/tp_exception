package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCompte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc =new Scanner(System.in);
      Compte2 cp2=new Compte2("abc345",500);
      float mnt;
      try {
    	  System.out.println("entrer le montant:");
    	  mnt=sc.nextFloat(); 
    	   cp2.retirer(mnt);
    	  }catch(MontantNegatifException e) {
    		 System.out.println(e.getMessage());
    	  } catch (SoldeInsuffisantException e) {
              System.out.println(e.getMessage());
          } catch (InputMismatchException e) {
              System.out.println("Erreur : Vous devez entrer un nombre valide.");
          }finally {
              sc.close();
          }
      
      
	}

}
