
public class Producto {
	private String nombre;
	private int canIngredientes;
	private Ingrediente[] ingredientes = new Ingrediente[50];
	private int tiempoProd;
	private int unidadesPorEmpaque;
	
	public Producto(){
		nombre = "Baek";
		canIngredientes = 3;
		ingredientes[0] = new Ingrediente();
		ingredientes[1] = new Ingrediente();
		ingredientes[2] = new Ingrediente();
		tiempoProd = 3;
		unidadesPorEmpaque = 3;
	}
	
	//public Producto() {}
	
	public void mostrar(){
		System.out.println("------ DATOS PRODUCTO -----"); 
		System.out.println("Nombre: " + nombre); 
		System.out.println("Cantidad Ingredientes: " + canIngredientes); 
		System.out.println("NOMBRE \t\tCANTIDAD \tPRECIO"); 
		for(int i=0; i<canIngredientes; i++) {
			ingredientes[i].mostrar();
		}
		System.out.println("Tiempo prod: " + tiempoProd); 
		System.out.println("Unidades x Empaque: " + unidadesPorEmpaque); 
		System.out.println("----------------------------"); 
	}

	
	
	/* costeProduccion: la suma de los precios de los ingredientes. double
	precioVenta: calcula el precio de venta del producto, multiplicando su costeProduccion * 1.35 */
	
	public double costeProduccion() {
		double total = 0;
		for(int i=0; i<canIngredientes; i++) {
			total += ingredientes[i].getPrecio();
		}
		return total;
	}
	
	public double precioVenta() {
		double precio;
		precio = costeProduccion() * 1.35;
		return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
}
