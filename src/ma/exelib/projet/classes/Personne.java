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
		
		//accesseurs et mutateurs
		public int getId(){
			return id;
		}
		public String getNom(){
			return nom;
		}
		public String getPrenom(){
			return prenom;
		}
		public void setId(){
			id = ++count;
		}
		public void setNom(String xNom){
			nom =xNom;
		}
		public void setPrenom(String xPrenom){
			prenom = xPrenom;
		}
		//méthodes
		public String toString(){
			return "Je suis "+this.getNom()+" "+this.getPrenom();
		}
		
}
