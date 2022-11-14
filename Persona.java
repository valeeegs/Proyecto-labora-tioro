import java.util.Scanner;

public class Persona implements java.io.Serializable{
	protected String nombre;
	protected int ci;
	protected int edad;
	
	public Persona(){
		nombre = "Abel Valencia";
		ci = 7397416;
		edad = 29;
	}
	
	public Persona(String nombre, int ci, int edad) {
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("\tNombre: " + nombre);
		System.out.println("\tCI: " + ci);
		System.out.println("\tEdad: " + edad);
	}
	public void leer() {
		Scanner read =  new Scanner(System.in);
		System.out.print("Nombre: ");
		nombre = read.nextLine();
		System.out.print("CI: ");
		ci = read.nextInt();
		System.out.print("Edad: ");
		edad = read.nextInt();
	}

	public String getNombre() {
		return nombre;
	}

	public int getCi() {
		return ci;
	}

	public int getEdad() {
		return edad;
	}
	
	
}
