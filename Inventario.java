
public class Inventario implements java.io.Serializable{
	private String fechaActualizacion;
	private int nroProductos;
	private int[] cantidad = new int[50];
	private Producto[] productos = new Producto[50];
	
	public Inventario(){
		fechaActualizacion = "11/11/2022";
		nroProductos = 0;
	}
	
	public void mostrar() {
		System.out.println("\t--------- DATOS INVENTARIO ---------");
		System.out.println("\tFecha: " + fechaActualizacion);
		System.out.println("\tNro Productos: " + nroProductos);
		System.out.println("\tNOMBRE \t CANTIDAD DISPONIBLE");
		for(int i=0; i<nroProductos; i++){
			System.out.println("\t" + productos[i].getNombre() + "\t\t" + cantidad[i]);
		}
		System.out.println("\t-------------------------------------");
	}
	
	public void agregarProducto(Producto p) {
		productos[nroProductos] = p;
		//this.cantidad[nroProductos] = cantidad;
		nroProductos ++;
	}
	
	public int verificarProd(String name) {
		int pos = -1;
		for(int i=0; i<nroProductos; i++) {
			if(productos[i].getNombre().equals(name)) {
				pos = i;
				return pos;
			}
		}
		return pos;
	}
	
	public void agregarCantidad(String name, int cantidad) {
		if(verificarProd(name) >= 0) {
			this.cantidad[verificarProd(name)] += cantidad;
		}else {
			System.out.println("El producto no está registrado!!! Intente de nuevo");
		}
	}
	
	/* productoModa: producto más vendido.
	reducirProduccion: reduce la producción del producto menos vendido.
	fabricarProducto: indica de fabricar productos. */
	
	public double getPrecio(String nombre) {
		double precio = 0.00;
		for(int i=0; i<nroProductos; i++) {
			if(productos[i].getNombre().equals(nombre)) {
				precio = productos[i].precioVenta();
				break;
			}
		}
		return precio;
	}
	
	public void setCantidad(int cantidad, int i) {
		this.cantidad[i] = cantidad;
	}

	public void productoModa() {
		
	}

	public String getFechaActualizacion() {
		return fechaActualizacion;
	}

	public int getNroProductos() {
		return nroProductos;
	}

	public int[] getCantidad() {
		return cantidad;
	}

	public Producto[] getProductos() {
		return productos;
	}
	
	
}
