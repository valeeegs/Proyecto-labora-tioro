import java.util.Scanner;

public class Pedido implements java.io.Serializable{
	private int idpedidos;
	private int cantidadProd;
	private String[][] prodComprados = new String[50][2];
	private double[] precioProd = new double[50];
	
	public Pedido(){
		idpedidos = 127;
		cantidadProd = 3;
		prodComprados[0][0] = "a"; prodComprados[0][1] = "2"; 
		prodComprados[1][0] = "b"; prodComprados[1][1] = "1"; 
		prodComprados[2][0] = "a"; prodComprados[2][1] = "1"; 
	}
	
	/*public Pedido(int idpedidos, int cantidadprod){
		this.idpedidos = idpedidos;
		this.cantidadProd = cantidadprod;
		
	}*/
	
	public void leer() {
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese los datos del pedido: ");
		System.out.print("ID: ");
		idpedidos = read.nextInt();
		read.nextLine();
		System.out.print("Cantidad de productos: ");
		cantidadProd = read.nextInt();
		read.nextLine();
		for(int i=0; i<cantidadProd; i++) {
			System.out.print("Nombre producto: " + (i+1));
			prodComprados[i][0] = read.nextLine();
			System.out.print("Cantidad producto: " + (i+1));
			prodComprados[i][1] = read.nextLine();
		}
	}
	
	public void ponerPrecio(Inventario inv) {
		double precio;
		for(int i=0; i<cantidadProd; i++) {
			precio = Double.parseDouble(prodComprados[i][1]) * inv.getPrecio(prodComprados[i][0]);
			precioProd[i] = precio;
		}
	}
	
	public void mostrar(Inventario inv){
		ponerPrecio(inv);
		System.out.println("\t------ DATOS PEDIDO ------");
		System.out.println("\tID: " + idpedidos);
		System.out.println("\tCantidad de productos: " + cantidadProd);
		System.out.println("\tNOMBRE \tCANTIDAD \tPRECIO");
		for(int i=0; i<cantidadProd; i++) {
			System.out.println("\t" + prodComprados[i][0] + "\t" + prodComprados[i][1] + "\t" + precioProd[i] + "\t");
		}
		System.out.println("\t--------------------------");
	}
	// use cases to compare and add the price of each product 
	/* descuento: se calcula un 10% del total de compra, solo aplica a clientes frecuentes.
	costoTotal: suma de los precios de los productos comprados y se incluye el descuento en caso de que haya. */
	
	public double descuento(double compra) {
		double des = 0;
		des = compra * 0.10;
		return des;
	}
	
	public double costoTotal(Cliente c) {
		double costo = 0;
			for(int i=0; i<cantidadProd; i++) {
				costo += precioProd[i];
			} if(c.getFrecuencia() > 5) { // descuento por frecuencia
				costo -= descuento(costo);
			} if(c.isDejarPropina()) { // si confirmó dejar porpina 
				costo += costo * 0.15;
			}
		return costo;
	}
}
