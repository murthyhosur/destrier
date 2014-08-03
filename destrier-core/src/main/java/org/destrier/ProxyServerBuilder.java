package org.destrier;

import java.util.ArrayList;
import java.util.List;

/**
 * Builds destrier proxy server with provided configuration.
 * 
 * @author Narasimha Murthi
 *
 */
public class ProxyServerBuilder {

	
	private List<Configuration> configurations;

	
	/**
	 * Creates the instance of ProxyServerBuilder with out any configuration.
	 */
	public ProxyServerBuilder() 
	{
		configurations = new ArrayList<Configuration>();
	}
	
	/**
	 * Adds the provided configuration to list of configurations to be used for creating and configuring proxy server.
	 * 
	 * @param configuration configuration to be used for creating and configuring proxy server.
	 */
	public ProxyServerBuilder withConfiguration(Configuration configuration) 
	{
		this.configurations.add(configuration);
		return this;
	}
	
	/**
	 * Build the proxy server and configure it using the provided configuration.
	 */
	public ProxyServer buildProxyServer() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
