package ma.exelib.projet.classes;

public class Etudiant extends Personne {
		//propriétés
	private String cne;
	
		//constructeurs
	public Etudiant(){
		super();
		cne = "";
	}
	public Etudiant(String cNom, String cPrenom, String cCne){
		super(cNom, cPrenom);
		cne = cCne;
	}
	// accesseurs et mutateurs
	
}
