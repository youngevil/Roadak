package org.roadak.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestServer {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket serverPool = new ServerSocket(9999, 1, InetAddress.getByName("localhost"));
		Socket server = serverPool.accept();
		
		InputStream is = server.getInputStream();
		int info = 0;
		StringBuffer sb = new StringBuffer(1000);
		
		// http통신은 버퍼를 빈값없이 꽉 채워서 보내는구나.. 끝을 뭘로 구분할까..
		while(true) {
			info = is.read();
			
			if(info == -1){
				break;
			}
			
			sb.append((char) info);
		} 
		
		System.out.println(sb.toString());
		
		server.close();
		serverPool.close();
	}
}