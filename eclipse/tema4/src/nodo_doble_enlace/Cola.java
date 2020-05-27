package nodo_doble_enlace;

/**
 * Implementar una lista doblemente enlazada.
 * 
 * Modificar Nodo -> añadir el puntero a anterior, y los set/get.
 * Modoficar Lista -> add(), get().
 * Añadir Lista -> toStringReverse().
 * 
 * @author Jose Cabrera Rojas
 *
 */

public class Cola {

	private Nodo ini;
	private Nodo fin;
	
	public Cola(){
		this.ini = null;
		this.fin =null;
	}
	
	public void add (Integer i) {
		Nodo entra= new Nodo(i);
		
		if (isEmpty()) {	
			this.ini = entra;
		} else {
			entra.setAnterior(fin);
			fin.setSiguiente(entra);
		}		
		this.fin = entra;
	}
	
	public Integer get() {
		Integer retorno =null;
		if (!isEmpty()) {	
			Integer sale = this.ini.getValor(); //Es el elemento inicial el que sale.
			this.ini = this.ini.getSiguiente(); //Se recoge el elemento siguiente al primero, que luego pasará a ser la cabeza de cola
			this.ini.setAnterior(null);
			if (isEmpty()) {
				this.fin = null; // Si solo quedaba un elemento, nos aseguramos que fin sea null.
			}
			retorno =  sale;
		}
		return retorno;
		
	}
	
	public boolean isEmpty() {
		return (this.ini == null) ;
	}
	
	public boolean isFull() {
		return false;
	}

    public String toString() {
    	 
        if (isEmpty()) {
            return "No hay nadie en cola.";
        } else {
 
            String resultado = "";
            Nodo puntero = ini;
            resultado = puntero.toString();
            puntero = puntero.getSiguiente();
            
            while (puntero != null) {
                resultado +=  ", " +puntero ;
                puntero = puntero.getSiguiente();
            }
 
            return resultado;
 
        }
 
    }
    
    public String toStringReverse() {
    	 if (isEmpty()) {
             return "No hay nadie en cola.";
         } else {
  
             String resultado = "";
             Nodo puntero = fin;
             resultado = puntero.toString();
             puntero = puntero.getAnterior();
             
             while (puntero != null) {
                 resultado +=  ", " +puntero ;
                 puntero = puntero.getAnterior();
             }
  
             return resultado;
  
         }
  
    }
	
	
}