import java.util.Scanner;

public class Cliente extends Persona implements java.io.Serializable{
	private String[] productosPedidos = new String[50];
	private String fechaDecompra;
	private int nroProductos;
	private int frecuencia;
	private boolean dejarPropina;
	
	public Cliente() {
		productosPedidos[0] = "a";
		productosPedidos[1]	= "b";
	    productosPedidos[2] = "c";
	    fechaDecompra = "13/02/22";
	    nroProductos = 3;
	    frecuencia = 0;
	    dejarPropina = false;
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
	public void leer() {
		System.out.println("Ingrese los datos del Cliente");
		super.leer();
		Scanner read = new Scanner(System.in);
		System.out.print("Numero de Productos: ");
		nroProductos = read.nextInt();
		System.out.print("Productos Pedidos: ");
		for(int i=0; i<nroProductos; i++) {
			(productosPedidos[i]) = read.next();
		}
		System.out.print("Fecha de la compra: ");
		fechaDecompra = read.next();
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Productos Pedidos"); 
		for(int i=0; i<nroProductos; i++) {
			System.out.println(productosPedidos[i]);
		}
		System.out.println("Fecha de compra: " + fechaDecompra);
		System.out.println("Numero de Productos: " + nroProductos);
		
	}
}