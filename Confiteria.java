
public class Confiteria implements java.io.Serializable{
	private String nombre;
	private int NIT;  
	private double capital;
	private int nroProductos;
	private Producto[] productos = new Producto[50];
	private int nroEmpleados;  
	private Empleado[] empleados = new Empleado[50];
	private int nroClientes;
	private Cliente[]  clientes = new Cliente[50];
	private Inventario inventario;
	private int nroPedidos;
	private Pedido[] pedidos = new Pedido[50];
	
	public Confiteria() {
		 nombre = "Twice";
		 NIT  = 513215;
		 capital  = 80000.50;
		 nroEmpleados  = 5;
		 empleados[0] = new Empleado("Eliana Nina Condori", 11235813, 20, 3000, "Cajera");
		 empleados[1] = new Empleado("Favio Carbajal Apaza", 23571113, 29, 3500, "Recursos Humanos");
		 empleados[2] = new Empleado("Dario Quispe Mamani",	78975691, 27, 3200,	"Pastelero");
		 empleados[3] = new Empleado("Rose Siñani Valencia", 59873147, 22, 3100, "Empacadora");
		 empleados[4] = new Empleado("Benito Martínez Ocasio", 63598374, 28, 3250, "Chef");
		 nroProductos = 10;
		 
		 productos[0] = new Producto("Turrón de chocolate",	6, 80, 6,"Chocolate con leche",	250, 4.99,
				 "Chocolate negro", 50, 2.49, "Almendras crudas", 20,0.50, "agua", 100, 0.10,
				 "mantequilla derretida", 70, 1.49,"arroz", 50, 3.79);
		 productos[1] = new Producto("Mazapán",	4, 15, 6,"clara de huevo",	1,	0.30, "yema de huevo",	1,	0.30,
				 "Almendras crudas",	250,	5.99, "Azúcar glas",	250,	3.49);
		 productos[2] = new Producto("Dona", 7, 60, 6,"harina",	500,	3.99, "levadura",	15,	0.15,
				 "leche",	100,	0.79, "huevos",	2,	1.20,"Azúcar",	100,	0.89,
				 "mantequilla",	100,	1.59,"sal",	10,	0.05);
		 productos[3] = new Producto("Alfajor",	9, 30, 10, "margarina",	250,	4.59,"Azúcar",	150,	1.19,
				 "yema de huevo",	3,	0.90, "harina",	200,	1.89, "maicena",	300,	3.99, "levadura",	30,	0.30,
				 "limón",	1,	0.59, "coco rallado",	50,	1.59, "dulce de leche",	400,	5.49);
		 productos[4] = new Producto("Bollos", 8, 180, 24,"harina de trigo", 500, 7.99, "sal",	15,	0.07,
				 "leche", 250, 2.49, "mantequilla",	150,	2.29, "huevo",	4,	2.80, "Azúcar glas",	150,	1.99,
				 "levadura",	25,	0.29, "harina",	100,	0.99);
		 productos[5] = new Producto("Chupete",	5, 90, 12, "agua",	200,	0.20, "Azúcar",	400,	3.49,
				 "miel de maiz",	150,	2.49, "saborizante vegetal",	40,	0.99, "palito",	12,	2.40);
		 productos[6] = new Producto("Gusanos de Goma",	5, 60,40,"Grenetina en polvo", 200, 4.15,"jarabe de glucosa", 200, 4.99,
				 "gelatina en polvo",	350,	5.85, "jugo de limon",	120,	1.89,"agua",	3200,	3.20);
		 productos[7] = new Producto("Barritas de chocolate y coco", 3, 70, 7, "aceite de coco",	200,	3.49,
				 "cacao rallado",	250,	5.99,"miel",	75,	1.99);
		 productos[8] = new Producto("Brownie de chocolate", 6,60,10,"margarina", 260, 4.99,"chocolate bitter", 160, 5.59,
				 "azúcar", 480, 4.39,"huevos",	5,	3.49,"harina",	260,	2.59,"azúcar en polvo",	100,	1.89);
		 productos[9] = new Producto();
		 nroClientes = 0;
		 inventario = new Inventario();
		 inventario.agregarProducto(productos[0]);
		 inventario.agregarProducto(productos[1]);
		 inventario.agregarProducto(productos[2]);
		 inventario.agregarProducto(productos[3]);
		 inventario.agregarProducto(productos[4]);
		 inventario.agregarProducto(productos[5]);
		 inventario.agregarProducto(productos[6]);
		 inventario.agregarProducto(productos[7]);
		 inventario.agregarProducto(productos[8]);
		 inventario.agregarProducto(productos[9]);
		 nroPedidos = 0; 
	}
	
	public void mostrar() {
		System.out.println("///////// DATOS CONFITERIA /////////");
		System.out.println("Nombre: " + nombre);
		System.out.println("NIT: " + NIT);
		System.out.println("Capital: " + capital);
		System.out.println("Cantidad de productos producidos: " + nroProductos);
		for(int i=0; i<nroProductos; i++) {
			productos[i].mostrar();
		}
		System.out.println("Nro Empleados: " + nroEmpleados);
		for(int i=0; i<nroEmpleados; i++) {
			empleados[i].mostrar();
		}
		System.out.println("Nro Clientes: " + nroClientes);
		for(int i=0; i<nroClientes; i++) {
			clientes[i].mostrar();
		}
		System.out.println("Nro Pedidos: " + nroPedidos);
		for(int i=0; i<nroPedidos; i++) {
			pedidos[i].mostrar(inventario);
		}
		System.out.println("////////////////////////////////////\n");
	}
	
	public void agregarCliente(Cliente c) {
		clientes[nroClientes] = c;
		nroClientes ++;
	}
	
	public void agregarPedido(Pedido p) {
		pedidos[nroPedidos] = p;
		nroPedidos++;
	}
	
	public double totalSueldos() {
		int total = 0;
		for(int i=0; i<nroEmpleados; i++) {
			total += empleados[i].getSueldo();
		}
		return total;
	}
	
	public boolean inicioMes(String fecha) {
		int dia = Integer.parseInt(fecha.substring(0,2));
		if(dia < 9) {
			return true;
		}
		return false;
	}
	
	public void pagoSueldos(String fecha) {
		if(inicioMes(fecha)) {
			System.out.println("Total de pagar en sueldos: " + totalSueldos());
			for(int i=0; i<nroEmpleados; i++) {
				if(empleados[i].isSueldoPagado() == false) {
					empleados[i].pagarSueldo();
					System.out.println("Se pagaron los sueldos");
				}
			}
			capital -= totalSueldos();
		}else {
			System.out.println("Solo se puede pagar sueldos a inicio de mes");
		}
	}
	
	public boolean verficarCliente(String name) {
		for(int i=0; i<nroClientes; i++) {
			if(clientes[i].getNombre().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNIT() {
		return NIT;
	}

	public double getCapital() {
		return capital;
	}

	public int getNroProductos() {
		return nroProductos;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public int getNroEmpleados() {
		return nroEmpleados;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public int getNroClientes() {
		return nroClientes;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public int getNroPedidos() {
		return nroPedidos;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}
	
}
