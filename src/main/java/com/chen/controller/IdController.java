package com.chen.controller;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.service.SegmentService;
import com.sankuai.inf.leaf.service.SnowflakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr-CHEN
 * @version 1.0
 * @description: TODO
 * @date 2020-11-27 16:07
 */
@RestController
public class IdController {

    @Autowired
    SegmentService segmentService;

    @Autowired
    SnowflakeService snowflakeService;

    @GetMapping("/id")
    public long getId(){
        Result test = segmentService.getId("leaf-segment-test");
        return test.getId();
    }

    @GetMapping("/zkid")
    public long zkId(){
        Result x = snowflakeService.getId("x");
        return x.getId();
    }
}
