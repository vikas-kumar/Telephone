package controllers;

import java.util.*;

import org.apache.commons.mail.EmailException;

import com.sun.security.ntlm.Client;

import play.*;
import play.mvc.*;
import play.data.validation.*; 
import mailer.Mails;
import models.*;
import play.libs.*;
import play.cache.*;


public class Application extends Controller {

    public static void index() {
        render();
    }
    
    
    
    //Validation d'une commande en récupérant le nombre aléatoire par l'URL
    @SuppressWarnings("deprecation")
	public static void validerId(@Required int id) throws EmailException {
    	
    	
    	//Calcul en milliseconde de 15jours
    	Date d = new  Date(1990, 8, 0, 05, 45, 15);
		Date d1 = new  Date(1990, 8, 15, 05, 44, 15);
		
		//Calcul en milliseconde de 15 jours
		Long diff = d1.getTime() - d.getTime();
		
		//Nous parcourons toutes les lignes de la table Verifier
    	for(Verifier verif : Verifier.<Verifier>findAll()){
    		
    		//Si l'id de la table match avec le nombre récupéré dans l'URL
    		if (verif.getVerif() == id){
    			//Nous parcourons toutes les commandes
    			for(models.Commande comm : models.Commande.<models.Commande>findAll())
    			{
    				//Si le mail de la commande match avec le mail de la table Verifier
    				if (comm.getEmailCli().equals(verif.getMail()))
    				{
    					//Création d'une nouvelle date 
    					Date dateNow = new Date();
    					
    					//Calcul du temps passé entre le jour de la commande et aujourd'hui en milliseconde
    					Long newDiff =  dateNow.getTime() - comm.getDateCommande().getTime();
    					
    					//Si le temps en milliseconde est inférieur aux 15 jours
    					if(newDiff < diff)
    					{
    						//La commande passe en Actif
	    					comm.actif = true;
	    					comm.save();
	    					
	    					//Nous supprimons la ligne dans Verifier
	    					verif.delete();
	    					
	    					//Envoie d'un mail de confirmation à l'admin
	    					Mails.confirmeCommandeAdmin(comm);
	    					
	    					flash.success("Votre commande est bien prise en compte et sera traitée prochainement");
	    					Application.index();
    					}
    					else ////Si le temps en milliseconde est supérieur aux 15 jours
    					{
    						//Nous supprimons la commande
    						comm.delete();
    						//Nous supprimons la ligne la ligne dans Verifier
    						verif.delete();
    						
    						flash.success("Votre commande est expirée");
    						Application.index();
    					}
    				} else
    				{
    					
    					Application.index();
    				}
    			}
    			
    		}
    		
    	}
    	
    	
    }
    }
	
