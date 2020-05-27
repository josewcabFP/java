package subasta;

import java.util.LinkedList;

/**
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Subasta {
	
	private String nombre;
	private Usuario propietario;
	private boolean abierta;
	private LinkedList<Puja> pujas;
	private Puja pujaMayor;
	
	public Subasta(String nombre, Usuario propietario) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.abierta = true;
		this.pujas = new LinkedList<Puja>();
		this.pujaMayor = null;
		
	}
	
	
	public boolean pujar(Usuario pujador, double cantidad) {
		boolean realizado = true;
		
		if (estaAbierta()) {
		
			if(pujador.creditoInsuficiente(cantidad)) {
				realizado = false;
				System.out.println("El pujador no dispone de los fondos para realizar la puja.");
			}
			else if (pujas.size() > 0 && cantidad < this.pujas.getLast().getCantidad()) {
				realizado = false;
				mostrarMayor();
				System.out.println("El monto de la puja de " + pujador.getNombre() + " es inferior a última puja aceptada.");
			}
			else if(pujador.equals(this.propietario)) {
				realizado = false;
				System.out.println("No se puede pujar a un objeto que te pertenece.");
			}
			else {
				this.pujas.add(new Puja(pujador, cantidad, this));
				this.pujaMayor = this.pujas.getLast();
			}
		}
		else {
			realizado = false;
			System.out.println("\nLa subasta esta cerrada.");
		}
		
		if (realizado) {
			mostrarMayor();
		}
		
		return realizado;
	}
	
	public boolean pujar(Usuario pujador) {
		
		boolean realizado = true;
		double ultimaCantidad;
		
		if(pujas.size() > 0) {
			ultimaCantidad = this.pujaMayor.getCantidad();
		
			if (estaAbierta()) {
			
				if(pujador.creditoInsuficiente(ultimaCantidad + 1)) {
					realizado = false;
					System.out.println("El pujador no dispone de los fondos para realizar la puja.");
				}
				else if(pujador.equals(this.propietario)) {
					realizado = false;
					System.out.println("No se puede pujar a un objeto que te pertenece.");
				}
				else {
					this.pujas.add(new Puja(pujador, ultimaCantidad + 1, this));
					this.pujaMayor = this.pujas.getLast();
				}
			}
			
			else {
				realizado = false;
				System.out.println("La subasta esta cerrada.");
			}
		}
		else {
			realizado = false;
			System.out.println("No existen pujar que referenciar para ser aumentadas.");
		}
		
		if (realizado) {
			mostrarMayor();
		}
		
		return realizado;
	}
	
	public boolean ejecutar() {
		boolean finalizado = false;
		double cantidad;
		
		if (this.abierta && this.pujaMayor != null) {
			cantidad = this.pujaMayor.getCantidad();
			
			this.abierta = false;
			propietario.addCredito(cantidad);
			this.pujaMayor.getUsuario().subCredito(cantidad);
			finalizado = true;
		}
		
		return finalizado;
	}
	
	public boolean estaAbierta() {
		return this.abierta;
	}
	
	public void mostrarMayor() {
		System.out.println("\nLa puja mayor es de " + this.pujaMayor.getCantidad() + "€ a nombre de " + this.pujaMayor.getUsuario().getNombre());
	}


}
