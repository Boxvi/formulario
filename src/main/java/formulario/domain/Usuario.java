package formulario.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class Usuario {

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