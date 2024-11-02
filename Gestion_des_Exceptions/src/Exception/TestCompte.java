package Exception;

public class TestCompte {
	public static void main(String[] args) {
		Compte cp=new Compte("AK124",500);
		try {
			cp.retirer(600);
			
		}catch(SoldeInsuffisantException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
}
}