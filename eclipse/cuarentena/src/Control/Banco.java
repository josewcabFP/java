package Control;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Crea una clase Banco, con un conjunto de productos(Utilizar ArrayList).
 * Propiedades:
 *   listaProductos
 * Métodos: 
 *   constructor() 
 *   altaCuenta(recibe una cuenta) //no devuelve nada
 *   altaDeposito(recibe un deposito) //no devuelve nada.
 *   mostrarProductos() //muestra por pantalla todos los productos del banco. Debe mostrar el detalle de los productos, no el código de referencia de la variable. 
 *                      //Mira a ver cómo lo puedes resolver
 *                      
 *   registraProductos( String fichero) //descargará en el fichero indicado todas las cuentas.
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Banco {
	private ArrayList<Producto> listaProductos;

	public Banco() {
		this.listaProductos = new ArrayList<Producto>();
	}
	
	public void altaCuenta(Cuenta c) {
		this.listaProductos.add(c);
	}
	
	public void altaDeposito(Deposito d) {
		this.listaProductos.add(d);
	}
	
	public void mostrarProductos() {
		Iterator<Producto> it = this.listaProductos.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	public void registraProductos(String fichero) {
		try {
			ObjectOutputStream reg_prod = new ObjectOutputStream(new FileOutputStream(fichero));
			reg_prod.writeObject(this.listaProductos);
			reg_prod.close();
		}
		catch(IOException e){
			e.printStackTrace();
			System.err.println("No se pudieron guardar los productos bancarios.");
		}
	}
	
	
}
