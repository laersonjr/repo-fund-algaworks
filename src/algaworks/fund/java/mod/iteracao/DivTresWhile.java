package algaworks.fund.java.mod.iteracao;

public class DivTresWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Integer divisor = 3;
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		Integer aux = 0;
		
		while (aux < numeros.length) {
			if(numeros[aux] % 3 == 0) {
				System.out.println(numeros[aux] + " é divisível por 3");
			}
			aux++;
		}
	}

}
