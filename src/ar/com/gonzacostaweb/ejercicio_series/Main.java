package ar.com.gonzacostaweb.ejercicio_series;

public class Main {
	
	public static void main(String[] args) {
		
		Serie[] seriesCargadas = new Serie[5];
		
		// Carga de series
		
		seriesCargadas[0] = new Serie("Game of Thrones", 8, "Fantas�a", "David Benioff y D. B. Weiss");	
		seriesCargadas[1] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");	
		seriesCargadas[2] = new Serie("Lost", 6, "Ciencia Ficci�n", "J. J. Abrams y Damon Lindelof");	
		seriesCargadas[3] = new Serie("Better Call Saul", 6, "Drama", "Vince Gilligan y Peter Gould");		
		seriesCargadas[4] = new Serie("The Office", 9, "Humor", "Greg Daniels");
		
		// Entrega de series
		
		seriesCargadas[1].entregar();
		seriesCargadas[2].entregar();
		seriesCargadas[4].entregar();
		seriesCargadas[0].entregar();
		
		// Devoluci�n de series
		
		seriesCargadas[2].devolver();

		// Obtenci�n de cantidad de series entregadas
		
		int seriesEntregadas = Serie.getSeriesEntregadas(seriesCargadas);
		
		System.out.println("Actualmente existen " + seriesEntregadas + " series entregadas. \n");
		
		// Obtenci�n de serie con m�s cantidad de temporadas
		
		Serie serieConMasTemporadas = Serie.getSerieConMasTemporadas(seriesCargadas);
		
		System.out.println("La serie con m�s temporadas es: " + serieConMasTemporadas);
				
	}

}
