package tema9_genericos;


class Coche {

	private String color;
	private int velocidad;

	public Coche(String color) {
		this.color = color;
		this.velocidad = 0;
	}

	public String getColor() {
		return this.color;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void acelera() {
		this.velocidad += 10;
	}

	
	public void frena() {
		this.velocidad	-= 10;
	}

	public String toString() {
		return "Coche, color: " + this.color + ", velocidad: " + this.velocidad;
	}
}

