package formulario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model) {
        return "form";
    }

    @PostMapping("/form")
    public String procesar(Model model,
                           @RequestParam String usuarioNombre,
                           @RequestParam String usuarioClave,
                           @RequestParam String usuarioCorreo) {
        model.addAttribute("titulo", "Resultado form");
        model.addAttribute("usuarioNombre", usuarioNombre);
        model.addAttribute("usuarioClave", usuarioClave);
        model.addAttribute("usuarioCorreo", usuarioCorreo);
        return "resultado";
    }
}
