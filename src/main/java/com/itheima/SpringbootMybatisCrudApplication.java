package com.itheima;

import com.itheima.Service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootMybatisCrudApplication  {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisCrudApplication.class, args);
        log.info("项目启动成功");
    }



}
