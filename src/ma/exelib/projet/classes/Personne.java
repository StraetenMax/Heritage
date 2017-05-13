package ma.exelib.projet.classes;

public class Personne {
		//proprietés
		protected int id;
		protected String nom;
		protected String prenom;
		public static int count;
		
		//constructeurs
		public Personne(){
			id = ++count;
			nom = "";
			prenom = "";
		}
		
		public Personne(String cNom, String cPrenom){
			id = ++count;
			nom = cNom;
			prenom = cPrenom;
		}
		
		
}
