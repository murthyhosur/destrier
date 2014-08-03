package org.destrier;

/**
 * Contract that indicates implimentations will create proxy server. Generally used in conjunction with {@link Configuration}
 * 
 * @author Narasimha Murthi
 *
 */
public interface CreatesProxyServer<T extends ProxyServer> {

	/**
	 * Create proxy server.
	 */
	T createProxyServer();
}
