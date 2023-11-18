package com.gp.demo.tools;

public class Libro {

	
		private String titulo;

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public Libro(String titulo) {
			super();
			this.titulo = titulo;
		}
		
		
		//@Override
		public int compareTo(Libro unLibro) {
		    int valorComparado = getTitulo().compareTo(unLibro.getTitulo());
		    return valorComparado;
		}
}
