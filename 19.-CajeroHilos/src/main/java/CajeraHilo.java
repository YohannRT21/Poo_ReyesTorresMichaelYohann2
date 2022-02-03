/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yohan
 */


public class CajeraHilo extends Thread {
    
    private String nombre;
    private Cliente cliente;
    private long initialTime;
    
    public CajeraHilo(){ //Constructor de la clase
    }

    public CajeraHilo(String nombre, Cliente cliente, long initialTime) { //Constructor con sobrecarga (tiene parametros)
        super(); //Aquí se crea la herencia 
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    //El metodo para correr el Hilo
    @Override 
    public void run(){
     
                System.out.println("La cajera : " + this.nombre
                +  "comineza a procesar su compra señor cliente: "
                + cliente.getNombre()+ "\n En el tiempo: "
                + (System.currentTimeMillis() - initialTime)/1000 + " segundos"); //aquí se convierten milisegundos a segundos
        
        //Tenemos que obtener todos los productos del carrito
        
        //recorrer la cantidad de productos
        for(int i = 0; i < cliente.getCarroCompra().length; i ++){
            //empezar a definir los tiempos para su proceso de compra
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            
            System.out.println("Procesando el producto: "+ (i+1)
                                + " -> Tiempo: " 
                    +(System.currentTimeMillis() - initialTime)/1000 + " segundos");
            
            System.out.println("La cajera: " + this.nombre
                    + "ha terminado de procesar " + cliente.getNombre()
                    + "en el tiempo "
                    + (System.currentTimeMillis()- initialTime)/1000 + " segundos");
        }
    }

    private void esperarXsegundos(int segundos) {
        try{
            Thread.sleep(segundos*1000);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}