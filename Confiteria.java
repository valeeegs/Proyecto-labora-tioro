
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
		 nroEmpleados  = 1;
		 empleados[0] = new Empleado();
		 nroProductos = 1;
		 productos[0] = new Producto();
		 //empleados[1] = new Empleado();
		 nroClientes = 0;
		 inventario = new Inventario();
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
			pedidos[i].mostrar();
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
