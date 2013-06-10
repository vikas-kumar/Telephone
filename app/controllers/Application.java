package controllers;

import java.util.*;

import com.sun.security.ntlm.Client;

import play.*;
import play.mvc.*;
import play.data.validation.*; 
import models.*;
import play.libs.*;
import play.cache.*;


public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void validerId(@Required int id) {
    	
    	for(Verifier verif : Verifier.<Verifier>findAll()){
    		
    		if (verif.getVerif() == id){
    			System.out.println("ON RENTRE DANS LA BOUCLE");
    			

    			for(models.Commande comm : models.Commande.<models.Commande>findAll())
    			{
    				if (comm.getEmailCli().equals(verif.getMail()))
    				{
    					System.out.println("Rentre dans le If");
    					comm.setActif(true);
    					verif.delete();
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
    	
    	System.out.println("id = "+id);
    	
    }
    }
	
