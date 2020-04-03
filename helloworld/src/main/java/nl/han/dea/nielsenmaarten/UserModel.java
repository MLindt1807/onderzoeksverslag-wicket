package nl.han.dea.nielsenmaarten;

import nl.han.dea.nielsenmaarten.services.datasourceBasedLoginService;
import nl.han.dea.nielsenmaarten.services.dto.UserDTO;

import java.io.Serializable;

public class UserModel implements Serializable {
    private datasourceBasedLoginService loginService = new datasourceBasedLoginService();
    private String username;
    private String password;
    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(){
        var userDTO = new UserDTO(username,password);
        loginService.login(userDTO);
    }
}
