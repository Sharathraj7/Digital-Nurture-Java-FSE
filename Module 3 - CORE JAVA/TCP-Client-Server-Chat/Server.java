import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server waiting...");

            Socket s = ss.accept();

            System.out.println("Client connected");

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(s.getInputStream()));

            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);

            BufferedReader kb =
                    new BufferedReader(
                            new InputStreamReader(System.in));

            while (true) {

                String clientMsg = in.readLine();
                System.out.println("Client: " + clientMsg);

                System.out.print("Server: ");
                String serverMsg = kb.readLine();

                out.println(serverMsg);

                if (serverMsg.equalsIgnoreCase("bye"))
                    break;
            }

            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
