package client;

import java.io.*;
import java.net.*;

public class Client {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 888);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream br = new DataInputStream(s.getInputStream());
        DataInputStream kb = new DataInputStream(System.in);

        String str, str1;

        while (!(str = kb.readLine()).equals("exit")) {
            dos.writeBytes(str + "\n");
            str1 = br.readLine();
            System.out.println("Server: " + str1);
        }

        dos.close();
        br.close();
        kb.close();
        s.close();
    }
}
