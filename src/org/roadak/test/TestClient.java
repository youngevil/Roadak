package org.roadak.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class TestClient {
	
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket(InetAddress.getByName("localhost"), 9999);
		
		client.close();
	}
}