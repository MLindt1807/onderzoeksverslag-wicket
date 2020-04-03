package nl.han.dea.nielsenmaarten.services.dto;

import javax.xml.registry.infomodel.User;
import java.io.Serializable;

public class UserVerbindingDTO implements Serializable {

    public String token;
    public String user;


    public UserVerbindingDTO(){}

    public UserVerbindingDTO(String user, String token){
        this.token = token;
        this.user = user;

    }

    public String getToken() {
        return token;
    }
    public String getUser() {
        return user;
    }


}
