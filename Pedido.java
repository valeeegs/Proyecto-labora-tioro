
public class Pedido {
	private int idpedidos;
	private int cantidadProd;
	private String[][] prodComprados = new String[50][3];
	
	public Pedido(){
		idpedidos = 127;
		cantidadProd = 40;
		prodComprados[0][0] = "a"; prodComprados[0][1] = "a"; prodComprados[0][2] = "a";
		prodComprados[1][0] = "b"; prodComprados[1][1] = "b"; prodComprados[1][2] = "b";
		prodComprados[2][0] = "a"; prodComprados[2][1] = "b"; prodComprados[2][2] = "b";
	}
	
	public Pedido(int idpedidos, int cantidadprod){
		this.idpedidos = idpedidos;
		this.cantidadProd = cantidadprod;
		
	}
	
	public void mostrar(){
		System.out.println(idpedidos + cantidadProd);
		for(int i=0; i<cantidadProd; i++) {
			System.out.println(prodComprados[i][0] + "\t" + prodComprados[i][1] + "\t" + prodComprados[i][2] + "\t");
		}
	}
}
