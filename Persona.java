import java.util.Scanner;

public class Persona {
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
		System.out.println("Nombre: " + nombre);
		System.out.println("CI: " + ci);
		System.out.println("Edad: " + edad);
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
	
}
