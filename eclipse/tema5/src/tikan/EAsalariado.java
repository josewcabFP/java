package tikan;

import java.time.Year;

/**
 * @author Jose Cabrera Rojas
 */


public class EAsalariado extends Empleado{
	
	
	private double sueldoBase; 

	public EAsalariado() {
		super();
		this.sueldoBase = 0;
	}
	
	public EAsalariado(String nombre, String apellido, String dni, int anyo_ingreso, double sueldoBase) {
		super(nombre, apellido, dni, anyo_ingreso);
		this.sueldoBase = sueldoBase;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.print("Salario: " + this.obtenerSalario() + "\n");
	}

	@Override
	public double obtenerSalario() {
		double salario = this.sueldoBase;
		int anyos = Year.now().getValue() - this.getAnyo_ingreso();
		
		if(anyos >= 2 && anyos <= 3) {
			salario *= 1.05;
		}
		else if(anyos >= 4 && anyos <=7) {
			salario *= 1.1;
		}
		else if(anyos >= 8 && anyos <=15) {
			salario *= 1.15;
		}
		else if(anyos > 15) {
			salario *= 1.2;
		}
		
		return salario;
			
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	
}
	
	

	
	

