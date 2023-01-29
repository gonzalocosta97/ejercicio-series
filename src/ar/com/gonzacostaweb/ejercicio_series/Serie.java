package ar.com.gonzacostaweb.ejercicio_series;

public class Serie {
	
	// Atributos
	
	private String titulo;
	
	private int temporadas;
	
	private boolean entregada;
	
	private String genero;
	
	private String creador;
	
	// Constructor/es
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		
		this.titulo = titulo;
		
		this.temporadas = temporadas;
		
		this.entregada = false;
		
		this.genero = genero;
		
		this.creador = creador;

	}
	
	// Getters

	public String getTitulo() {
		
		return this.titulo;
		
	}

	public int getTemporadas() {
		
		return this.temporadas;
		
	}

	public String getGenero() {
		
		return this.genero;
		
	}

	public String getCreador() {
		
		return this.creador;
		
	}
	
	// Setters

	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
		
	}

	public void setTemporadas(int temporadas) {
		
		this.temporadas = temporadas;
		
	}

	public void setGenero(String genero) {
		
		this.genero = genero;
		
	}

	public void setCreador(String creador) {
		
		this.creador = creador;
		
	}
	
	// Métodos
	
	@Override
	public String toString() {
		
		return this.titulo + " | " + this.temporadas + " temporadas" + " | " + this.genero + " | " + "Creador: " + this.creador;
		
	}
	
	public boolean entregar() {
		
		if(this.entregada == false) {
			
			this.entregada = true;
			
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean devolver() {
		
		if(this.entregada == true) {
			
			this.entregada = false;
			
			return true;
			
		}
		
		return false;
		
	}
	
	// Métodos estáticos
	
	public static int getSeriesEntregadas(Serie[] series) {
		
		int seriesEntregadas = 0;
		
		for(int i = 0; i < series.length; i++) {
			
			if(series[i].entregada == true) {
				
				seriesEntregadas++;
				
			}
			
		}
		
		return seriesEntregadas;
		
	}
	
	public static Serie getSerieConMasTemporadas(Serie[] series) {
		
		Serie serieConMasTemporadas = series[0];
		
		for(int i = 1; i < series.length; i++) {
			
			if(series[i].temporadas > serieConMasTemporadas.temporadas) {
				
				serieConMasTemporadas = series[i];
				
			}
			
		}
		
		return serieConMasTemporadas;
		
	}

}
