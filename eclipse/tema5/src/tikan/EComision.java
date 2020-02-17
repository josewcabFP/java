package tikan;

/**
 * @author Jose Cabrera Rojas
 */


public class EComision extends Empleado{
	
	private int nClientes;
	private double monto;
	private final static double SALARIO_MIN;

	static {
		SALARIO_MIN = 750;
	}
	
	public EComision() {
		super();
		this.nClientes = 0;
		this.monto = 0;
	}
	
	public EComision(String nombre, String apellido, String dni, int anyo_ingreso, int nClientes, double monto) {
		super(nombre, apellido, dni, anyo_ingreso);
		this.nClientes = nClientes;
		this.monto = monto;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.print("Salario: " + this.obtenerSalario() + "\nNumero de clientes: " + this.nClientes + "\nMonto por cliente: " + this.monto + "\n");
	}
	
	
	@Override
	public double obtenerSalario() {
		double salario = this.nClientes * this.monto;
		
		if (salario < SALARIO_MIN) {
			salario = SALARIO_MIN;
		}
		return salario;
	}

	public int getnClientes() {
		return nClientes;
	}

	public void setnClientes(int nClientes) {
		this.nClientes = nClientes;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	
}
