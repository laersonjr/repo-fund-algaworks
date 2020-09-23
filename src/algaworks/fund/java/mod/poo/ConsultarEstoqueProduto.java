package algaworks.fund.java.mod.poo;

import java.util.Scanner;

public class ConsultarEstoqueProduto {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto produto = new Produto();
		Produto produto2 = new Produto();

		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o nome do produto: ");
		produto.setNome(sc.nextLine());

		System.out.printf("Digite a quantidade atual do produto: ");
		produto.setQtdEstoque(sc.nextInt());

		Boolean necessidadeReporEstoque = produto.reporEstoque();

		produto2.setNome("Feijão");
		produto2.setQtdEstoque(9);

		produto2.reporEstoque();

	}

}
