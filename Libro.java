package mislibros;

import java.io.Serializable;

public class Libro implements Serializable{
	public static final long serialVersionUID =1L;
	
	// Declaración de variables miembro.
	private static int cantidadLibros=0;// Común a todos los objetos.
	private String titulo, autor, sinopsis,isbn;
	private int edicion;
	private String bibliografia;
	
	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.sinopsis = "";
		this.edicion = 0;
		this.isbn = "";
		this.bibliografia = "";
	}
	public Libro(String titulo, String autor, String sinopsis, int edicion, String isbn, String bibliografia) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.sinopsis = sinopsis;
		this.edicion = edicion;
		this.isbn = isbn;
		this.bibliografia = bibliografia;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public int getEdicion() {
		return edicion;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getBibliografia() {
		return bibliografia;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public void setIsbn(String isbn) {
		if (validarISBN(isbn)) {
			this.isbn = isbn;
		}else {
			System.out.println("ISBN no v�lido");
			}
		
	}
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public static void aumentarLibros(){
		cantidadLibros++;
	}
	
	public static void decrementarLibros() {
		cantidadLibros--;
	}
	
	
	public static boolean validarISBN(String isbn){// Común a tosdos los objetos.
		
			return true;// Solucionar
			
	}
	
    public String toString(){
        return "Título: "+getTitulo()+", Autor: "+getAutor();
    }
	
	
	
}
