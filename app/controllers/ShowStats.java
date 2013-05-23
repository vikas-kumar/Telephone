package controllers;

import play.*;
import play.db.jpa.GenericModel.JPAQuery;
import play.db.jpa.JPABase;
import play.mvc.*;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.List;

import javax.imageio.ImageIO;

import models.Commande;
import models.Marque;
import models.Produit;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;

//import models.*;

public class ShowStats extends Controller {

    public static void index() {
        render();
    }

    /**
     * Pourcentage de telephone par Marque
     */
    public static void apie() throws IOException {
        DefaultPieDataset data = new DefaultPieDataset();
        long m = Marque.count();
       List<Marque> listeMarque = Marque.findAll();
       for (int i = 0; i < m; i++) {
			 String nameMarque=listeMarque.get(i).toString();
			 List<Produit> listeProduit = Produit.find(
			 "select p from Produit p inner join p.marque as m where m.nomMarque = ?", nameMarque
			 ).fetch();
			int nbtel =0;
			nbtel=listeProduit.size();
			double NombreTel = nbtel;
			List<Commande> listeTelTotal = Produit.findAll();
	        double NombreProTotal = listeTelTotal.size();
	        double DivTelMar = NombreTel/NombreProTotal;
	        double PourTelParMar = DivTelMar*100;
			data.setValue(nameMarque, PourTelParMar);
			//System.out.println(nameMarque+"= "+PourTelParMar);
       }
  
      JFreeChart chart = ChartFactory.createPieChart("Pourcentage de telephone par Marque",
                data, true, // legend?
                true, // tooltips?
                false // URLs?
                );

      ((PiePlot) chart.getPlot()).setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0}={1}")) ;
        BufferedImage bf = chart.createBufferedImage(500, 270);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bf, "jpg", baos);
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();
        InputStream is = new ByteArrayInputStream(imageInByte);

        response.contentType = "image/jpg";
        renderBinary(is);	
    }
    
    /**
     * Pourcentage de Commande par Marque
     */
    public static void apie2() throws IOException {
        DefaultPieDataset data = new DefaultPieDataset();
        long m = Marque.count();
       List<Marque> listeMarque = Marque.findAll();
       for (int i = 0; i < m; i++) {
			String nameMarque;
			 nameMarque=listeMarque.get(i).toString();
			 List<Commande> listeCommande = Commande.find(
					 "select nomCli from Commande c where c.marque = ?", nameMarque).fetch();
			int nbcmd =0;
			nbcmd=listeCommande.size();
			data.setValue(nameMarque, nbcmd);
			
			double NombreProCmd = nbcmd;
			List<Commande> listeCommandeTotal = Commande.findAll();
	        double NombreCmd = listeCommandeTotal.size();
	        double DivProMar = NombreProCmd/NombreCmd;
	        double PourProParCmd = DivProMar*100;
			data.setValue(nameMarque, PourProParCmd);
			//System.out.println(nameMarque+"= "+PourProParCmd);
       }
  
      JFreeChart chart = ChartFactory.createPieChart("Pourcentage de Commande par Marque",
                data, true, // legend?
                true, // tooltips?
                false // URLs?
                );
      ((PiePlot) chart.getPlot()).setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0}={1}")) ;
      BufferedImage bf = chart.createBufferedImage(500, 270);
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ImageIO.write(bf, "jpg", baos);
      baos.flush();
      byte[] imageInByte = baos.toByteArray();
      baos.close();
      InputStream is = new ByteArrayInputStream(imageInByte);

        response.contentType = "image/jpg";
        renderBinary(is);	
    }

}