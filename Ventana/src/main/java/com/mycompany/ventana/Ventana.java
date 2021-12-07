package com.mycompany.ventana;

import java.awt.Font;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Ventana extends JFrame {
   

    public static void main(String[] args){
    
        /*
        Como se vio en la teoria es necesario primero crear el frame 
        */
        
        JFrame ventana = new JFrame("Hola mundo");
        
        //hay que definir el tamaño de la ventana
        ventana.setSize(400, 150);
        //definir sus acciones de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito el panel para poder incorporar los componentes de la interfaz
        JPanel panel = new JPanel();
        //en ese panel agregamos los componentes
        ventana.add(panel);
        
        //vamos a crear un metodo para agregar componentes
        agregarComponente(panel);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        
    }

    private static void agregarComponente(JPanel panel) {
        
        // el panel se debe de inicializar
        panel.setLayout(null); //el panel esta vacio
        
        //agregamos los componentes como:
        JLabel userlabel = new JLabel("Nombre de usuario");
        /*
        para inicializar los componentes se utiliza el metodo
        
        setBounds 
        
        el cual utiliza 4 parametros para poder posicionar el
        componente dentro del panel
        
        2 como coordenadas x y
        2 para definir el tamaño
        */
        
        
        userlabel.setBounds(10, -4, 120, 50);
        //lo agregamos al panel
        panel.add(userlabel);
        
        //agregar un campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(160, 10, 160, 25);
        panel.add(usertext);
        

        //etiqueta de password
        
        JLabel userpassword = new JLabel("Password");
        userpassword.setBounds(10, 26, 80, 50);
        panel.add(userpassword);
        
        JPasswordField passtext = new JPasswordField(20);
        passtext.setBounds(160, 40, 160, 25);
        panel.add(passtext);

        
        //dos botones
        JButton loginbutton = new JButton("Iniciar Sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        //ImageIcon click =new ImageIcon("iniciosesion.png");
        //loginbutton.setIcon(new ImageIcon(click.getImage().getScaledInstance(loginbutton.getWidth(),loginbutton.getHeight(), Image.SCALE_DEFAULT)));//agregar imagen al boton
        loginbutton.setEnabled(true); //activar la funcion del boton
        loginbutton.setFont(new Font("Artial",Font.CENTER_BASELINE,12)); //tipo de letra
        panel.add(loginbutton);
        
        //Registrar
        JButton registrobutton = new JButton("Registrarse");
        registrobutton.setBounds(180, 80, 120, 25); //1ra linea (izq/derecha), 2da linea (arriba/abajo), 3ra linea (largo), 4ta linea (ancho
        //ImageIcon click2 =new ImageIcon("registrar2.png");
        //registrobutton.setIcon(new ImageIcon(click2.getImage().getScaledInstance(registrobutton.getWidth(),registrobutton.getHeight(), Image.SCALE_SMOOTH)));//agregar imagen al boton
        registrobutton.setEnabled(true); //activar la funcion del boton
        registrobutton.setFont(new Font("Artial",Font.CENTER_BASELINE,12)); //tipo de letra
        panel.add(registrobutton);
        
        ActionListener registrobuttonListener = new Registrar();
        registrobutton.addActionListener(registrobuttonListener);
        
                loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        loginbuttonMouseClicked(evt);
            }
            private void loginbuttonMouseClicked(MouseEvent evt) {
                loginbutton.setText("iniciar Sesion");
            loginbutton.addActionListener(new java.awt.event.ActionListener() {
                    private int i;
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
            private void loginbuttonActionPerformed(ActionEvent evt) {
                String [] Usuarios = {"Yohann", "Jean"};
                String [] Contraseñas = new String [2];
                Contraseñas[0]= "Y123";//clave Yohann
                Contraseñas[1]= "J1";//Clave Jean
                String Usuario1=usertext.getText();
                String Contraseña1=passtext.getText();
                boolean mensaje =false;
                for (int i = 0; i < Usuarios.length; i++){
                    if(Usuarios[i].equals(Usuario1)&& Contraseñas[i].equals(Contraseña1)){
                        mensaje = true;
                    } 
                }
                if(mensaje){
                    ActionListener loginbuttonListener = new Bienvenido();
                    loginbutton.addActionListener(loginbuttonListener);
                }  else {
                    if(Usuarios[i]!=(Usuario1) && Contraseñas[i]!=(Contraseña1)) {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }else{
                    if (usertext.getText().isEmpty() || passtext.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Algún campo esta vacío");
                    }
                    
                }
                
                
                
                        
            
                
                /*Este ya quedo
                String Contraseña ="Y123";
                String Usuario="Yohann";
                String User;
                String Pass;
                
                User=usertext.getText();
                Pass=passtext.getText();
                
                
            if (usertext.getText().equals(Usuario)&& passtext.getText().equals(Contraseña)) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                System.exit(0);
            } else {
            if (usertext.getText().isEmpty() || passtext.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algún campo esta vacío");
            } else {
                JOptionPane.showInternalMessageDialog(null, "Usuario o contraseña inexistente");
                System.exit(0);
            }
            }
            }
            });
        */
        
        
        /*
        Tarea deberan de integrar el metodo para que la ventana
        al momento de mandar a llamar aparezca exactamente al centro de la pantalla
        
        Password debe de no ser visible  ***
        
        
        Se debe de tener un usuario por defecto (ustedes lo definien)
        ingreso usuario y pass y me digire a otra venta na que diga BIENVENIDO
        sino USUARIO INEXISTENTE
        
        Deberan de programar la ventana para el registro con los siguientes campos
        
        Nombre
        Apellido Paterno
        Apellido Materno
        Fecha de nacimiento //agregan un objeto calendario  //3 elementos de lista
        Usuario
        Contraseña
        
        */
    }
    
}