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
			System.out.println("\nMen� archivo confiteria");
			System.out.println("1. CREAR \n"
					+ "2. ADICIONAR \n"
					+ "3. AGREGAR CLIENTE \n" 
					+ "4. AGREGAR PEDIDOS \n"
					+ "5. LISTAR \n"
					+ "6. PAGAR SUELDOS \n"
					+ "7. ELIMINAR CONFITERIA \n"
					+ "8. SALIR");
			System.out.print("Elegir la opci�n: ");
			op = read.nextInt();
			read.nextLine();
			
			switch(op) {
			case 1: c.Crear();
					break;
			case 2: Confiteria con = new Confiteria();
					c.Adicionar(con);
					break;
			case 3: /*System.out.println("Ingrese el nombre de la confiter�a a agregar el cliente");
					String nomC = read.nextLine();*/
					Cliente cliente = new Cliente();
					cliente.leer();
					c.addCliente(cliente);
					break;
			case 4: /*System.out.println("Ingrese el nombre de la confiter�a a agregar el PEDIDO");*/
					Pedido pedido = new Pedido();
					pedido.leer();
					break;
			case 5: c.Listar();
					break;
			case 6: System.out.println("Ingrese la fecha actual en formato DD/MM/AA");
					String fecha = read.nextLine();
					c.pagarSueldos(fecha);
					break;
			case 7: System.out.println("Ingrese el nombre de la confiter�a a eliminar");
					String name = read.nextLine();
					c.Eliminar(name);
					break;
			case 8: System.out.println("Fin del programa");
					break;
			default: System.out.println("No eligi� una opci�n listada en el men�");
			}
		} while(op != 8);
		
	}

}
