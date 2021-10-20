package br.utfpr.edu.pw26s.resources;

import br.utfpr.edu.pw26s.model.Cumprimento;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/teste")
public class OlaController {

    private static final String template = "Olá %s";

    @GetMapping(value = "/")
    @CrossOrigin(methods = RequestMethod.GET)
    public Cumprimento ola(@RequestParam(name = "nome", defaultValue = "amigo") String nome) {
        return new Cumprimento(String.format(template, nome));
    }
}
