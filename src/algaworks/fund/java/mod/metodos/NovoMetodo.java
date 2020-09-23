package algaworks.fund.java.mod.metodos;

import java.util.Scanner;

public class NovoMetodo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("Lista de cursos: ");
		
		imprimirVetor(cursos);

		pularLinha();

		selecionarOpcao();
		Integer opcao = sc.nextInt();

		Boolean validarOpcao = opcao > 0 && opcao <= cursos.length;

		if (!validarOpcao) {
			msgErro();
			System.exit(1);
		}

		imprimirTraco();

		String[] formaPagamento = new String[] { "Crédito", "Débito", "Boleto" };

		System.out.println("Formas de pagamento: ");
		
		imprimirVetor(formaPagamento);

		pularLinha();

		selecionarOpcao();
		Integer opcaoPagamento = sc.nextInt();

		Boolean validarOpcaoPagamento = opcaoPagamento > 0 
				&& opcaoPagamento <= formaPagamento.length;

		if (!validarOpcaoPagamento) {
			msgErro();
			System.exit(1);
		}

		imprimirTraco();

		System.out.println("Curso escolhido -> " + cursos[opcao - 1]);
		System.out.println("Forma de pagamento -> " + formaPagamento[opcaoPagamento - 1]);
	}

	public static void imprimirTraco() {
		System.out.println("-------------------");
	}

	public static void msgErro() {
		System.err.println("Opção inválida!");
	}
	
	public static void selecionarOpcao() {
		System.out.printf("Escolha uma das opções: ");
	}
	
	public static void pularLinha() {
		System.out.println();
	}
	
	public static void imprimirVetor(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i+1 + " - " + vetor[i]);
		}
	}

}
