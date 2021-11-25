/*
para poder aplicar la herencia de una clase, se utiliza la palabra reservada

extends

Eso significa que la clase va a heredar de una clase padre

Animal es la clase padre
Perro es la clase hija
*/


public class perro extends animal{
    /*
    Aquí deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */

    String ladrido;

    public perro(){
        //constructor de la clase
    }
    
    //sobrecarga para obtener y enviar el ladrido
    public perro(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, String ladrido){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre,raza,tipo_alimento, edad,sexo);
        this.ladrido =ladrido;
    }
    public String getladrido(){
        return ladrido;
    }
    //enviar
    public void setladrido(String ladrido){
        this.ladrido = ladrido;
    }

    //metodo para mostrar la informacion del perro
    public void mostrarperro(){
        System.out.println("El nombre del perro es: " +getnombre() +"\n"
                            +"Su raza es: " +getraza ()+"\n"
                            +"Se alimenta de: " +gettipo_alimento()+"\n"
                            +"Tiene la edad de: " +getedad()+"\n"
                            +"Su sexo es: " +getsexo()+"\n"
                            +"Su ladrido es" + ladrido +"\n");

    }
}
