import java.util.Scanner;

public class Empleado extends Persona implements java.io.Serializable{
	private int sueldo;
	private String cargo;
	private boolean sueldoPagado;
	
	public Empleado(){
		super();
		sueldo = 3500;
		cargo = "Director";
		sueldoPagado = false;
	}
	
	public Empleado(int sueldo, String cargo) {
		this.sueldo = sueldo;
		this.cargo = cargo;
	}
	
	public void mostrar(){
		super.mostrar();
		System.out.println(sueldo + "\t\t" + cargo);
	}
	public void leer(){
		super.leer();
		Scanner read = new Scanner(System.in);
		System.out.println(sueldo + "\t\t" + cargo);
		System.out.print("Sueldo: ");
		sueldo = read.nextInt();
		System.out.print("Cargo: ");
		cargo = read.nextLine();
	
	}
	
	public void pagarSueldo() {
		sueldoPagado = true;
	}

	public int getSueldo() {
		return sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public boolean isSueldoPagado() {
		return sueldoPagado;
	}
	
}