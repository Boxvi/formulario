package formulario.domain;

import formulario.validation.Requerido;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
public class Usuario {

    @Pattern(regexp = "[0-9]{2}-[0-9]{4}-[0-9]{4}-[A-Z]{1}", message = "El formato del identificador es incorrecto")
    private String identificador;

    @NotEmpty
    private String nombre;

    @Requerido
    private String apellido;

    @Requerido
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