package net.xdclass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: xdclass-cloud
 * @description: 22
 * @packagename: net.xdclass.controller
 * @author: 姚泽宇
 * @date: 2022-05-12 13:32
 **/
@SpringBootApplication
@MapperScan("net.xdclass.dao")
@EnableDiscoveryClient
public class VideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class,args);
    }
}
