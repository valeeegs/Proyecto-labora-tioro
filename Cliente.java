
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
	    fechaDecompra = "13";
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
	
	
}
