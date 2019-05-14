package dev.rappiUnac.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rappiUnac")
@AllArgsConstructor
public class MainController {

    @GetMapping("")
    public String inicio(){
        return "Bienvenido a RappiUnac, haz tus pedidos cuando y donde quieras";
    }
}
