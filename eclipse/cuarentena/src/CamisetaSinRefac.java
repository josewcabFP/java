
public class CamisetaSinRefac {
	
	private Manga mangaDer;
	private Manga mangaIzq;
	
	public CamisetaSinRefac() {
		
		this.mangaDer = new Manga();
		this.mangaIzq = new Manga();
		
		this.mangaDer.setColor("verde");
		this.mangaIzq.setColor("verde");
		
		this.mangaDer.setLargo(50);
		this.mangaIzq.setLargo(50);
		
	}

}
