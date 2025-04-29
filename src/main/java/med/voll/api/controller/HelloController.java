package med.voll.api.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        System.out.println("AQUIIIIIIIIIIIIIIIII GENTEEEEEEEEEEEEEee");
        return "Hello World, Olá mundo, JESUS EU TE AMO!!!";
    }
}
