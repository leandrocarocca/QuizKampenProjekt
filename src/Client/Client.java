package Client;

import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class Client
{
    public Client() throws IOException
    {
        int port = 55553;
        try(
                Socket socket = new Socket("127.0.0.1",port);
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        ){

            String name = JOptionPane.showInputDialog("Skriv ditt namn: ");
            output.println(name);
        }

    }

    public static void main(String[] args) throws IOException
    {
        Client c = new Client();
    }

}


