import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchProducto {
	private String nomArch;
	private Producto rgProducto;
	
	public ArchProducto(String nom){
		this.nomArch = nom;
	}
	public void Crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream aProducto = new ObjectOutputStream(new FileOutputStream(nomArch));
		aProducto.close();
	}
	public void Adicionar() throws ClassNotFoundException, IOException{
		String op;
		Scanner read = new Scanner(System.in);
		ObjectOutputStream aProducto = null;
		try {
			if(new File(nomArch).exists()){
				aProducto = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else{					
				aProducto = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			
			do{
				rgProducto = new Producto();
				rgProducto.leer();
				aProducto.writeObject(rgProducto);
				System.out.println("Desea cont s/n");
				op = read.next();
			}while(op.equals("s"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fin adicion");
		}finally{
			aProducto.close();
		}
	}
	public void Listar()throws ClassNotFoundException, IOException{
		ObjectInputStream aProducto = null;
		try {
			aProducto = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rgProducto = new Producto();
				rgProducto = (Producto)aProducto.readObject();
				rgProducto.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("Fin listado!!!!");
		}finally{
			aProducto.close();
		}
	
	}
	/*public int contarRopaMarca(String marcax)throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		int c = 0;
		
		ObjectInputStream aProducto = null;
		try {
			aProducto = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rgProducto = new RegRopa();
				rgRopProducto = (RegRopa)aProducto.readObject();
				if(rgProducto.getMarca().equals(marcax)){
					//rgRopa.mostrar();
					System.out.println(rgProducto.getNombre() + " - " + rgProducto.getMarca());
					c++;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("Fin!!!!");
		}finally{
			aProducto.close();
		}
		
		return c;
	}
	public void listarRopaTalla(String tallax) throws ClassNotFoundException, IOException {
		ObjectInputStream aProducto = null;
		try {
			aProducto = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rgRopa = new RegRopa();
				rgRopa = (RegRopa)aProducto.readObject();
				if(rgRopa.getTalla().equals(tallax))
					rgRopa.mostrar();
			}
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e.getMessage());
			System.out.println("Fin listado!!!!");
		}finally{
			aProducto.close();
		}
		
	}*/
	
	public String getNomArch() {
		return nomArch;
	}
	public void setNomArch(String nomArch) {
		this.nomArch = nomArch;
	}
	
}

