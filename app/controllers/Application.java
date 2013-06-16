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
    
    @SuppressWarnings("deprecation")
	public static void validerId(@Required int id) throws EmailException {
    	
    	
    	
    	Date d = new  Date(1990, 8, 04, 05, 45, 15);
		Date d1 = new  Date(1990, 8, 04, 05, 46, 16);
		
		
		Long diff = d1.getTime() - d.getTime();
		System.out.println(d+"  "+d1+"     "+diff);
		
		
    	for(Verifier verif : Verifier.<Verifier>findAll()){
    		
    		if (verif.getVerif() == id){
    			System.out.println("ON RENTRE DANS LA BOUCLE");
    			

    			for(models.Commande comm : models.Commande.<models.Commande>findAll())
    			{
    				if (comm.getEmailCli().equals(verif.getMail()))
    				{
    					Date dateNow = new Date();
    					Long newDiff =  dateNow.getTime() - comm.getDateCommande().getTime();
    					if(newDiff < diff)
    					{
	    					comm.actif = true;
	    					comm.save();
	    					verif.delete();
	    					Mails.confirmeCommandeAdmin(comm);
	    					flash.success("Votre commande est bien prise en compte et sera traitée prochainement");
	    					Application.index();
	    					System.out.println("VOIIIIIIIIIIIIIIRR ICIIIIII  :"+newDiff+" "+diff);
    					}
    					else
    					{
    						comm.delete();
    						verif.delete();
    						flash.success("Votre commande est expirée");
    						Application.index();
    						System.out.println("VOIIIIIIIIIIIIIIRR ICIIIIII  :"+newDiff+" "+diff);
    					}
    				} else{
    					System.out.println("On ne rentre pas dans le If : premier:"+verif.getMail()+" deuxieme:"+comm.getEmailCli());
    				}
    			}
    			
    		}
    		else
    		{
    			System.out.println("ON NE RENTRE PAS DANS LA BOUCLE");
    		}
    		
    	}
    	
    	
    }
    }
	
