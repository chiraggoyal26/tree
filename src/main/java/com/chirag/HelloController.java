package com.chirag;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/rest")
public class HelloController {
    
    @RequestMapping(value="/{name}")
    public @ResponseBody String sayHello(@PathVariable String name){
        
        return "Hello " + name;
    }

}
