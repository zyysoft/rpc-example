package io.githup.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.githup.rpc.config.AppProfile;

@SpringBootApplication
public class RpcApplication {
	
	public static void main(String[] args) {
		if (System.getProperty("spring.profiles.active") == null) {
			System.setProperty("spring.profiles.active", AppProfile.INTG);
		}
		SpringApplication.run(RpcApplication.class, args);
	}
}