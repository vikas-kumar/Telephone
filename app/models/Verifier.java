package models;

import java.util.Date;

import javax.persistence.Entity;

import net.sf.oval.constraint.Email;

import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.GenericModel;
import play.db.jpa.Model;
import javax.persistence.Id;


@Entity
public class Verifier extends GenericModel {
	
	@Id
	public int Id;
	public int Verif;
	
	
	public Verifier(int check) {
		super();
		this.Verif = check;
	}
	
	

}
