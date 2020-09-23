package algaworks.fund.java.mod.metodos;

import java.util.Scanner;

public class TabuadaRecursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um número para calcularmos a sua tabuada: ");
		Integer numero = sc.nextInt();
		
		tabuada(numero, 0);
	}
	
	public static void tabuada(Integer multiplicando, Integer multiplicador) {
		Integer resultado = multiplicador * multiplicando;
		
		System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
		
		multiplicador++;
		
		if(multiplicador <= 10) {
			tabuada(multiplicando, multiplicador);
		}
	}

}
