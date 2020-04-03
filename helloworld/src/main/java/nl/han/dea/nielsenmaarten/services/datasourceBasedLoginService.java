package nl.han.dea.nielsenmaarten.services;



import nl.han.dea.nielsenmaarten.datasource.mapper.LoginMapper;
import nl.han.dea.nielsenmaarten.services.dto.UserDTO;
import nl.han.dea.nielsenmaarten.services.dto.UserVerbindingDTO;

import javax.inject.Inject;
import java.io.Serializable;

public class datasourceBasedLoginService implements Serializable {
    LoginMapper loginMapper;

    public datasourceBasedLoginService() {
    }

    @Inject
    public void setLoginMapper(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public UserVerbindingDTO login(UserDTO user) {
        return loginMapper.login(user);
    }
}
