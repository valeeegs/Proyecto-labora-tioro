
public class Ingrediente {
	private String nombre;
	private int cantidad;
	private float precio;
	
	public Ingrediente(){
		nombre = "Azúcar";
		cantidad = 500;
		precio = 20.0f;
	}
	
	public Ingrediente(String nombre, int cantidad, float precio){
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public void mostrar(){
		System.out.println(nombre + "\t\t" + cantidad + "\t\t" + precio);
	}
}
