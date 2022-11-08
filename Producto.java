
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
	
	public void mosrtar(){
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
}
