
public class Cliente extends Persona{
	private String[] productosPedidos = new String[50];
	private String fechaDecompra;
	private int nroPedido;
	private int frecuencia;
	
	public Cliente() {
		productosPedidos[0] = "a";
		productosPedidos[1]	= "b";
	    productosPedidos[2] = "c";
	    fechaDecompra = "13";
	    nroPedido = 3;
	    frecuencia = 0;
	}
	
	/* propina: si el cliente le agrada el trato, gratifica al lugar.
	frecuencia: calcula la frecuencia del cliente. */
	
	public boolean propina(boolean x) { //boleano que confirma si quiere dejar propina
		if(x) {
			return true;
		}
		return false;
	}
	
	public int frecuencia() {
		return frecuencia ++;
	}
}
