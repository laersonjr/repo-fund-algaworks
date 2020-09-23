package algaworks.fund.java.mod.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarArquivo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		List<String> listaTarefas = new ArrayList<String>();

		int i = 1;

		while (true) {

			System.out.println("Vamos cadastrar uma lista de tarefas, " + "caso deseja encerrar, digitar 'exit'.");

			System.out.printf("Digite a %dª tarefa: %n", i);

			String tarefa = sc.nextLine();

			if (tarefa.equals("exit")) {
				break;
			} else {
				listaTarefas.add(tarefa);
			}
			i++;
		}

		String caminho = "C:\\Laerson\\arquivo.txt";

		criarArquivo(caminho, listaTarefas);

	}

	static void criarArquivo(String nomeArquivo, List<String> listaTarefas) throws IOException {
		Path path = Paths.get(nomeArquivo);
		Files.write(path, listaTarefas);
	}

}
