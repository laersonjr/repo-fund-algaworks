package algaworks.fund.java.mod.biblioteca;

import org.apache.commons.mail.EmailException;

public class EnvioEmail {
	
	public static void main(String[] args) throws EmailException {
		
		UsandoBibliotecasTerceiros enviandoEmail = new UsandoBibliotecasTerceiros();
		
		enviandoEmail.envioEmail("Laerson Castro", "Ll08102016_@", "laersonjobs@outlook.com",
				"Envio de e-mail", "Exercício para envio de e-mail", "laersonjr@gmail.com");
		
	}

}
