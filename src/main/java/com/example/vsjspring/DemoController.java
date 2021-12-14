package com.example.vsjspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DemoController {


    @GetMapping("/hi")
    public String hi(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hi.html";
    }



    @GetMapping("/demo")

    public String sayHello(@RequestParam(value = "name", defaultValue = "Popat") String name, @RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
        return "index.html";
    }
    @GetMapping("/demohtml")

    public String sayHtml(@RequestParam(value = "name", defaultValue = "Popat") String name, @RequestParam(value = "address", defaultValue = "Chiraigaon") String address) {
        return "test.html";// String.format("Demo %s from %s", name, address);
    }

}
