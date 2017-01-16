package com.rock.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xhhe on 2017/1/16.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String helloworld()
    {
        return  "Hello World~";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name)
    {
        return "hello "+name;
    }

}
