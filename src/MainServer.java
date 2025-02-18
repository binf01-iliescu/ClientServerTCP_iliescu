import java.net.Socket;

public class MainServer {
    public static void main(String[] args) {
        Server ss = new Server(2000);
        Socket s = ss.attendi();
    }
}