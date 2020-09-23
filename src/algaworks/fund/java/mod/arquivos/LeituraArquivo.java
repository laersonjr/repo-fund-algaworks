package algaworks.fund.java.mod.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String caminho = "C:\\Laerson\\arquivo.txt";
		
		Path path = Paths.get(caminho);
		// Apertando f2 em cima do metodo readAllLines, é possível verificar informações
		// deste metodo, inclusive o tipo de retorno.
		List<String> listarTarefas = Files.readAllLines(path);
		
		// System.out.println(listarTarefas);
		
		for (String string : listarTarefas) {
			System.out.println("Tarefa => " + string);
		}
	}

}
