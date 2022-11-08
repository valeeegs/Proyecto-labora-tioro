package ProyectLab;

public class persona {
	protected String nombre;
	protected int ci;
	protected int edad;
	
	public persona(){
		nombre = "Abel Valencia";
		ci = 7397416;
		edad = 29;
	}
	
	public persona(String nombre, int ci, int edad) {
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}
	
	public void mostrar(){
		System.out.println(nombre + "\t\t" + ci + "\t\t" + edad);
	}
	
}