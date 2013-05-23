package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
import play.data.validation.Required;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Produit extends Model {

	@ManyToOne
	@Required
	public Marque marque;
	@Required
	public String modelProd;
	@Required
	public String dimensionProd;
	@Required
	public int capaciteProd;
	@Required
	public String osProd;
	@Required
	public String prixProd;
	@Required
	public Blob image_prod;

		
	public Produit( Marque marqueProd, String modelProd,
			String dimensionProd, int capaciteProd, String osProd,
			String prixProd, Blob image_prod) {
		super();
		this.marque = marqueProd;
		this.modelProd = modelProd;
		this.dimensionProd = dimensionProd;
		this.capaciteProd = capaciteProd;
		this.osProd = osProd;
		this.prixProd = prixProd;
		this.image_prod = image_prod;
	}
	
	// static String getMarque()
	// {
		// return this.marque;
	// }
	
	@Override
	public String toString() {
        return " Marque: "+modelProd+" "+marque.toString();
    }
	

	

}
