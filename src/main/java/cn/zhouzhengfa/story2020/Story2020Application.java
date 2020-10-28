package cn.zhouzhengfa.story2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 电音
 * 说感觉晃的，自己也晃就行了，只要达到相对静止装讨就行
 * @author zhouzhengfa-china-2020
 * giao桑，故乡的樱花开了
 */
@SpringBootApplication()
@MapperScan("cn.zhouzhengfa.story2020.dao")
public class Story2020Application {

    public static void main(String[] args) {
//        life a,
        SpringApplication.run(Story2020Application.class, args);
/*
李连杰
听爸爸的话
给爸爸的信
世界上就中国人不知道李连杰是中国人
*/
    }

}
