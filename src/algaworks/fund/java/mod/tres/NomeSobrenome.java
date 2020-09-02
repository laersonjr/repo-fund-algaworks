package algaworks.fund.java.mod.tres;

import java.util.Scanner;

public class NomeSobrenome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String primeiroNome = null;
		String segundoNome = null;

		System.out.print("Digite o seu primeiro nome: ");
		primeiroNome = sc.next();

		System.out.print("Digite o seu segundo nome: ");
		segundoNome = sc.next();

		System.out.println("Seu nome é: " + primeiroNome + " " + segundoNome);
	}

}
