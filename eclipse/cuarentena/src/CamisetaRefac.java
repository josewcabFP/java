
public class CamisetaRefac {
	
	private Manga mangaDer;
	private Manga mangaIzq;
	
	public CamisetaRefac() {
		
		this.mangaDer = new Manga();
		this.mangaIzq = new Manga();
		
		final String colorCam = "verde";
		final double largoCam = 50;
		
		this.mangaDer.setColor(colorCam);
		this.mangaIzq.setColor(colorCam);
		
		this.mangaDer.setLargo(largoCam);
		this.mangaIzq.setLargo(largoCam);
		
	}
}
