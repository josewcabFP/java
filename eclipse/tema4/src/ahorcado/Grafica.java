package ahorcado;

public enum Grafica {
	
	INTENTO0(	"\n________\n"
			+ 	"|\n"
			+ 	"|\n"
			+ 	"|                              (Quedan 5 intentos)\n"
			+ 	"|\n"
			+ 	"|\n"
			+ 	"|",0),
	
	INTENTO1(	"\n________\n"
			+ 	"|      |\n"
			+ 	"|\n"
			+ 	"|                              (Quedan 4 intentos)\n"
			+ 	"|\n"
			+ 	"|\n"
			+ 	"|",1),
	INTENTO2(	"\n________\n"
			+ 	"|      |\n"
			+ 	"|      0\n"
			+ 	"|                              (Quedan 3 intentos)\n"
			+ 	"|\n"
			+ 	"|\n"
			+ 	"|",2),
	INTENTO3(	"\n________\n"
			+ 	"|      |\n"
			+ 	"|      0\n"
			+ 	"|     /|\\                     (Quedan 2 intentos)\n"
			+ 	"|\n"
			+ 	"|\n"
			+ 	"|\n",3),
	INTENTO4(	"\n________\n"
			+ 	"|      |\n"
			+ 	"|      0\n"
			+ 	"|     /|\\                     (Quedan 1 intentos)\n"
			+ 	"|      |\n"
			+ 	"|\n"
			+ 	"|",4),
	INTENTO5(	"\n________\n"
			+ 	"|      |\n"
			+ 	"|      0\n"
			+ 	"|     /|\\                      ===============\n"
			+ 	"|      |                       |  GAME OVER  |\n"
			+ 	"|     /^\\                      ===============\n"
			+ 	"|",5);
	
	private String graf;
	private int numIntentos;
	
	private Grafica(String _graf, int _numIntentos) {
		this.graf = _graf;
		this.numIntentos = _numIntentos; 
	}
	
	public String getGraf() {
		return this.graf;
	}
	
	public int getIntentos() {
		return this.numIntentos;
	}
}
