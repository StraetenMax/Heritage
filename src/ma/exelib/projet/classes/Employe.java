package ma.exelib.projet.classes;

public class Employe extends Personne{
		//propriétés
	protected double salaire;
	
	   //constructeurs
	public Employe(){
		super();
		salaire = 00.0;
	}
	public Employe(String cNom, String cPrenom, double cSalaire){
		super(cNom, cPrenom);
		salaire = cSalaire;
	}
		//accesseurs et mutateurs
	    public double getSalaire(){
	    	return salaire;
	    }
	    public void setSalaire(double xSalaire){
	    	salaire = xSalaire;		
	    }
	    //méthodes
	    public String toString(){
	    	return super.toString()+" mon salaire est de "+this.getSalaire();
	    }
	
}
