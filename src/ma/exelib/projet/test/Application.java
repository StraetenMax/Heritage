package ma.exelib.projet.test;

import ma.exelib.projet.classes.Employe;
import ma.exelib.projet.classes.Etudiant;
import ma.exelib.projet.classes.Professeur;

public class Application {

	public static void main(String[] args) {
		Employe[] employes = new Employe[3];
		employes[0]= new Employe("DOUK","Rachid",5000.0);
		employes[1]= new Employe("DUPONT","Jean",15000.0);
		employes[2]= new Employe("MARTIN","Henri",20000.0);
	
		Etudiant[] etudiants = new Etudiant[3];
		etudiants[0]= new Etudiant("OBAKA","Med",65678754);
		etudiants[1]= new Etudiant("JACK","Paul",87543543);
		etudiants[2]= new Etudiant("VANDEER","Pierre",53454388);
		
		Professeur[] professeurs = new Professeur[3];
		professeurs[0]= new Professeur("TOTO","John",2300.0,"JAVA/JEE");
		professeurs[1]= new Professeur("TORCHE","Eric",1500.0,"Ruby");
		professeurs[2]= new Professeur("RICHARD","Philippe",3000.0,"PHP");
	}
	

}
