package controllers;

import java.util.Random;

import models.Verifier;

import org.apache.commons.mail.EmailException;

import play.data.validation.Required;
import play.mvc.Controller;


public class Commande extends Controller 
{
 public static void index() {
        render();
    }
   
	 public static void commande(String model,String prix,String marque,@Required(message="Saisir le nom") String nom,
			@Required(message=" Saisir le prenom ") String prenom,
			@Required(message=" Saisir le numéro de la rue") int numrue,
			@Required(message=" Saisir le nom de la rue") String nomrue,
			@Required(message=" Saisir la ville") String ville,
			@Required(message=" Saisir le code postal") String cp,
			@Required(message=" Saisir le pays") String pays,
			@Required(message=" Saisir le téléphone") String telephone,
			@Required(message=" Saisir le courriel") String email
			) throws EmailException	
			{
			
				if(validation.hasErrors()) {
				String message = validation.errors().toString();
				render("showproduit/index.html", message);
				}
				else
				{
					java.util.Date dateCommande = new java.util.Date(); 
					models.Commande c = new models.Commande(nom, prenom, numrue, nomrue, ville, cp, pays, telephone, email, model, prix, marque,dateCommande, false);
					c.save();
					flash.success("Votre commande est enregistrée "+c.getPrenomCli());

					
					Random r = new Random();
					int valeur = 0 + r.nextInt(100 - 0);
					
					models.Verifier value = new models.Verifier(valeur, c.getEmailCli());
					
					value.save();
					mailer.Mails.welcome(c, valeur); 
					System.out.println(valeur);
					
					Application.index();
					
				}
			}
    
}