package ahorcado;

public class Dictionary {
	private String [] dict;
	private String palabra; 
	
	public Dictionary() {
		
		this.dict = new String [] {"martes", "abril", "pedro", "perro", "gato", "coche"}; // Contenido del diccionario.
		
		this.palabra = dict[(int)(Math.random() * dict.length)]; // Carga en una palabra al azar del diccionario.
	}
	
	
	
	public String[] getDict() {
		return dict;
	}
	
	public String getPalabra(){
		return this.palabra;
	}
	
}
