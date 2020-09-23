package algaworks.fund.java.mod.poo;

public class Pedido {

	private String codigo;

	private Double subtotal;

	private static final Double desconto = 0.1;

	public Pedido(String codigo, Double subtotal) {
		this.codigo = codigo;
		this.subtotal = subtotal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public Double getTotal() {
		Double total;

		if (subtotal >= 100) {
			total = subtotal - (subtotal * desconto);
		} else {
			total = subtotal;
		}
		
		return total;
	}

}
