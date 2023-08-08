package br.sp.gov.fatec.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")  //influencia na chamada do localhost
public class HelloController {

    //metodo para receber a chamada do requestmap
    @GetMapping
    public String ola(){
        return"ola";
    }

    
}
