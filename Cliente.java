
public class Cliente extends Persona{
	private String[] productosPedidos = new String[50];
	private String fechaDecompra;
	private int nroPedido;
	
	public Cliente() {
		productosPedidos[0] = "a";
		productosPedidos[1]	= "b";
	    productosPedidos[2] = "c";
	    fechaDecompra = "13";
	    nroPedido = 3;
	}
}