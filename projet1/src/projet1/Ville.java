package projet1;

public class Ville {
	
	private String nomVille;
	private String nomPays;
	public int nbrHabitants;
	
	

	// Constructeur d'une ville par d�faut
public Ville( String nomVille, String nomPays, int nbrHabitants) {
	this.nomVille = nomVille;
	this.nomPays = nomPays;
	this.nbrHabitants = nbrHabitants;
}

//**************Getters****************
//retourne le nom de la ville 
public String getNom()  {
	return nomVille;
}

//retourne nom du Pays
public String getNomPays( ) {
	return nomPays;
}

//retourne nombre des habitants 
public int getnbrHabitants( ) {
	return nbrHabitants;
}


//*************Setters******************
public void setNomVille (String nomVille) {
	this.nomVille = nomVille;	
}

public void setNomPays (String nomPays) {
	this.nomPays = nomPays;
}

public void setNbrHabitants (int nbrHabitants) {
	this.nbrHabitants = nbrHabitants;
}


}

