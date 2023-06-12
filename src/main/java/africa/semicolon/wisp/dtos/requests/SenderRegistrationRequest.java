package africa.semicolon.wisp.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SenderRegistrationRequest {
    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;

}
