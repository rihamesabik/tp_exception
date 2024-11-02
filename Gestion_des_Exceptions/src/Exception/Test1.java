package Exception;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=3;
      int b=0;
      try {
      double resultat=a/b;
      System.out.println("resultat de quotient:"+resultat);
	}catch (ArithmeticException e) {
		System.out.println("Erreur:"+e.getMessage());
	}
	finally {
		System.out.println("le programme s'est terminé correctement");	}
}
}