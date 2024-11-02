package Exception;

public class Compte2 {
	private String numero;
	private double solde;
	public Compte2(String numero ,double solde){
		this.numero=numero;
		this.solde=solde;
	}
	public double getSolde() {
		return solde;
	}
	public void retirer(double mnt)throws MontantNegatifException,SoldeInsuffisantException {
		if(mnt<0) {
			throw new MontantNegatifException("Le montant à retirer ne peut pas être négatif.");
		}
		if(solde<mnt) {
			throw new SoldeInsuffisantException("solde insuffisant");
		}
		solde-=mnt;
	}
	public void verser(double mnt)throws MontantNegatifException,SoldeInsuffisantException {
		if(mnt<0) {
			throw new MontantNegatifException("Le montant à retirer ne peut pas être négatif.");
		}
		if(solde<mnt) {
			throw new SoldeInsuffisantException("solde insuffisant");
		}
		solde+=mnt;
	}
}
