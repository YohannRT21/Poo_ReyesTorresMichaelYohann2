public class drama extends libro {

    public void mostrarlibro(){
        System.out.println("Titulo: " + getTitulo() +"\n"
                            + "Autor: " + getAutor() +"\n"
                            + "ISBN: " + getISBN() +"\n"
                            + "Genero: " + getGenero() +"\n"
                            + "Ejemplares: " + getEjemplares() +"\n"
                            + "Costo del prestamo: " +getCosto_prestamo()+ "\n"
                            +"Total: "+ getTotal());
    }
}