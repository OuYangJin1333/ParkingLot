package cn.park;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("cn.park.mapper")
@EnableCaching
public class ParkAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkAuthApplication.class, args);
	}

}
