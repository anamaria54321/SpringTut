package ro.jademy.springtut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.jademy.springtut.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "redirect:/hello";
    }

    @RequestMapping("/hello")
    public String hello() {

        return "hello";
    }
}
