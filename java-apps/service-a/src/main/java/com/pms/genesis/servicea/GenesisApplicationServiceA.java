package com.pms.genesis.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.pms.genesis.common.GenesisDateUtils;
@SpringBootApplication
public class GenesisApplicationServiceA {

	public static void main(String[] args) {
		GenesisDateUtils.getCurrentDate();
		SpringApplication.run(GenesisApplicationServiceA.class, args);
	}

}
