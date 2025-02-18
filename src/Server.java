import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int porta;
    public Server(int port){
        this.porta = porta;
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Il server è in ascolto");
        } catch (IOException e) {
            System.err.println("Errore nella fase di ascolto");
        }
    }
    public Socket attendi (){
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Problemi di connessione con il client");
        }
        return clientSocket;
    }

}