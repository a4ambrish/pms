package com.pms.genesis.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pms.genesis.common.GenesisDateUtils;
@SpringBootApplication
public class GenesisApplicationServiceD {

	public static void main(String[] args) {
		GenesisDateUtils.getCurrentDate();
		SpringApplication.run(GenesisApplicationServiceD.class, args);
	}

}
