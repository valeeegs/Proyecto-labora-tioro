
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		
		Inventario i = new Inventario();
		i.agregarProducto(p1, 2);
		i.agregarProducto(p1, 6);
		//i.mostrar();
		
		Confiteria c = new Confiteria();
		c.mostrar();
		
	}

}
