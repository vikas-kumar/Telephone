package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.data.validation.Required;
import play.db.jpa.GenericModel;


@Entity
public class Verifier extends GenericModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long Id;
	
	@Required
	public int Verif;
	
	@Required
	public String mail;
	
	
	public Verifier(int verif, String mail) {
		super();
		Verif = verif;
		this.mail = mail;
	}


	public int getVerif() {
		return Verif;
	}


	public void setVerif(int verif) {
		Verif = verif;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	

}
