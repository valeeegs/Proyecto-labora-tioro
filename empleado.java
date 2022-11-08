package ProyectLab;

public class empleado extends persona{
	private int sueldo;
	private String cargo;
	
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