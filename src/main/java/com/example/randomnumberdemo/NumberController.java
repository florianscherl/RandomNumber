package com.example.randomnumberdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @RequestMapping("/random")
    public int random() {
        return NumberCalculato.number();
    }
}
