package api.models;

import lombok.Data;

@Data
public class LoginModel {
    private String email, password;
}
