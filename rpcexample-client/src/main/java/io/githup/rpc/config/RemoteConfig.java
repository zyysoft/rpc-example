package io.githup.rpc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.remoting.httpinvoker.HttpComponentsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import io.githup.rpc.service.service.RpcService;


@Configuration
public class RemoteConfig {
	
	@Autowired
	private Environment env;
	
//    @Autowired
//	private HttpComponentsHttpInvokerRequestExecutor httpInvokerRequestExecutor;
    @Bean
	public HttpComponentsHttpInvokerRequestExecutor httpInvokerRequestExecutor(){
		HttpComponentsHttpInvokerRequestExecutor httpInvokerRequestExecutor = new HttpComponentsHttpInvokerRequestExecutor();
		return httpInvokerRequestExecutor;
	}
    
	@Bean
	public RpcService remoteRpcService(){
		HttpInvokerProxyFactoryBean bean = new HttpInvokerProxyFactoryBean();
		bean.setServiceInterface(RpcService.class);
		bean.setServiceUrl(env.getProperty("remote.rpcService"));
		bean.afterPropertiesSet();
		return (RpcService) bean.getObject();
	}
}