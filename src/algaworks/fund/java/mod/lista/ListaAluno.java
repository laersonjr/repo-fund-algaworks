package algaworks.fund.java.mod.lista;

public class ListaAluno {

	static final int TAMANHODALISTA = 2;

	Aluno[] alunos = new Aluno[TAMANHODALISTA];

	int tamanho = 0;

	Aluno obter(int indice) {
		return alunos[indice];
	}

	int tamanhoDaLista() {
		return tamanho;
	}

	void adicionarAluno(Aluno aluno) {
		if (tamanho == alunos.length) {
			Aluno[] novaListaAluno = new Aluno[TAMANHODALISTA + alunos.length];

			for (int i = 0; i < alunos.length; i++) {
				novaListaAluno[i] = alunos[i];
			}

			alunos = novaListaAluno;
		}
		alunos[tamanho] = aluno;
		tamanho++;
		// System.out.printf("Aluno %s adicionado", aluno[tamanho].nome);
	}

}
