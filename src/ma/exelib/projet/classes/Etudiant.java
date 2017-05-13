package ma.exelib.projet.classes;

public class Etudiant extends Personne {
		//propriétés
	private int cne;
	
		//constructeurs
	public Etudiant(){
		super();
		cne = 0;
	}
	public Etudiant(String cNom, String cPrenom, int cCne){
		super(cNom, cPrenom);
		cne = cCne;
	}
	// accesseurs et mutateurs
	public int getCne(){
		return cne;
	}
	public void setCne(int xCne){
		cne = xCne;
	}
	//méthodes
	public String toString(){
		return super.toString()+"mon CNE est de "+this.getCne();
	}
	
}
