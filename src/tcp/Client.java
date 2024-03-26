/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcp;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

                 
/**
 *
 * @author kaj33
 */
public class Client {

    private String nome;
    private String colore;
    Socket socket;
    BufferedReader keyboard;
    String stringUser;
    String stringServer;
    DataOutputStream dos;
    BufferedReader stringFromServer;

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    
    public void connetti(String nomeServer, int portaServer) {
        System.out.println("_____/n");
        System.out.println("In esecuzione");
        System.out.println("____/N");
        
        try {
            keyboard = new BufferedReader (new InputStreamReader (System.in));
            socket = new Socket(nomeServer, portaServer);
        }
        catch (UnknownHostException ex) {
            System.err.println("Host non riconosciuto");
        }
        catch (IOException e) {
            System.err.println("Server non  avviabile");
            System.err.println("Riprovare");
            System.exit(1);
        }
                
    }

    
    public void scrivi(String dati) {
        // Implementazione del metodo scrivi()
    }

    
    public String leggi() {
        // Implementazione del metodo leggi()
        return null;
        // Implementazione del metodo leggi()
    }

    
    public void chiudi() {
        // Implementazione del metodo chiudi()
    }

}