
public class Inventario {
	private String fechaActualizacion;
	private int nroProductos;
	private int[] cantidad = new int[50];
	private Producto[] productos = new Producto[50];
	
	public Inventario(){
		fechaActualizacion = "11/11/2022";
		nroProductos = 0;
	}
	
	public void mostrar() {
		System.out.println("Fecha: " + fechaActualizacion);
		System.out.println("Nro Productos: " + nroProductos);
		System.out.println("NOMBRE \t CANTIDAD DISPONIBLE");
		for(int i=0; i<nroProductos; i++){
			System.out.println(productos[i].getNombre() + "\t\t" + cantidad[i]);
		}
		
	}
	
	public void agregarProducto(Producto p, int cantidad) {
		productos[nroProductos] = p;
		this.cantidad[nroProductos] = cantidad;
		nroProductos ++;
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
}
