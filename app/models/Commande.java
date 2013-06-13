package models;

import java.util.Date;

import javax.persistence.Entity;

import net.sf.oval.constraint.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Commande extends Model {
	
    @Required
	public String nomCli;
    @Required
    public String prenomCli;
    @Required	
    public int numAdr;
    @Required
    public String nomAdr;
    @Required
    public String villeAdr;
    @Required
    public String cpAdr;
    @Required
    public String paysAdr;
    @Required
	public String telCli;
	@Email
    @Required
    public String emailCli;
	
	public String modelProd;
	
	public String prixProd;
	
	public String marque;
	
	public Date dateCommande;

	public boolean actif;

	



	public Commande(String nomCli, String prenomCli, int numAdr, String nomAdr,
			String villeAdr, String cpAdr, String paysAdr, String telCli,
			String emailCli, String modelProd, String prixProd, String marque,
			Date dateCommande, boolean actif) {
		super();
		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.numAdr = numAdr;
		this.nomAdr = nomAdr;
		this.villeAdr = villeAdr;
		this.cpAdr = cpAdr;
		this.paysAdr = paysAdr;
		this.telCli = telCli;
		this.emailCli = emailCli;
		this.modelProd = modelProd;
		this.prixProd = prixProd;
		this.marque = marque;
		this.dateCommande = dateCommande;
		this.actif = actif;
	}


	public String getNomCli() {
		return nomCli;
	}


	public String getPrenomCli() {
		return prenomCli;
	}


	public int getNumAdr() {
		return numAdr;
	}


	public String getNomAdr() {
		return nomAdr;
	}


	public String getVilleAdr() {
		return villeAdr;
	}


	public String getCpAdr() {
		return cpAdr;
	}


	public String getPaysAdr() {
		return paysAdr;
	}


	public String getEmailCli() {
		return emailCli;
	}


	public String getTelCli() {
		return telCli;
	}




	@Override
	public String toString() {
		return nomCli;
	}
	



	public boolean isActif() {
		return actif;
	}


	public void setActifTrue() {
		this.actif = true;
	}
	
	
	
	
	

}
