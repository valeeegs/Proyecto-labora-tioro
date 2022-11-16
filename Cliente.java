import java.util.Scanner;

public class Cliente extends Persona implements java.io.Serializable{
	private int[] idPedidos = new int[50];
	private int nroPedidos;
	private int frecuencia;
	private boolean dejarPropina = false;
	
	public Cliente() {
	    nroPedidos = 0;
	    frecuencia = 0;
	    dejarPropina = false;
	}
	
	public Cliente(String nombre, int ci, int edad) {
		super(nombre, ci, edad);
		nroPedidos = 0;
	    frecuencia = 0;
	    dejarPropina = false;
	}
	
	public void leer() {
		System.out.println("Ingrese los datos del Cliente");
		super.leer();
		/*Scanner read = new Scanner(System.in);
		System.out.print("Numero de Pedidos: ");
		nroPedidos = read.nextInt();
		read.nextLine();
		System.out.print("Codigo de Pedidos: ");
		for(int i=0; i<nroPedidos; i++) {
			(idPedidos[i]) = read.nextLine();
		}*/
	}
	public void mostrar() {
		System.out.println("\t------- DATOS CLIENTE -------");
		super.mostrar();
		System.out.println("\tNumero de Pedidos: " + nroPedidos);
		System.out.println("\tID Pedidos hechos: "); 
		for(int i=0; i<nroPedidos; i++) {
			System.out.println("\t\t" + idPedidos[i]);
		}
		System.out.println("\t-----------------------------");
	}
	
	/* propina: si el cliente le agrada el trato, gratifica al lugar.
	frecuencia: calcula la frecuencia del cliente. */
	
	public void propina(boolean x) { //boleano que confirma si quiere dejar propina
		if(x) {
			dejarPropina = true;
		}else {
			dejarPropina = false;
		}
	}
	
	public boolean confirmarPropina() {
		if(dejarPropina) {
			return true;
		} return false;
	}
	
	public void PedidoHecho(int id) {
		frecuencia ++;
		idPedidos[nroPedidos] = id;
		nroPedidos ++;
	}

	public int[] getIdPedidos() {
		return idPedidos;
	}

	public int getNroPedidos() {
		return nroPedidos;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public boolean isDejarPropina() {
		return dejarPropina;
	}
	
	
}
