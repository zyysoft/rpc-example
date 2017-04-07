package io.githup.rpc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.githup.rpc.model.App;
import io.githup.rpc.service.service.RpcService;

@Service
public class RpcServiceImpl implements RpcService {

	private static Logger logger = LoggerFactory.getLogger(RpcServiceImpl.class);

	@Override
	public App generagePayment() {
		logger.info("service begin" );
		App app =new App();
		app.setName("test");
		app.setPwd("test");
		return app;
	}
}