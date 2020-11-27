package com.chen;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2020-11-27 15:33
 */
@SpringBootApplication
@EnableLeafServer
public class LeafApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeafApplication.class,args);
    }

}
