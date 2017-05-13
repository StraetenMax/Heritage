package ma.exelib.projet.classes;

public class Professeur extends Employe {
		//propriétés
		private String specialite;
		
		//constructeur
		public Professeur(){
		super();
		specialite = "";
		}
		
		public Professeur(String cNom, String cPrenom, double cSalaire, String cSpecialite){
			super(cNom, cPrenom, cSalaire);
			specialite = cSpecialite;
		}
		//accesseur et mutateurs
}
