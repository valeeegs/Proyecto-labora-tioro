import java.util.Scanner;

public class Cliente extends Persona implements java.io.Serializable{
	private String[] productosPedidos = new String[50];
	private String fechaDecompra;
	private int nroProductos;
	private int frecuencia;
	private boolean dejarPropina = false;
	
	public Cliente() {
		productosPedidos[0] = "a";
		productosPedidos[1]	= "b";
	    productosPedidos[2] = "c";
	    fechaDecompra = "13";
	    nroProductos = 3;
	    frecuencia = 0;
	    dejarPropina = false;
	}
	
	public void leer() {
		System.out.println("Ingrese los datos del Cliente");
		super.leer();
		Scanner read = new Scanner(System.in);
		System.out.print("Numero de Productos: ");
		nroProductos = read.nextInt();
		read.nextLine();
		System.out.print("Productos Pedidos: ");
		for(int i=0; i<nroProductos; i++) {
			(productosPedidos[i]) = read.nextLine();
		}
		System.out.print("Fecha de la compra: ");
		fechaDecompra = read.nextLine();
	}
	public void mostrar() {
		System.out.println("\t------- DATOS CLIENTE -------");
		super.mostrar();
		System.out.println("\tNumero de Productos: " + nroProductos);
		System.out.println("\tProductos Pedidos"); 
		for(int i=0; i<nroProductos; i++) {
			System.out.println("\t\t" + productosPedidos[i]);
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

	public String[] getProductosPedidos() {
		return productosPedidos;
	}

	public String getFechaDecompra() {
		return fechaDecompra;
	}

	public int getNroProductos() {
		return nroProductos;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public boolean isDejarPropina() {
		return dejarPropina;
	}
	
	
}
