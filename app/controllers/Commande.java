package controllers;

import java.util.*;

import com.sun.security.ntlm.Client;

import play.*;
import play.mvc.*;
import play.data.validation.*; 
import models.*;
import play.libs.*;
import play.cache.*;


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
			)	
			{
			
				if(validation.hasErrors()) {
				String message = validation.errors().toString();
				render("showproduit/index.html", message);
				}
				else
				{
					java.util.Date dateCommande = new java.util.Date(); 
					models.Commande c = new models.Commande(nom, prenom, numrue, nomrue, ville, cp, pays, email, telephone, model, prix, marque,dateCommande);
					c.save();
					//System.out.println("Salut "+c.getPrenomCli());
					flash.success("Votre commande est enregistrée");
					Application.index();
				}
			}
    
}