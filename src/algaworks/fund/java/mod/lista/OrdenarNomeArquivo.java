package algaworks.fund.java.mod.lista;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class OrdenarNomeArquivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String caminho = "C:\\Laerson\\listaNome.txt";
		
		Path path = Paths.get(caminho);
		
		List<String> listaNomes = Files.readAllLines(path);
		
		for (String string : listaNomes) {
			System.out.println(string);
		}
		
		Collections.sort(listaNomes);
		
		System.out.printf("%nOrdenando os nomes de acordo com a 1ª letra: %n%n");
		
		for (String string : listaNomes) {
			System.out.println(string);
		}
		
		Files.write(path, listaNomes);

	}

}
