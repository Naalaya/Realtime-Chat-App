package chat.services.Server.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SignUpRequest {
    private String username;
    private String password;
    private String name;
    private String address;
    private String image;
}
