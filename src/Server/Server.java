package Server;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server
{
    public static void main(String[] args) throws UnknownHostException
    {
        Socket socket = new Socket();
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("såja");
    }
}
