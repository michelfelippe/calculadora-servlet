package br.edu.usj.ads.lpii.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Calculadora {
    @PostMapping(value = "/calcular")
    public ModelAndView postCalcular(@RequestParam String num1, @RequestParam String num2, @RequestParam String operadores){
        ModelAndView modelAndView = new ModelAndView("index");
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);
        Double resultado = 0.0;
        
        //ASPAS DUPLAS PARA FUNCIONAR!
        switch(operadores){
            case "+": resultado = n1 + n2; break;
            case "-": resultado = n1 - n2; break;
            case "*": resultado = n1 * n2; break;
            case "/": resultado = n1 / n2; break;
            default: resultado = 0.00;
        }

        String texto = "Resultado:" + resultado;

        modelAndView.addObject("msn", texto);

        return modelAndView;
    }
    
}