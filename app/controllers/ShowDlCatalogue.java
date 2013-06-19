package controllers;

import java.io.FileOutputStream;
import java.util.List;

import models.Produit;
import play.db.jpa.Blob;
import play.mvc.Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ShowDlCatalogue extends Controller {

	public static void index() {
		List<Produit> listeProduit = Produit.find("order by modelprod").fetch();

		System.out.println(listeProduit.get(1).dimensionProd);
		Document document = new Document();

		try {
			PdfWriter.getInstance(document, new FileOutputStream("catalogue.pdf"));
			document.open();
			PdfPTable table = new PdfPTable(6); // nombre de colonnes.
			table.setWidthPercentage(100); // largeur table %

			// float[] columnWidths = {2f, 1f, 1f}; // Taille cellule
			// table.setWidths(columnWidths);

			PdfPCell cell1 = new PdfPCell(new Paragraph("Image"));
			PdfPCell cell2 = new PdfPCell(new Paragraph("Modele"));
			PdfPCell cell3 = new PdfPCell(new Paragraph("Dimensions long*larg*ep (mm)"));
			PdfPCell cell4 = new PdfPCell(new Paragraph("Capacite (GO)"));
			PdfPCell cell5 = new PdfPCell(new Paragraph("OS"));
			PdfPCell cell6 = new PdfPCell(new Paragraph("Prix (€)"));
			
			// cell1.setColspan(2); // Fusionner cellule
			
			// Taille cellule
			float[] columnWidths = { 1f, 1.2f, 2f, 0.8f, 1f, 0.6f };
			table.setWidths(columnWidths);

			table.addCell(cell1);
			table.addCell(cell2);
			table.addCell(cell3);
			table.addCell(cell4);
			table.addCell(cell5);
			table.addCell(cell6);

			for (Produit p : listeProduit) {
				// Image img = p.image_prod;
				// PdfPCell cellimg = new PdfPCell(img, false);
				// table.addCell(cellimg);
				table.addCell("Image");
				table.addCell(p.modelProd);
				table.addCell(p.dimensionProd);
				table.addCell(String.valueOf(p.capaciteProd));
				table.addCell(p.osProd);
				table.addCell(p.prixProd);
			}

			document.add(table);
			document.close();
		} catch (Exception e) {

		}
		// render(listeProduit);
	}

}
