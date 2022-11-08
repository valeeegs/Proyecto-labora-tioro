package ProyectLab;

public class cliente extends persona{
	private String[] productosPedidos = new String[50];
	private String fechaDecompra;
	private int nroPedido;
	
	public cliente() {
		productosPedidos[0] = "a";
		productosPedidos[1]	= "b";
	    productosPedidos[2] = "c";
	    fechaDecompra = "13";
	    nroPedido = 3;
	}
}