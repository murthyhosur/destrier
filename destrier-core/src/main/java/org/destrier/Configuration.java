package org.destrier;

/**
 * Contract for {@link ProxyServer} configuration.
 * 
 * @author Narasimha Murthi
 *
 */
public interface Configuration {

	/**
	 * Configures the provided {@link ProxyServer}.
	 * 
	 * @param proxyServer proxyServer to be configured.
	 */
	void configure(ProxyServer proxyServer);
}
