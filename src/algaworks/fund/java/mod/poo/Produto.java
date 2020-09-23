package algaworks.fund.java.mod.poo;

public class Produto {

	private String nome;

	private Integer qtdEstoque;
	
	public static final Integer qtdMinima = 10;
	
	private Boolean reporEstoque;

	public Boolean reporEstoque() {
		reporEstoque = qtdEstoque < qtdMinima;
		return msgEstoque(reporEstoque);
	}
	
	private Boolean msgEstoque(Boolean reporEstoque) {
		if (reporEstoque) {
			System.out.printf("Existe a necessidade de repor o estoque, quantidade"
					+ " atual do produto %s é: %d %n", nome, qtdEstoque);
			return reporEstoque;
		} else {
			System.out.printf("Não há necessidade de repor o estoque, quantidade"
					+ " atual do produto %s é: %d %n", nome, qtdEstoque);
			return reporEstoque;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}
