package controllers;

import java.util.*;

import com.sun.security.ntlm.Client;

import play.*;
import play.mvc.*;
import play.data.validation.*; 
import models.*;
import play.libs.*;
import play.cache.*;

public class ShowUneMarque extends Controller {
 
	public static void index(String id) {
		List<Produit> listeProduit = Produit.find(
				"select distinct p from Produit p join p.marque as m where m.nomMarque = ?", id
				).fetch();
		if (listeProduit.isEmpty()) {
			flash.success("Il n'y a pas de telephone pour cette marque");
			Application.index();
		} else {
			render(listeProduit);
		}
    }
	
}
