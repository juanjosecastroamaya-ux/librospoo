public class Libro {
private String titulo;
private String autor;
private double precio;
private double cantidaddeejemplares;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, double cantidaddeejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidaddeejemplares = cantidaddeejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidaddeejemplares() {
        return cantidaddeejemplares;
    }

    public void setCantidaddeejemplares(double cantidaddeejemplares) {
        this.cantidaddeejemplares = cantidaddeejemplares;
    }
    public void Mostrarlibro() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad de emplares: " + this.cantidaddeejemplares);
    }
   public void Devolverlibro(){

   }
}

