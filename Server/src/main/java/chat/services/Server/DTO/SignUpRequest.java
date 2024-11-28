package chat.services.Server.DTO;

import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String password;
    private String email;
    private String name;
    private String address;
}
