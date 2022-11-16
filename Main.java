import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Scanner read = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*Producto p1 = new Producto();
		Producto p2 = new Producto();
		//p2.leer();
		//p2.mostrar();
		
		Inventario i = new Inventario();
		i.agregarProducto(p1, 2);
		i.agregarProducto(p1, 6);
		//i.mostrar();
		
		Confiteria c = new Confiteria();
		c.mostrar();*/
		
		int op;
		ArchConfiteria c = new ArchConfiteria("confiteria.dat");
		do {
			System.out.println("\nMenú archivo confiteria");
			System.out.println("1. CREAR \n"
					+ "2. ADICIONAR \n"
					+ "3. AGREGAR CANTIDAD DE PRODUCTO HECHO \n" 
					+ "4. AGREGAR PEDIDOS \n"
					+ "5. MOSTRAR MOVIMIENTO MONETARIO\n"
					+ "6. LISTAR \n"
					+ "7. PAGAR SUELDOS \n"
					+ "8. ELIMINAR CONFITERIA \n"
					+ "9. SALIR");
			System.out.print("Elegir la opción: ");
			op = read.nextInt();
			read.nextLine();
			
			switch(op) {
			case 1: c.Crear();
					break;
			case 2: Confiteria con = new Confiteria();
					c.Adicionar(con);
					break;
			case 3: System.out.println("\tProductos de la confitería"); c.ProductosConf();
					System.out.print("\tIngrese el producto a añadir la cantidad: ");
					String product = read.nextLine();
					System.out.print("\tIngrese la cantidad: ");
					int cantidad = read.nextInt();
					read.nextLine();
					c.InventarioAd(product, cantidad);
					break;
			case 4: /*System.out.println("Ingrese el nombre de la confitería a agregar el PEDIDO");*/
					Pedido pedido = new Pedido();
					System.out.println("\t1.CLIENTE NUEVO \n\t2.CLIENTE ANTIGUO");
					int opc = read.nextInt();
					read.nextLine();
					switch(opc) {
						case 1: Cliente ncliente = new Cliente();
								ncliente.leer();
								c.addCliente(ncliente);
								pedido.leer();
								c.addPedido(ncliente, pedido);
								System.out.println("\t¿Desea dar propina? \n\t1.SÍ \n\t2.NO");
								int opPropina = read.nextInt();
								read.nextLine();
								switch(opPropina) {
									case 1: ncliente.propina(true);
											break; 
									case 2: ncliente.propina(false);
											break;
								}
								pedido.costoTotal(ncliente);
								break;
						case 2: System.out.print("\tIngrese el nombre del cliente: ");
								String name = read.nextLine();
								pedido.leer();
								c.addPedidoAntiguo(name, pedido);
								//pedido.costoTotal();
								break;
						default: System.out.println("\tNo escogió una de las opciones disponibles");
								 break;
					}
					break;
			case 5: c.MovimientoMonetario();
					break;
			case 6: c.Listar();
					break;
			case 7: System.out.println("Ingrese la fecha actual en formato DD/MM/AA");
					String fecha = read.nextLine();
					c.pagarSueldos(fecha);
					break;
			case 8: System.out.println("Ingrese el nombre de la confitería a eliminar");
					String name = read.nextLine();
					c.Eliminar(name);
					break;
			case 9: System.out.println("Fin del programa");
					break;
			default: System.out.println("No eligió una opción listada en el menú");
			}
		} while(op != 9);
		
	}

}
