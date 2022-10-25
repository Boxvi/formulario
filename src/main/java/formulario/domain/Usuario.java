package formulario.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
    private String username;
    private String password;
    private String email;

    public Usuario() {
    }
}
