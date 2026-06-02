import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 5000);

            BufferedReader in =
                    new BufferedReader(
                            new InputStreamReader(s.getInputStream()));

            PrintWriter out =
                    new PrintWriter(s.getOutputStream(), true);

            BufferedReader kb =
                    new BufferedReader(
                            new InputStreamReader(System.in));

            while (true) {

                System.out.print("Client: ");
                String msg = kb.readLine();

                out.println(msg);

                if (msg.equalsIgnoreCase("bye"))
                    break;

                String reply = in.readLine();
                System.out.println("Server: " + reply);
            }

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
