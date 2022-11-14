
public class Confiteria implements java.io.Serializable{
	private String nombre;
	private int NIT;  
	private double capital;
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
		 nroEmpleados  = 2;
		 empleados[0] = new Empleado();
		 empleados[1] = new Empleado();
		 nroClientes = 0;
		 inventario = new Inventario();
		 nroPedidos = 0; 
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("NIT: " + NIT);
		System.out.println("Capital: " + capital);
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
		System.out.println();
		
	}
	
	public void agregarCliente(Cliente c) {
		clientes[nroClientes] = c;
		nroClientes ++;
	}
	
	public void agregarPedido(Pedido p) {
		pedidos[nroPedidos] = p;
		nroPedidos++;
	}

}
