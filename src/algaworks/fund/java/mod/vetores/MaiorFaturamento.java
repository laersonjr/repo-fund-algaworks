package algaworks.fund.java.mod.vetores;

public class MaiorFaturamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

		Double maior = 0.0;
		Integer semanaMaiorFaturamento = null;

		System.out.println(mes.length + " linhas");
		System.out.println(mes[0].length + " colunas");
		
		double[] valor = new double[4];

		for (int i = 0; i < mes.length; i++) {
			valor[i] = 0.0;
			for (int j = 0; j < mes[i].length; j++) {
				valor[i] += mes[i][j];
			}

			if (valor[i] > maior) {
				maior = valor[i];
				semanaMaiorFaturamento = i + 1;
			}
		}

		System.out.println("Semana " + semanaMaiorFaturamento + " teve o maior faturamento com o valor de: " + maior);
	}

}
