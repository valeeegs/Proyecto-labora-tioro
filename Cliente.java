import java.util.Scanner;

public class Cliente extends Persona implements java.io.Serializable{
	private String[] idPedidos = new String[50];
	private String fechaDecompra;
	private int nroPedidos;
	private int frecuencia;
	private boolean dejarPropina = false;
	
	public Cliente() {
		idPedidos[0] = "a";
		idPedidos[1] = "b";
	    idPedidos[2] = "c";
	    fechaDecompra = "13";
	    nroPedidos = 3;
	    frecuencia = 0;
	    dejarPropina = false;
	}
	
	public void leer() {
		System.out.println("Ingrese los datos del Cliente");
		super.leer();
		Scanner read = new Scanner(System.in);
		System.out.print("Numero de Pedidos: ");
		nroPedidos = read.nextInt();
		read.nextLine();
		System.out.print("Codigo de Pedidos: ");
		for(int i=0; i<nroPedidos; i++) {
			(idPedidos[i]) = read.nextLine();
		}
		System.out.print("Fecha de la compra: ");
		fechaDecompra = read.nextLine();
	}
	public void mostrar() {
		System.out.println("\t------- DATOS CLIENTE -------");
		super.mostrar();
		System.out.println("\tNumero de Pedidos: " + nroPedidos);
		System.out.println("\tID Pedidos hechos: "); 
		for(int i=0; i<nroPedidos; i++) {
			System.out.println("\t\t" + idPedidos[i]);
		}
		System.out.println("\tFecha de compra: " + fechaDecompra);
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
	
	public int AumentarFrecuencia() {
		return frecuencia ++;
	}

	public String[] getIdPedidos() {
		return idPedidos;
	}

	public String getFechaDecompra() {
		return fechaDecompra;
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
