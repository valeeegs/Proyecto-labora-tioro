package ProyectLab;

public class empleado {
	protected int sueldo;
	protected String cargo;
	
	public empleado(){
		sueldo = 3500;
		cargo = "Director";
	}
	
	public empleado(int sueldo, String cargo) {
		this.sueldo = sueldo;
		this.cargo = cargo;
	}
	
	public void mostrar(){
		System.out.println(sueldo + "\t\t" + cargo);
	}
	
}