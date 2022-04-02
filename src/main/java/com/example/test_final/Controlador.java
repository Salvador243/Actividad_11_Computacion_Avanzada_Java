package com.example.test_final;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class Controlador {

    @RequestMapping("/")
    public String greeting() {
        return "form";
    }

    @RequestMapping(value="/resultados", method= {RequestMethod.POST, RequestMethod.TRACE})
    public String submit(@ModelAttribute("suma") Suma suma,
                         BindingResult result, ModelMap model){
        if (result.hasErrors()){
            return "/";
        }
        double n1 = (double) suma.getNumero1();
        double n2 = (double) suma.getNumero2();
        double resultado = suma.resultado(n1, n2);

        model.addAttribute("rs", resultado);

        return "resultados";
    }
}
