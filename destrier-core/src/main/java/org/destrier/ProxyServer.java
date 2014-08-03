package org.destrier;

/**
 * Contract for destrier proxy server.
 * 
 * @author Narasimha Murthi
 *
 */
public interface ProxyServer {

	
	/**
	 * Starts the proxy server.
	 */
	void start();
	
	
	/**
	 * Stops the proxy server.
	 */
	void stop();
}
