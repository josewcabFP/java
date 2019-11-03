package intervalo;

public class Intervalo {
	double inicio;
	double fin;

	public Intervalo(int _ini, int _fin) {
		this.inicio = _ini;
		this.fin = _fin;
	}

	public double longitud() {
		return Math.abs((this.fin - this.inicio) + 1);

	}

	public void desplazamiento(double _cant) {
		this.inicio += _cant;
		this.fin += _cant;
	}

	public boolean buscar(double _num) {
		boolean _esta = false;

		if (_num >= this.inicio && _num <= this.fin) {
			_esta = true;
		}

		return _esta;
	}

	public boolean estaIncluido(Intervalo _inter) {
		boolean _incl = false;

		if (_inter.inicio >= this.inicio && _inter.fin <= this.fin) {
			_incl = true;
		}

		return _incl;
	}

}
