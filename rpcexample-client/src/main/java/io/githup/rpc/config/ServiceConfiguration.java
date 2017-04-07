package io.githup.rpc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
public class ServiceConfiguration {
	@Autowired
	public Environment env;

	@Configuration
	@Profile(AppProfile.INTG)
	@PropertySource(value = {"classpath:intg/config.properties" })
	static class ServiceIntgConfiguration {
	}

	@Configuration
	@Profile(AppProfile.PROD)
	@PropertySource(value = {"classpath:prod/config.properties" })
	static class ServiceProdAConfiguration {
	}
}
