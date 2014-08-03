package org.destrier;

import java.util.List;

/**
 * A wrapper {@link ProxyServer}.
 * 
 * @author Narasimha Murthi
 *
 */
public class DelegatingProxyServer implements ProxyServer {
	
	private List<ProxyServer> proxyServers;

	/**
	 * Creates proxy server wrapping provided list of proxy servers.
	 * 
	 * @param proxyServers list of {@link ProxyServer}s to wrap.
	 */
	public DelegatingProxyServer(List<ProxyServer> proxyServers) 
	{
		this.proxyServers = proxyServers;
	}

	@Override
	public void start() 
	{
		for(ProxyServer proxyServer : proxyServers)
		{
			proxyServer.start();
		}
	}

	@Override
	public void stop() 
	{
		for(ProxyServer proxyServer : proxyServers)
		{
			proxyServer.start();
		}

	}

}
