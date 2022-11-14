import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Scanner read = new Scanner(System.in);
		// TODO Auto-generated method stub
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		
		Inventario i = new Inventario();
		i.agregarProducto(p1, 2);
		i.agregarProducto(p1, 6);
		//i.mostrar();
		
		Confiteria c = new Confiteria();
		c.mostrar();
		
		int op;
		ArchProducto p = new ArchProducto("producto.dat");
		do {
			System.out.println("Menú archivo producto");
			System.out.println("1. Crear \n "
					+ "2. Adicionar \n" 
					+ "3. Eliminar\n"
					+ "4. Modificar\n"
					+ "5. Listar\n");
			System.out.print("Elegir la opción: ");
			op = read.nextInt();
			
			switch(op) {
			case 1: p.Crear();
					break;
			case 2: p.Adicionar();
					break;
			case 3: 
			
			case 4:
			
			case 5: p.Listar();
				
			default: System.out.println("No eligió una opción listada en el menú");
			}
		} while(op != 5);
		
	}

}
