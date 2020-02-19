package interfaces;

public class ArrayReales implements Estadistica{

	private double [] array;
	
	public ArrayReales(int x) {
		
		this.array = new double [x];
	}
	
	@Override
	public double minimo() {
		double min = this.array[0];
		
		for (double e : this.array) {
			if (e < min) {
				min = e;
			}
		}
		return min;
	}

	@Override
	public double maximo() {
		double max = 0;
		
		for (double e : this.array) {
			if (e > max) {
				max = e;
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		double suma = 0;
		
		for (double e : this.array) {
			suma += e;
		}
		return suma;
	}
	
	public void cargar() {
		
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = Math.random()*10 + 1;
		}
	}
	
	public void imprime() {
		for (double e : this.array) {
			System.out.println(e);
		}
	}
	
	public static void main (String [] args) {
		 ArrayReales a = new ArrayReales(5);
		 
		 a.cargar();
		 a.imprime();
		 System.out.println("El maximo es: " + a.maximo());
		 System.out.println("El minimo es: " + a.minimo());
	}
}
