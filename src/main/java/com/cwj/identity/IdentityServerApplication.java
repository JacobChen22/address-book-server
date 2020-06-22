package com.cwj.identity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cwj
 */
@SpringBootApplication(scanBasePackages = {"com.cwj.identity"})
@MapperScan("com.cwj.identity.mapper")
public class IdentityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityServerApplication.class, args);
	}

}
