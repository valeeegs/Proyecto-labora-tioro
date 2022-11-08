
public class Pedido {
	private int idpedidos;
	private int cantidadprod;
	private String[][] prodComprados = new String[50][3];
	
	public Pedido(){
		idpedidos = 127;
		cantidadprod = 40;
		prodComprados[0][0] = "a";
		prodComprados[1][1] = "b";
		prodComprados[2][2] = "a";
	}
	
	public Pedido(int idpedidos, int cantidadprod){
		this.idpedidos = idpedidos;
		this.cantidadprod = cantidadprod;
		
	}
	
	public void mostrar(){
		System.out.println(int idpedidos, int cantidadprod);
	}
}
