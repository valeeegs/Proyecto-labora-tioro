import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchConfiteria {
	private String nomArch;
    private Confiteria regConf;

    public ArchConfiteria(String nom) {
        nomArch = nom;
    }

//	crear, adicionar, listar						 
    public void Crear() throws FileNotFoundException, IOException {
        ObjectOutputStream archAvi = new ObjectOutputStream(new FileOutputStream(nomArch));
        archAvi.close();
    }

    public void Adicionar(Confiteria X) throws IOException {
        ObjectOutputStream archConf = null;
        try {
            if (!new File(nomArch).exists()) {
                archConf = new ObjectOutputStream(new FileOutputStream(nomArch, true));
            } else {
                archConf = new AddObjectOutputStream(new FileOutputStream(nomArch, true));
            }

            archConf.writeObject(X);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            archConf.close();
        }
    }
    
    public void Listar() throws IOException {
        ObjectInputStream archConf = null;
        try {
            archConf = new ObjectInputStream(new FileInputStream(nomArch));
            while (true) {
                regConf = (Confiteria) archConf.readObject();
                regConf.mostrar();
            }
        } catch (Exception e) {
            System.out.println("----  Fin del Listado!!  ----");
        } finally {
            archConf.close();
        }
    }
    
    public void Eliminar(String X) throws IOException {//elimina toda una confiteria
        ObjectInputStream archAvi = null;
        ObjectOutputStream archAvi2 = null;
        try {
            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
            while (true) {
                regConf = new Confiteria();
                regConf = (Confiteria) archAvi.readObject();
                if (!regConf.getNombre().equals(X)) {
                    archAvi2.writeObject(regConf);
                }
            }
        } catch (Exception e) {
            System.out.println("----  Se elimino las Confiterias de nombre X ----");
        } finally {
            archAvi.close();
            archAvi2.close();
            File f1 = new File(nomArch);
            f1.delete();
            File f2 = new File("copia.dat");
            f2.renameTo(f1);
        }
    }
    
    public void ProductosConf() throws IOException {
        ObjectInputStream archConf = null;
        try {
            archConf = new ObjectInputStream(new FileInputStream(nomArch));
            while (true) {
                regConf = (Confiteria) archConf.readObject();
                for(int i=0; i<regConf.getNroProductos(); i++) {
                	System.out.println("\t" + regConf.getProductos()[i].getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            archConf.close();
        }
    }
    
    public void InventarioAd(String name, int cantidad) throws IOException {
    	ObjectInputStream archAvi = null;
        ObjectOutputStream archAvi2 = null;
        try {
            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
            while (true) {
                regConf = new Confiteria();
                regConf = (Confiteria) archAvi.readObject();
                regConf.getInventario().agregarCantidad(name, cantidad);
                archAvi2.writeObject(regConf);
                regConf.getInventario().mostrar(); //DELETETHISLATER
            }
        } catch (Exception e) {
            System.out.println("------ ------");
        } finally {
            archAvi.close();
            archAvi2.close();
            File f1 = new File(nomArch);
            f1.delete();
            File f2 = new File("copia.dat");
            f2.renameTo(f1);
        }
    }
    
    public void addCliente(Cliente c) throws IOException {
    	ObjectInputStream archAvi = null;
        ObjectOutputStream archAvi2 = null;
        try {
            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
            while (true) {
                regConf = new Confiteria();
                regConf = (Confiteria) archAvi.readObject();
                /*if (regConf.getNombre().equals(nomC)) {
                    regConf.agregarCliente(c);
                }*/ regConf.agregarCliente(c);
                archAvi2.writeObject(regConf);
            }
        } catch (Exception e) {
            System.out.println("----  Se agrego al cliente  " + c.getNombre() + " ----");
        } finally {
            archAvi.close();
            archAvi2.close();
            File f1 = new File(nomArch);
            f1.delete();
            File f2 = new File("copia.dat");
            f2.renameTo(f1);
        }
    }
    
    public void addPedido(Cliente c, Pedido p) throws IOException {
    	ObjectInputStream archAvi = null;
        ObjectOutputStream archAvi2 = null;
        try {
            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
            while (true) {
                regConf = new Confiteria();
                regConf = (Confiteria) archAvi.readObject();
                regConf.agregarPedido(p);
                archAvi2.writeObject(regConf);
            }
        } catch (Exception e) {
            System.out.println("---- Pedido agregado ----");
        } finally {
            archAvi.close();
            archAvi2.close();
            File f1 = new File(nomArch);
            f1.delete();
            File f2 = new File("copia.dat");
            f2.renameTo(f1);
        }
    }
    
    public void addPedidoAntiguo(String name, Pedido p) throws IOException {
    	ObjectInputStream archAvi = null;
        ObjectOutputStream archAvi2 = null;
        try {
            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
            while (true) {
                regConf = new Confiteria();
                regConf = (Confiteria) archAvi.readObject();
                if(regConf.verficarCliente(name)) {
                	regConf.agregarPedido(p);
                }else {
                	System.out.println("El cliente no est? registrado, intente de nuevo");
                }
                archAvi2.writeObject(regConf);
                // revisar p.costoTotal(c)
            }
        } catch (Exception e) {
            System.out.println("----  ----");
        } finally {
            archAvi.close();
            archAvi2.close();
            File f1 = new File(nomArch);
            f1.delete();
            File f2 = new File("copia.dat");
            f2.renameTo(f1);
        }
    }
    
    public void MovimientoMonetario() throws IOException {
        ObjectInputStream archConf = null;
        try {
            archConf = new ObjectInputStream(new FileInputStream(nomArch));
            while (true) {
                regConf = (Confiteria) archConf.readObject();
                regConf.gananciasTotales();
            }
        } catch (Exception e) {
            System.out.println("----  Fin del Listado!!  ----");
        } finally {
            archConf.close();
        }
    }
    
    public void pagarSueldos(String fecha) throws IOException {
    	ObjectInputStream archAvi = null;
        ObjectOutputStream archAvi2 = null;
        try {
            archAvi = new ObjectInputStream(new FileInputStream(nomArch));
            archAvi2 = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
            while (true) {
                regConf = new Confiteria();
                regConf = (Confiteria) archAvi.readObject();
                regConf.pagoSueldos(fecha);
                archAvi2.writeObject(regConf);
            }
        } catch (Exception e) {
            System.out.println("------------------------------");
        } finally {
            archAvi.close();
            archAvi2.close();
            File f1 = new File(nomArch);
            f1.delete();
            File f2 = new File("copia.dat");
            f2.renameTo(f1);
        }
    }

}
