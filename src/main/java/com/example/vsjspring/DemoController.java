package com.example.vsjspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DemoController {


    @GetMapping("/hi")
    public String hi(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hi.html";
    }

    @GetMapping("/add")
    public String add(@RequestParam(value = "first", defaultValue = "56") int first, @RequestParam(value = "second", defaultValue = "76") int  second,Model model) {
        // return String.format("Add: %d + %d=%d", first, second,first +second);
        model.addAttribute("first", first);
        model.addAttribute("second", second);
        model.addAttribute("add", first+second);
        return "add.html";
    }



    @GetMapping("/demo")

    public String sayHello(@RequestParam(value = "name", defaultValue = "Popat") String name, @RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
        return "index.html";
    }
    @GetMapping("/demohtml")

    public String sayHtml(@RequestParam(value = "name", defaultValue = "Popat") String name, @RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
        return "test.html";// String.format("Demo %s from %s", name, address);
    }

    @RequestMapping(value="/about",method = RequestMethod.GET)
    public String about(Model model){
        System.out.println("Inside about handler......");
        model.addAttribute("first", "Vishal");
        model.addAttribute("currentDate", "new Date()");
        String nameString="abc";
        nameString.toUpperCase();
        return "about";
    }

}
