package cn.xxx.system;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 系统管理服务启动类
 * @author zhuliangwen
 * @date 2022/10/9 16:23
 */
@SpringBootApplication
@Slf4j
@MapperScan("cn.xxx.*.mapper")
@EnableFeignClients(basePackages = {"cn.xxx.system"})
@EnableAspectJAutoProxy(exposeProxy = true) 
public class SystemBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemBootApplication.class, args);
        log.info("=============== SystemBootApplication 系统服务 - 启动成功 a931eeb16299d9de - ===============");
    }
    
    public static void scanComponentAfterInitDataSource(){
        log.info("在初始化数据源后扫描组件的方法");
    }
}
