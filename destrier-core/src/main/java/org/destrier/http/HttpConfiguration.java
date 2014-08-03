package org.destrier.http;

import org.destrier.Configuration;
import org.destrier.CreatesProxyServer;
import org.destrier.ProxyServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configuration to create and configure {@link HttpProxyServer}.
 * 
 * @author Narasimha Murthi
 *
 */
public class HttpConfiguration implements Configuration, CreatesProxyServer<HttpProxyServer>{

	private static final Logger LOGGER = LoggerFactory.getLogger( HttpConfiguration.class );
	private String DEFAULT_HOST = "localhost";
	private int DEFAULT_PORT = 8888;
	
	private String host = DEFAULT_HOST;
	private int port = DEFAULT_PORT;

	/**
	 * Configures {@link HttpProxyServer}.
	 */
	@Override
	public void configure(ProxyServer proxyServer) 
	{
		if(proxyServer instanceof HttpProxyServer)
		{
			configureHttpProxyServer(HttpProxyServer.class.cast( proxyServer ));
		}
	}

	private void configureHttpProxyServer(HttpProxyServer httpProxyServer) 
	{
		LOGGER.info("Configuring Http Proxy server");
		httpProxyServer.setHost(host);
		httpProxyServer.setPort(port);
	}

	/**
	 * Creates {@link HttpProxyServer}.
	 */
	@Override
	public HttpProxyServer createProxyServer() 
	{
		return new HttpProxyServer();
	}
	
	/**
	 * Configure http proxy host.
	 */
	public HttpConfiguration configureHost(String host) 
	{
		this.host = host;
		return this;
	}
	
	/**
	 * Configure http proxy port.
	 */
	public HttpConfiguration configureProxyPort(int port) 
	{
		this.port = port;
		return this;
	}

}
