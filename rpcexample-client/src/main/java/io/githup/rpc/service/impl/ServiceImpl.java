package io.githup.rpc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.githup.rpc.model.App;
import io.githup.rpc.service.client.ClientService;

@Service
public class ServiceImpl implements ClientService {

	private static Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

	@Override
	public App generagePayment() {
		App app =new App();
		app.setName("test");
		app.setPwd("test");
		return app;
	}
}