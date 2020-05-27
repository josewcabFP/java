package control_errores;

public class AdvinaError extends RuntimeException{
	
	public AdvinaError(int n) {
		super(n + " no es el número, intentalo otra vez");
	}

}
