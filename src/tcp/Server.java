package tcp;


import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kaj33
 */
public class Server {
        int porta;
        ServerSocket serverSocket;
        Socket socket;
    
    public Server (int porta){
        this.porta = porta;
        
    }
    public Socket attendi(){
        Socket socket = null;
        
        try{
             serverSocket = new ServerSocket();
             System.out.println("Il server è in ascolto");
             socket = serverSocket.accept();
             System.out.println("Il client ha fatto richiesta, connessione avvenuta");
             
        } catch (BindException ex) {
           System.err.println("Porta occupata!");
        }
        catch (IOException ex) {
          System.err.println("Errore nella fase di ascolto del server");
            
        }
        return socket;
    }
    public void scrivi(){};
    public void leggi(){};
    public void chiudi(){};
    public void termina(){
        try {
            this.serverSocket.close();
        } catch (IOException ex) {
            System.err.println("Errore nella chiusura di connessione");
        }
 }
}


