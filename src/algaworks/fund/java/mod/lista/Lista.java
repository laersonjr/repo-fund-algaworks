package algaworks.fund.java.mod.lista;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaAluno listaAluno = new ListaAluno();
		
		Aluno aluno = new Aluno();
		aluno.nome = "Laerson";
		listaAluno.adicionarAluno(aluno);
		
		aluno = new Aluno();
		aluno.nome = "Castro";
		listaAluno.adicionarAluno(aluno);

		aluno = new Aluno();
		aluno.nome = "Araujo";
		listaAluno.adicionarAluno(aluno);

		aluno = new Aluno();
		aluno.nome = "Junior";
		listaAluno.adicionarAluno(aluno);

		aluno = new Aluno();
		aluno.nome = "Laerson";
		listaAluno.adicionarAluno(aluno);
		
		for (int i = 0; i < listaAluno.tamanhoDaLista(); i++) {
			Aluno nomeAluno = listaAluno.obter(i);
			
			System.out.printf("Aluno: %s %n", nomeAluno.nome);
		}
		
		

	}

}
