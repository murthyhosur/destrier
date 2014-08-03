package org.destrier.http;

import org.destrier.Configuration;
import org.destrier.CreatesProxyServer;

/**
 * Configuration to create and configure Http proxy server.
 * 
 * @author Narasimha Murthi
 *
 */
public class HttpConfiguration implements Configuration<HttpProxyServer>, CreatesProxyServer<HttpProxyServer>{

	@Override
	public void configure(HttpProxyServer proxyServer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HttpProxyServer createProxyServer() {
		// TODO Auto-generated method stub
		return null;
	}

}
