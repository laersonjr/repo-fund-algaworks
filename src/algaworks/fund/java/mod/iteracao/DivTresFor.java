package algaworks.fund.java.mod.iteracao;

public class DivTresFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Integer divisor = 3;
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % divisor == 0) {
				System.out.println(numeros[i] + " é divisível por 3");
			}
		}
		
	}

}
