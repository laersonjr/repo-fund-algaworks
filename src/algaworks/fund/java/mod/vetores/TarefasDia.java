package algaworks.fund.java.mod.vetores;

import java.util.Scanner;

public class TarefasDia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nextLine lê a entrada incluindo o espaço entre as palavras
		final Integer qtd = 5;

		Scanner sc = new Scanner(System.in);

		String[] tarefas = new String[qtd];

		for (int i = 0; i < tarefas.length; i++) {
			System.out.printf("Digite a %d tafera: ", i + 1);
			tarefas[i] = sc.nextLine();
		}
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println(tarefas[i]);
		}

	}

}
