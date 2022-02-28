package com.springboot.BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ControllerImp controllerimp;

    @GetMapping("/Valores/{valor}")
    public String returnValor(@PathVariable String valor) {
        return controllerimp.returnVar(valor);
    }
}
