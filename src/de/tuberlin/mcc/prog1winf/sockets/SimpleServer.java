/**
 * 
 */
package de.tuberlin.mcc.prog1winf.sockets;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Dave
 *
 */
public class SimpleServer {
	
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8082);
		Socket client = server.accept();
		
		int i;
		while ((i = client.getInputStream().read()) != -1) {
			System.out.write(i);
		}
		server.close();

	}

}
