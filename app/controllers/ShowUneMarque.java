package controllers;

import java.util.List;

import models.Produit;
import play.mvc.Controller;

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
