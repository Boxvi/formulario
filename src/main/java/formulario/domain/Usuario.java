package formulario.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class Usuario {

    private String identificador;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String email;

    public Usuario() {
    }
}

/*

    @NotEmpty
    private String email;

 */