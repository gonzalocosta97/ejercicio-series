package ar.com.gonzacostaweb.ejercicio_series;

public class Main {
	
	public static void main(String[] args) {
		
		Serie[] seriesCargadas = new Serie[5];
		
		// Carga de series
		
		seriesCargadas[0] = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff y D. B. Weiss");	
		seriesCargadas[1] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");	
		seriesCargadas[2] = new Serie("Lost", 6, "Ciencia Ficción", "J. J. Abrams y Damon Lindelof");	
		seriesCargadas[3] = new Serie("Better Call Saul", 6, "Drama", "Vince Gilligan y Peter Gould");		
		seriesCargadas[4] = new Serie("The Office", 9, "Humor", "Greg Daniels");
		
		// Entrega de series
		
		seriesCargadas[1].entregar();
		seriesCargadas[2].entregar();
		seriesCargadas[4].entregar();
		seriesCargadas[0].entregar();
		
		// Devolución de series
		
		seriesCargadas[2].devolver();

		// Obtención de cantidad de series entregadas
		
		int seriesEntregadas = Serie.getSeriesEntregadas(seriesCargadas);
		
		System.out.println("Actualmente existen " + seriesEntregadas + " series entregadas. \n");
		
		// Obtención de serie con más cantidad de temporadas
		
		Serie serieConMasTemporadas = Serie.getSerieConMasTemporadas(seriesCargadas);
		
		System.out.println("La serie con más temporadas es: " + serieConMasTemporadas);
				
	}

}
