
/*
vamos a crear un programa para guardar los datos de animales domesticos
*/ 

public class animal {

    /*
    Encapsulamiento:
    Es poder restringir el acceso a los tipos de dato
    vamos a poder agrupar en una clase el acceso a los diferentes
    metodos, atributos u objetos de clase, para
    que no puedan ser modificados desde otro lugar 
    */

    private String nombre, raza, tipo_alimento;
    private int edad;
    private boolean sexo;

    /*
    Cuando estamos aplicando el encapsulamiento se debe de agregar los metodos 
    constructores

    El constructor nos sirve para poder declarar la existencia de una clase
    para poder inicializar las variables de la clase 
    para poder hacer las instancias de la clase
    */

    public animal(){
        //Esto es un constructor
        /*
        Podemos inicializar las variables 
        podemos aplicar la sobrecarga
        */
    }

    public animal(String nombre, String raza, String tipo_alimento, int edad, boolean sexo){
        //podemos realizar operaciones con cada uno de los parametros
        /*
        Se estan obteniendo el paso de parametros de cada una de las variables para conocer 
        su valor*/
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
        this.sexo = sexo;

    }
    /*
    Cuando los atributos son de tipo private:
    
    get ---> recibir
    set ---> enviar
    */

    //recibir
    public String getnombre(){
        return nombre;
    }
    //enviar
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    //recibir
    public String getraza(){
        return raza;
    }
    //enviar
    public void setraza(String raza){
        this.raza = raza;
    }
    //recibir
    public String gettipo_alimento(){
        return tipo_alimento;
    }
    //enviar
    public void settipo_alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;
    }

    //recibir
    public int getedad(){
        return edad;
    }
    //enviar
    public void setedad(int edad){
        this.edad = edad;
    }
    //recibir
    public boolean getsexo(){
        return sexo;
    }
    //enviar
    public void setsexo(boolean sexo){
        this.sexo = sexo;
    
    }
}