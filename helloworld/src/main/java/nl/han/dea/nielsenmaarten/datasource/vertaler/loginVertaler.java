package nl.han.dea.nielsenmaarten.datasource.vertaler;

import nl.han.dea.nielsenmaarten.services.dto.UserVerbindingDTO;

public class loginVertaler {
    public loginVertaler(){

    }


    public UserVerbindingDTO resultSetToLogin(String gebruiker, String verbindingToken) {
        return new UserVerbindingDTO(gebruiker,verbindingToken);
    }
}
