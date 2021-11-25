/*
para poder aplicar la herencia de una clase, se utiliza la palabra reservada

extends

Eso significa que la clase va a heredar de una clase padre

Animal es la clase padre
Gato es la clase hija
*/


public class gato extends animal{
    /*
    Aquí deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */

    int num_vidas;

    public gato(){
        //constructor de la clase
    }
    
    //sobrecarga para obtener y enviar el ladrido
    public gato(String nombre, String raza, String tipo_alimento, int edad, boolean sexo, int num_vidas){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre,raza,tipo_alimento, edad,sexo);
        this.num_vidas =num_vidas;
    }
    public int getnum_vidas(){
        return num_vidas;
    }
    //enviar
    public void setnum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    //metodo para mostrar la informacion del perro
    public void mostrargato(){
        System.out.println("El nombre del perro es: " +getnombre()+"\n"
                            +"Su raza es: " +getraza ()+"\n"
                            +"Se alimenta de: " +gettipo_alimento()+"\n"
                            +"Tiene la edad de: " +getedad()+"\n"
                            +"Su sexo es: " +getsexo()+"\n"
                            +"Su ladrido es" + num_vidas +"\n");

    }
}