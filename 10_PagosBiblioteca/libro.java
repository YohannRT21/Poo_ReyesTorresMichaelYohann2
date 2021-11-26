public class libro{

    String titulo, autor, isbn, genero;
    int ejemplares;
    double costo_prestamo, total;


    public libro(){
        //esto es un constructor
        /*
        Podemos inicializar las variables
        Podemos aplicar la sobrecarga        
        */ 
    }

    public libro(String titulo,String autor,String isbn,String genero, int ejemplares, double costo_prestamo, double total){

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.ejemplares = ejemplares;
        this.costo_prestamo = costo_prestamo;
        this.total =total;
    }

    //recibir
    public String getTitulo(){
        return titulo;
    }

    //enviar
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    //recibir
    public String getAutor(){
        return autor;
    }

    //enviar
    public void setAutor(String autor){
        this.autor = autor;
    }
    //recibir
    public String getISBN(){
        return isbn;
    }

    //enviar
    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    //recibir
    public String getGenero(){
        return genero;
    }

    //enviar
    public void setGenero(String genero){
        this.genero = genero;
    }

    //recibir
    public int getEjemplares(){
        return ejemplares;
    }

    //enviar
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }

    //recibir
    public double getCosto_prestamo(){
        return costo_prestamo;
    }

    //enviar
    public void setCosto_prestamo(double costo_prestamo){
        this.costo_prestamo = costo_prestamo;
    }

    //recibir
    public double getTotal(){
        return total;
    }
    
    //enviar
    public void setTotal(double total){
        this.total = total;
    }


}