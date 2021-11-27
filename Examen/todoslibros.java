public class todoslibros{
    String titulo; 
    String autor; 
    String isbn;
    String genero; 
    int ejemplares; 
    double costo_prestamo;
    double total;

    public todoslibros(){
    }

    public todoslibros(String titulo, String autor, String isbn, String genero, int ejemplares, double costo_prestamo, double total){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.ejemplares = ejemplares;
        this.costo_prestamo = costo_prestamo;
        this.total =total;
    }

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

    public boolean prestamo(){
        boolean prestado = true;
        if(prestados<ejemplares){
            prestados ++;
        }else{
            prestado = false;
        }
        return prestado;
    } 

    public boolean devolucion() {
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString(){
        return "Titulo: " + titulo +"\n"
        + "Autor: " + autor +"\n"
        + "ISBN: " + isbn +"\n"
        + "Genero: " + genero+ "\n"
        + "Ejemplares: " + ejemplares +"\n"
        + "Costo del prestamo: " +costo_prestamo+ "\n"
        +"Total: "+ total;
                  
        

    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String titulo; 
    String autor; 
    String isbn;
    String genero; 
    int ejemplares; 
    double costo_prestamo;
    double total;

    //se crea el objeto libro1 utilizando el constructor con parámetros
    Libro libro1 = new Libro("El quijote", "Cervantes","12fhd", "Drama", 2, 100.00 ,200.0);
    //se crea el objeto libro2 utilizando el constructor por defecto
    Libro libro2 = new Libro("Yohann","Reyes", "asfd23", "Terror", 3, 12,34);

    libro1.mostrarlibros();
    libro2.mostrarlibros();

    System.out.print("Introduce titulo: ");
    titulo = sc.nextLine();
    System.out.print("Introduce autor: ");
    autor = sc.nextLine();
    System.out.print("Numero el isbn: ");
    isbn = sc.nextInt();
    System.out.print("Introduce el genero: ");
    genero = sc.nextLine();
    System.out.print("Introduce los ejemplares: ");
    ejemplares = sc.nextLine();
    System.out.print("Introduce el costo del prestamo: ");
    total = sc.nextInt();
    System.out.print("Introduce el total: ");
    total = sc.nextInt();


    //se asigna a libro2 los datos pedidos por teclado.
    //para ello se utilizan los métodos setters
    libro2.setTitulo(titulo);
    libro2.setAutor(autor);
    libro2.setISBN(isbn);
    libro2.setGenero(genero);
    libro2.setEjemplares(ejemplares);
    libro2.setCosto_prestamo(costo_prestamo);
    libro2.setTotal(total);

    //se muestran por pantalla los datos del objeto libro1
    //se utilizan los métodos getters para acceder al valor de los atributos
    System.out.println("Libro 1:");
    System.out.println("Titulo: " + libro1.getTitulo());
    System.out.println("Autor: " + libro1.getAutor());
    System.out.println("Isbn: " + libro1.getISBN());
    System.out.println("Genero: " + libro1.getGenero());
    System.out.println("Ejemplares: " + libro1.getEjemplares());
    System.out.println("Costo del prestamo: " + libro1.getCosto_prestamo());
    System.out.println("Total: " + libro1.getTotal());
    System.out.println("Prestados: " + libro1.getPrestados());
    System.out.println();

    //se realiza un préstamo de libro1. El método devuelve true si se ha podido
    //realizar el préstamo y false en caso contrario
    if (libro1.prestamo()) {
        System.out.println("Se ha prestado el libro " + libro1.getTitulo());
    } else {
        System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
    }

    //se realiza una devolución de libro1. El método devuelve true si se ha podido
    //realizar la devolución y false en caso contrario
    if (libro1.devolucion()) {
        System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
    } else {
        System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
    }

    //se realiza otro préstamo de libro1
    if (libro1.prestamo()) {
        System.out.println("Se ha prestado el libro " + libro1.getTitulo());
    } else {
        System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
    }

    //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
    //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
    //pantalla el mensaje No quedan ejemplares del libro…
    if (libro1.prestamo()) {
        System.out.println("Se ha prestado el libro " + libro1.getTitulo());
    } else {
        System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
    }
    //mostrar los datos del objeto libro1
    System.out.println("Libro 1:");
    System.out.println("Titulo: " + libro1.getTitulo());
    System.out.println("Autor: " + libro1.getAutor());
    System.out.println("Isbn: " + libro1.getISBN());
    System.out.println("Genero: " + libro1.getGenero());
    System.out.println("Ejemplares: " + libro1.getEjemplares());
    System.out.println("Costo del prestamo: " + libro1.getCosto_prestamo());
    System.out.println("Total: " + libro1.getTotal());
    System.out.println("Prestados: " + libro1.getPrestados());
    System.out.println();

    //mostrar los datos del objeto libro2
    System.out.println("Libro 2:");
    System.out.println("Titulo: " + libro2.getTitulo());
    System.out.println("Autor: " + libro2.getAutor());
    System.out.println("Isbn: " + libro2.getISBN());
    System.out.println("Genero: " + libro2.getGenero());
    System.out.println("Ejemplares: " + libro2.getEjemplares());
    System.out.println("Costo del prestamo: " + libro2.getCosto_prestamo());
    System.out.println("Total: " + libro2.getTotal());
    System.out.println("Prestados: " + libro2.getPrestados());
    System.out.println();



}
}
