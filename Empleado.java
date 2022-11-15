
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
	
	public Empleado(String nombre, int ci, int edad, int sueldo, String cargo) {
		super(nombre, ci, edad);
		this.sueldo = sueldo;
		this.cargo = cargo;
	}
	
	/*public void leer(){
		System.out.println("Ingrese datos del empleado");
		super.leer();
		Scanner read = new Scanner(System.in);
		System.out.print("Sueldo: ");
		sueldo = read.nextInt();
		read.nextLine();
		System.out.print("Cargo: ");
		cargo = read.nextLine();
	}*/
	
	public void mostrar(){
		System.out.println("\t------- DATOS EMPLEADO -------");
		super.mostrar();
		System.out.println("\tCargo: " + cargo);
		System.out.println("\tSueldo: " + sueldo);
		System.out.println("\t-------------------------------");
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
