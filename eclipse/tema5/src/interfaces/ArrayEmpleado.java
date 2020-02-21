package interfaces;

public class ArrayEmpleado implements Estadistica{
	
	private Empleado [] arrayE;
	
	public ArrayEmpleado(Empleado ... emp) {
		this.arrayE = new Empleado[emp.length];
		
		for(int i = 0; i < this.arrayE.length; i++) {
			this.arrayE[i] = emp[i];
		}
	}

	@Override
	public double minimo() {
		double min = this.arrayE[0].getSueldo();
		
		for (Empleado emp : this.arrayE) {
			if(emp.getSueldo() < min) {
				min = emp.getSueldo();
			}
		}
		return min;
	}               
                    
	@Override       
	public double maximo() {
		double max = this.arrayE[0].getSueldo();
		
		for (Empleado emp : this.arrayE) {
			if(emp.getSueldo() > max) {
				max = emp.getSueldo();
			}
		}
		return max;
	}

	@Override
	public double sumatorio() {
		double suma = 0;
		
		for(Empleado emp : this.arrayE) {
			suma += emp.getSueldo();
		}
		return suma;
	}
	
	public static void main(String args []) {
		
		//Con reales
		ArrayReales arrayR = new ArrayReales(3);
		arrayR.cargar();
		System.out.println(arrayR.sumatorio());
		System.out.println(arrayR.minimo());
		System.out.println(arrayR.maximo());

		//Con empleados
		Empleado e1 = new Empleado("juan", 1500);
		Empleado e2 = new Empleado("jose", 2500);
		Empleado e3 = new Empleado("pedro", 500);
		ArrayEmpleado array = new ArrayEmpleado(e1, e2, e3);
		
		System.out.println(array.sumatorio());
		System.out.println(array.minimo());
		System.out.println(array.maximo());
		// mixto
		
		
		Estadistica [] arrayMixto = {arrayR, array};
		
		for(Estadistica a : arrayMixto) {
			System.out.println(a.minimo());
			System.out.println(a.maximo());
			System.out.println(a.sumatorio());
		}
		
		
		
	}

}
