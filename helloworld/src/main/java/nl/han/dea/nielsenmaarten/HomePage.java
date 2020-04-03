package nl.han.dea.nielsenmaarten;


import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.*;
import org.apache.wicket.model.PropertyModel;

import org.apache.wicket.markup.html.WebPage;

import javax.xml.registry.infomodel.User;


public class HomePage extends WebPage {
    public HomePage() {

        UserModel userModel = new UserModel();

        Form<?> form = new Form("form");


        TextField<String> username = new TextField<String>("username", new PropertyModel<String>(userModel, "username"));

        PasswordTextField password = new PasswordTextField("password", new PropertyModel<String>(userModel, "password"));

        Label loggedin = new Label("loggedin", "u bent ingelogd.");
        loggedin.setVisible(false);


        Button button = new Button("submit") {
            @Override
            public void onSubmit() {
                super.onSubmit();


                userModel.login();
                if(userModel.getToken() != null){
                    loggedin.setVisible(true);
                    System.out.println(userModel.getToken());
                }

            }
        };
        add(loggedin);
        add(form);

        form.add(username);
        form.add(password);
        form.add(button);
    }
}
