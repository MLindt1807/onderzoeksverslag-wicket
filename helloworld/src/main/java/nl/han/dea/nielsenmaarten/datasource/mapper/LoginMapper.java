package nl.han.dea.nielsenmaarten.datasource.mapper;

import nl.han.dea.nielsenmaarten.datasource.dao.LoginDAO;
import nl.han.dea.nielsenmaarten.services.dto.UserDTO;
import nl.han.dea.nielsenmaarten.services.dto.UserVerbindingDTO;

import javax.inject.Inject;

public class LoginMapper {
    LoginDAO loginDAO;

    public LoginMapper() {
    }

    @Inject
    public void setLoginDAO(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    public UserVerbindingDTO login(UserDTO user) {
        return loginDAO.login(user.getUser(), user.getPassword());
    }
}
