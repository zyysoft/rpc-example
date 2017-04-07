package io.githup.rpc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import io.githup.rpc.service.service.RpcService;

 
@Configuration
public class RpcConfig {
	
	@Autowired
	private RpcService service;
	
	@Bean(name="/testRpc")
	public HttpInvokerServiceExporter generateCharge(){
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setServiceInterface(RpcService.class);
		exporter.setService(service);
		return exporter;
	}
}
