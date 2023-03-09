package br.com.pratica.profissional.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendaController {
    
    @RequestMapping(value= "/xablau", method = RequestMethod.GET)
    public String helloWorld() {
        return String.format("Olarrr mundo!", HttpStatus.OK);
    }

    @RequestMapping(value = "/xablau/{id}", method = RequestMethod.GET)
    public String teste(@PathVariable("id") Integer id) {
        if(id <= 0){
            return String.format("deu erro", HttpStatus.NOT_FOUND);
        }
        return String.format("opa, certinho!", HttpStatus.OK);
    }
}
