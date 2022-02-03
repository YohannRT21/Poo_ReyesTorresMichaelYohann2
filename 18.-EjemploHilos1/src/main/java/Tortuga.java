/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yohan
 */
/*
Ejemplo de un hilo de la fabula de la liebre y la
tortuga donde la liebre debe de tener un proceso inicial
0 hasta 100 ms
una vez finalizado ese tiempo el hilo se duerme
*/

import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

public class Tortuga extends Thread {
    
    //metodo para que corra
    public void run (){
        for(int i = 0; i < 100; i++){
            System.out.println("Avanza la liebre"+i);
            //Cuando llegue a 100 se duerme
            try{
                sleep(300);//recuerden son ms
            }catch(InterruptedException ex){
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        }
        System.out.println("Termino liebre");
    }
}