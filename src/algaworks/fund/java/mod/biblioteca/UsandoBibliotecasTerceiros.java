package algaworks.fund.java.mod.biblioteca;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecasTerceiros {

	public static void envioEmail(String username, String password, String yourEmail, 
			String title, String msg,
			String sendTo) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setSSLOnConnect(true);
		email.setFrom(yourEmail);
		email.setSubject(title);
		email.setMsg(msg);
		email.addTo(sendTo);
		email.send();
		
		System.out.println("E-mail enviado!");
	}

}
