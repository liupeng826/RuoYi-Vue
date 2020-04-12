package com.ruoyi;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


/*
* 说明：加载外部配置文件（spring boot加载外部spring配置）
* */
@Configuration
@ImportResource(locations= {"classpath:applicationContext.xml"})
public class Config {

}
