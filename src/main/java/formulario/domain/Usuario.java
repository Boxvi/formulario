package formulario.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class Usuario {

    @Pattern(regexp = "[0-9]{2}-[0-9]{4}-[0-9]{4}-[A-Z]{1}", message = "El formato del identificador es incorrecto")
    private String identificador;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotEmpty(message = "El usuario no puede estar vacio")
    @Size(min = 3, max = 8)
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty(message = "El email no puede estar vacio, o no esta escrito correctamente")
    @Email
    private String email;

    public Usuario() {
    }
}

/*

    @NotEmpty
    private String email;

 */