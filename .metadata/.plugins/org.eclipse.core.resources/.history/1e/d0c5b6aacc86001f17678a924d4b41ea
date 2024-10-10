package network.server;

import java.io.*;
import java.net.*;

class Server {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
        // Create a server socket bound to port 888
        ServerSocket ss = new ServerSocket(888);

        // Wait for a client to connect
        Socket s = ss.accept();
        System.out.println("Connection established");

        // Streams to send and receive data
        PrintStream ps = new PrintStream(s.getOutputStream());
        DataInputStream br = new DataInputStream(s.getInputStream());
        DataInputStream kb = new DataInputStream(System.in);

        // Continuously read messages from the client and respond
        try {
            String str, str1;

            while (true) {
                // Read message from client
                str = br.readLine();
                if (str == null) break;  // Exit if no more data

                System.out.println("Client: " + str);

                // Get response from server user (keyboard input)
                str1 = kb.readLine();

                // Send the response to the client
                ps.println(str1);
            }
        } catch (IOException e) {
            System.out.println("Error in communication: " + e.getMessage());
        } finally {
            // Close all resources
            ps.close();
            br.close();
            kb.close();
            s.close();
            ss.close();
        }
    }
}
