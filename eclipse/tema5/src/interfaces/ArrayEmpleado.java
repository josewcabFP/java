package interfaces;

public class ArrayEmpleado implements Estadistica{
	
	private Empleado [] arrayE;
	
	public ArrayEmpleado(int n) {
		this.arrayE = new Empleado[n];
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

}
