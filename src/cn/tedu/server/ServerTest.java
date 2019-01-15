package cn.tedu.server;

import javax.xml.ws.Endpoint;

import cn.tedu.ws.HelloWSImpl;

/**
 * 发布WebService之后，客户端才能使用
 * 
 * Endpoint.publish(address, new HelloWSImpl());
 * 
 * @author HY
 *
 */
public class ServerTest {
	public static void main(String[] args) {
		String address="http://localhost:8989/AAAA-day01-WebService/hellows";
		
		Endpoint.publish(address, new HelloWSImpl());
		
		System.out.println("WebService已经发布成功!");
	}
}
