package formulario.controllers;

import formulario.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;

@Controller
@SessionAttributes("usuario")
public class FormController {
    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Boris");
        usuario.setApellido("Quizhpe");
       // usuario.setIdentificador("20-1234-1234-A");
        model.addAttribute("titulo", "Registrar usuario");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {
        model.addAttribute("titulo", "Resultado form");

        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("usuario", usuario);
        status.setComplete();
        return "resultado";
    }

    /*
    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
        model.addAttribute("titulo", "Resultado form");

        if (result.hasErrors()) {
            return "form";
        }
        model.addAttribute("usuario", usuario);
        return "resultado";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario usuarios");
        return "form";
    }


    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {
        model.addAttribute("titulo", "Resultado formulario");
        if (result.hasErrors()) {
            Map<String, String> errores = new HashMap<>();
            result.getFieldErrors().forEach(err -> {
                errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
            });
            model.addAttribute("error", errores);
            return "form";
        }


        model.addAttribute("usuario", usuario);
        return "resultado";
    }

    @PostMapping("/form")
    public String procesar(Model model, @RequestParam String username, @RequestParam String password, @RequestParam String email) {
        model.addAttribute("titulo", "Formulario Resultado");
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("email", email);
        return "resultado";
    }

    @PostMapping("/form")
    public String procesar(Model model, @RequestParam String username, @RequestParam String password, @RequestParam String email) {
        model.addAttribute("titulo", "Formulario Resultado");
        Usuario usuario = new Usuario(username, password, email);

        model.addAttribute("usuario", usuario);
        return "resultado";
    }*/

}
