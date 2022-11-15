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
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		
	}
	
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3, 
			String in4, int ic4, double ip4) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		ingredientes[3] = new Ingrediente(in4, ic4, ip4);
	}
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3, 
			String in4, int ic4, double ip4, String in5, int ic5, double ip5) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		ingredientes[3] = new Ingrediente(in4, ic4, ip4);
		ingredientes[4] = new Ingrediente(in5, ic5, ip5);
	}
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3, 
			String in4, int ic4, double ip4, String in5, int ic5, double ip5, String in6, int ic6, double ip6) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		ingredientes[3] = new Ingrediente(in4, ic4, ip4);
		ingredientes[4] = new Ingrediente(in5, ic5, ip5);
		ingredientes[5] = new Ingrediente(in6, ic6, ip6);
	}
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3, 
			String in4, int ic4, double ip4, String in5, int ic5, double ip5,
			String in6, int ic6, double ip6, String in7, int ic7, double ip7) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		ingredientes[3] = new Ingrediente(in4, ic4, ip4);
		ingredientes[4] = new Ingrediente(in5, ic5, ip5);
		ingredientes[5] = new Ingrediente(in6, ic6, ip6);
		ingredientes[6] = new Ingrediente(in7, ic7, ip7);
	}
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3, 
			String in4, int ic4, double ip4, String in5, int ic5, double ip5,
			String in6, int ic6, double ip6, String in7, int ic7, double ip7,
			String in8, int ic8, double ip8) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		ingredientes[3] = new Ingrediente(in4, ic4, ip4);
		ingredientes[4] = new Ingrediente(in5, ic5, ip5);
		ingredientes[5] = new Ingrediente(in6, ic6, ip6);
		ingredientes[6] = new Ingrediente(in7, ic7, ip7);
		ingredientes[7] = new Ingrediente(in8, ic8, ip8);
	}
	public Producto(String n, int c, int t, int u, String in1, int ic1, double ip1, 
			String in2, int ic2, double ip2, String in3, int ic3, double ip3, 
			String in4, int ic4, double ip4, String in5, int ic5, double ip5,
			String in6, int ic6, double ip6, String in7, int ic7, double ip7,
			String in8, int ic8, double ip8, String in9, int ic9, double ip9) {
		nombre = n;
		canIngredientes = c;
		tiempoProd = t;
		unidadesPorEmpaque = u;
		ingredientes[0] = new Ingrediente(in1, ic1, ip1);
		ingredientes[1] = new Ingrediente(in2, ic2, ip2);
		ingredientes[2] = new Ingrediente(in3, ic3, ip3);
		ingredientes[3] = new Ingrediente(in4, ic4, ip4);
		ingredientes[4] = new Ingrediente(in5, ic5, ip5);
		ingredientes[5] = new Ingrediente(in6, ic6, ip6);
		ingredientes[6] = new Ingrediente(in7, ic7, ip7);
		ingredientes[7] = new Ingrediente(in8, ic8, ip8);
		ingredientes[8] = new Ingrediente(in9, ic9, ip9);
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
