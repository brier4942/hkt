package com.coconet.ifms;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;



@SpringBootApplication	// 启动SpringBoot程序，而后自带子包扫描
@EnableTransactionManagement
@EnableScheduling
@MapperScan(basePackages = "com.coconet.ifms.dao")
public class StartSpringBootMain {
   
	
	public static void main(String[] args) throws Exception {
    	
        SpringApplication.run(StartSpringBootMain.class, args);
       
        
    }
	   

   
}
