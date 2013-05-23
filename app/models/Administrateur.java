package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Administrateur extends Model {
	
	public int numAdmin;
	public String pseudoAdmin;
	public String mdpAdmin;
	
	
	public int getNumAdmin() {
		return numAdmin;
	}


	public String getPseudoAdmin() {
		return pseudoAdmin;
	}


	public String getMdpAdmin() {
		return mdpAdmin;
	}


	public Administrateur(int numAdmin, String pseudoAdmin, String mdpAdmin) {
		super();
		this.numAdmin = numAdmin;
		this.pseudoAdmin = pseudoAdmin;
		this.mdpAdmin = mdpAdmin;
	}
	
	
	

}
