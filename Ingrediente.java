
public class Ingrediente implements java.io.Serializable{
	private String nombre;
	private int cantidad;
	private double precio;
	
	public Ingrediente(){
		nombre = "Azúcar";
		cantidad = 500;
		precio = 20.50;
	}
	
	public Ingrediente(String nombre, int cantidad, double precio){
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public void mostrar(){
		System.out.println("\t" + nombre + "\t\t" + cantidad + "\t\t" + precio);
	}
	
	// not sure about this
	public boolean disponibilidad() {
		if(cantidad == 0) {
			return false;
		}
		return true;
	}

	/*public String getNombre() {
		return nombre;
	}*/

	/*public int getCantidad() {
		return cantidad;
	}*/

	public double getPrecio() {
		return precio;
	}
	
}
