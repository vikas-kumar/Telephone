package mailer;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import play.data.validation.Required;
import play.mvc.Mailer;

public class Mails extends Mailer {
	
	public static void welcome(models.Commande user) throws EmailException {
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setAuthentication("csid2013c@gmail.com", "testeur1");
		email.setSSL(true);
		email.setDebug(true);
		email.setSubject("Commande "+user.modelProd);
		email.addTo("vik93150@gmail.com", "");
		email.setFrom("noreprly@vik.com", "");
		email.setMsg("Bonjour, votre commande a bien été validée.");
		email.send();
	   }
	
	public static void verif(@Required String Id)
	{
		System.out.println("ID = "+Id);	
	}

}
