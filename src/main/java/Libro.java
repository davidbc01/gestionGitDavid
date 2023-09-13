package src.main.java;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.prestados = 0;
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public Libro(String titulo, int ejemplares) {
        this.titulo = titulo;
        this.ejemplares = ejemplares;
    }

    public String getAutor() { return autor; }
    public String getTitulo() { return titulo; }
    public int getEjemplares() { return ejemplares; }
    public int getPrestados() { return prestados; }

    public void setAutor(String autor) { this.autor = autor; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setEjemplares(int ejemplares) { this.ejemplares = ejemplares; }
    public void setPrestados(int prestados) { this.prestados = prestados; }

}