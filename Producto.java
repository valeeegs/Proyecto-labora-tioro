import java.util.Scanner;

public class Producto implements java.io.Serializable{
	private String nombre;
	private int canIngredientes;
	private Ingrediente[] ingredientes = new Ingrediente[50];
	private int tiempoProd;
	private int unidadesPorEmpaque;
	
	public Producto(){
		nombre = "Ositos de goma";
		canIngredientes = 4;
		ingredientes[0] = new Ingrediente("Grenetina en polvo",	180, 3.99);
		ingredientes[1] = new Ingrediente("Gelatina en polvo",	300,	5.49);
		ingredientes[2] = new Ingrediente("Jugo de limon",	90,	1.59);
		ingredientes[3] = new Ingrediente("agua",	2800,	2.80);
		tiempoProd = 60;
		unidadesPorEmpaque = 4;
	}
	
	public Producto(String n, int c, int t, int u) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		
	}
	
	/*Scanner read =  new Scanner(System.in);
		System.out.print(": ");
		= read.next();
	public void leer() {
		String n; int c; double p;
		System.out.println("Ingrese los datos del producto");
		Scanner read =  new Scanner(System.in);
		System.out.print("Nombre : ");
		nombre = read.nextLine();
		System.out.print("Cantidad de ingredientes: ");
		canIngredientes = read.nextInt();
		read.nextLine();
		for(int i=0; i<canIngredientes; i++) {
			System.out.println("Ingrese los datos del ingrediente nro " + (i+1) + ": ");
			System.out.print("Nombre: ");
			n = read.nextLine();
			System.out.print("Cantidad: ");
			c = read.nextInt();
			System.out.print("Precio: ");
			p = read.nextDouble();
			ingredientes[i] = new Ingrediente(n, c, p);
			read.nextLine();
		}
		System.out.print("Tiempo producción: ");
		tiempoProd = read.nextInt();
		read.nextLine();
		System.out.print("Unidades por empaque : ");
		unidadesPorEmpaque = read.nextInt();
		read.nextLine();
	}*/
	
	public void mostrar(){
		System.out.println("\t******* DATOS PRODUCTO *******"); 
		System.out.println("\tNombre: " + nombre); 
		System.out.println("\tCantidad Ingredientes: " + canIngredientes); 
		System.out.println("\tNOMBRE \t\tCANTIDAD \tPRECIO"); 
		for(int i=0; i<canIngredientes; i++) {
			ingredientes[i].mostrar();
		}
		System.out.println("\tTiempo prod: " + tiempoProd); 
		System.out.println("\tUnidades x Empaque: " + unidadesPorEmpaque); 
		System.out.println("\t******************************"); 
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

	public int getCanIngredientes() {
		return canIngredientes;
	}

	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}

	public int getTiempoProd() {
		return tiempoProd;
	}

	public int getUnidadesPorEmpaque() {
		return unidadesPorEmpaque;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCanIngredientes(int canIngredientes) {
		this.canIngredientes = canIngredientes;
	}

	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void setTiempoProd(int tiempoProd) {
		this.tiempoProd = tiempoProd;
	}

	public void setUnidadesPorEmpaque(int unidadesPorEmpaque) {
		this.unidadesPorEmpaque = unidadesPorEmpaque;
	}
	
}
