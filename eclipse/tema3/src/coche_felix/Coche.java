package coche_felix;

public class Coche{
	private String color;
	private int velocidad;
	private final int velMax=120;
	private final int velMin=0;	

	public Coche(){
		super();
		this.color="Blanco";
		this.velocidad=0;
	}
	public Coche(String color){
		super();
		this.color=color;
		this.velocidad=0;
	}
	public Coche (Coche c){
		super();
		this.color=c.getColor();
		this.velocidad=c.getVelocidad();
	}
	public String getColor(){
		return this.color;
	}
	public int getVelocidad(){
		return this.velocidad;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void acelerar(){
		if (this.velocidad<velMax){
			this.velocidad+=10;
		}
	}
	public void frenar(){
		if (this.velocidad>=velMin){
			this.velocidad-=10;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Color => " + this.getColor() + ", velocidad => " + this.getVelocidad();
	}
}