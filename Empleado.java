
public class Empleado extends Persona{
	private int sueldo;
	private String cargo;
	
	public Empleado(){
		super();
		sueldo = 3500;
		cargo = "Director";
	}
	
	public Empleado(int sueldo, String cargo) {
		this.sueldo = sueldo;
		this.cargo = cargo;
	}
	
	public void mostrar(){
		super.mostrar();
		System.out.println(sueldo + "\t\t" + cargo);
	}
	
}