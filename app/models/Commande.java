package models;

import java.util.Date;

import javax.persistence.Entity;

import net.sf.oval.constraint.Email;

import play.data.validation.Password;
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


	public Commande(String nomCli, String prenomCli, int numAdr, String nomAdr,
			String villeAdr, String cpAdr, String paysAdr, String emailCli,
			String telCli, String model, String prix, String marque,
			Date dateCommande) {
		super();


		this.nomCli = nomCli;
		this.prenomCli = prenomCli;
		this.numAdr = numAdr;
		this.nomAdr = nomAdr;
		this.villeAdr = villeAdr;
		this.cpAdr = cpAdr;
		this.paysAdr = paysAdr;
		this.emailCli = emailCli;
		this.telCli = telCli;
		this.modelProd = model;
		this.prixProd = prix;
		this.marque = marque;
		this.dateCommande = dateCommande;
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
	
	
	
	
	

}
