package org.destrier.http;

import org.destrier.ProxyServer;

/**
 * Http proxy server implementation is responsible for monitoring http traffic.
 * 
 * @author Narasimha Murthi
 *
 */
public class HttpProxyServer implements ProxyServer {

	private String host;
	private int port;

	/**
	 * Start HTTP proxy Server.
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	/**
	 * Stop HTTP proxy Server.
	 */
	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	public void setHost(String host) 
	{
		this.host = host;
	}

	public void setPort(int port)
	{
		this.port = port;
	}

}
