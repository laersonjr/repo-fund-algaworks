package algaworks.fund.java.mod.poo;

public class DadosPedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido = new Pedido("ProgramaTeste", 100.00);
		Pedido pedido2 = new Pedido("NovoProgramaTeste", 90.00);
		
		System.out.println(pedido.getCodigo());
		System.out.println(pedido.getSubtotal());
		System.out.println(pedido.getDesconto());
		System.out.println(pedido.getTotal());
		
		System.out.println();
		
		System.out.println(pedido2.getCodigo());
		System.out.println(pedido2.getSubtotal());
		System.out.println(pedido2.getDesconto());
		System.out.println(pedido2.getTotal());

	}

}
