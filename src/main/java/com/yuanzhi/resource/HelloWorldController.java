package com.yuanzhi.resource;

import com.yuanzhi.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hejian on 6/4/2016.
 */

@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {

    private static final String template = "Hello, %s!";

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody User sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new User("test", String.format(template, name));
    }
}
