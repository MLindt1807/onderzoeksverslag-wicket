package nl.han.dea.nielsenmaarten.datasource.vertaler;

import nl.han.dea.nielsenmaarten.services.dto.UserVerbindingDTO;

import java.io.Serializable;

public class loginVertaler implements Serializable {
    public loginVertaler(){

    }


    public UserVerbindingDTO resultSetToLogin(String gebruiker, String verbindingToken) {
        return new UserVerbindingDTO(gebruiker,verbindingToken);
    }
}
