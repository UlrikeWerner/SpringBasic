package de.github.ulrikewerner.springbasic;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class Controller {

    @GetMapping
    public String sayHello(){
        return "Hello, World!";
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
