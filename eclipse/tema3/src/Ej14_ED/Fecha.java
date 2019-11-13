package Ej14_ED;

public class Fecha {
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha (int _dia, int _mes, int _anyo) {
		this.dia = _dia;
		this.mes = _mes;
		this.anyo = _anyo;
	}
	
	public void diferencia(Fecha _otraFecha) {
		
		//podemos inicializar los valores como si el mes el dia y el año fueran mayores y luego
		//solo especificar los casos en los que sean mayores.
		int diasDif = Math.abs(this.dia - _otraFecha.getDia());
		int mesDif = Math.abs(this.mes - _otraFecha.getMes());
		int anyoDif = Math.abs(this.anyo - _otraFecha.getAnyo());
		
		
		if (this.mes < _otraFecha.getMes()) {
			mesDif = 12 - mesDif;
			anyoDif = anyoDif - 1;
			
			if (this.dia < _otraFecha.getDia()) {
				diasDif = this.diasMes(this.mes - 1) - diasDif;
				mesDif--;
			}
		}
		
		else if (this.dia < _otraFecha.getDia()) {
			diasDif = this.diasMes(_otraFecha.getMes()) - diasDif;
			mesDif = mesDif - 1;
		}
		
		
		System.out.println("La diferencia es de " + anyoDif + " años, " + mesDif + " meses y " + diasDif + " dias.");
	}
	
	public int diasMes(int mes) {
		int dias;
		
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12:
			dias = 31;
			break;
		case 2: 
			dias = 29;
			break;
		default:
			dias = 30;
			break;
		}
		
		return dias;
	}
	
	public boolean bisiesto() {
		boolean bis = false;
		
		if ((this.anyo % 4 == 0 || this.anyo % 400 == 0) && this.anyo % 100 != 0) {
			bis = true;
		}
		
		return bis;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	

}
