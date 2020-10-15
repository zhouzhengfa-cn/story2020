package cn.zhouzhengfa.story2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author zhouzhengfa-china-2020
 */
@SpringBootApplication()
@MapperScan("cn.zhouzhengfa.story2020.dao")
public class Story2020Application {

    public static void main(String[] args) {
        SpringApplication.run(Story2020Application.class, args);
    }

}
