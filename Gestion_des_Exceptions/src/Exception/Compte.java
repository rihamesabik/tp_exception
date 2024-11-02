package Exception;

public class Compte {
private String numero;
private double solde;
public Compte(String numero ,double solde){
	this.numero=numero;
	this.solde=solde;
}
public double getSolde() {
	return solde;
}
public void retirer(double mnt)throws SoldeInsuffisantException {
	if(solde<mnt) {
		throw new SoldeInsuffisantException("solde insuffisant");
	}
	solde-=mnt;
}
@Override
    public String toString() {
     return "[" + numero + ", " + solde + "]";

}
}
