package nl.han.dea.nielsenmaarten;


import nl.han.dea.nielsenmaarten.services.datasourceBasedLoginService;
import nl.han.dea.nielsenmaarten.services.dto.UserDTO;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.resource.CssPackageResource;
import org.apache.wicket.request.resource.ResourceReference;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends WebPage {
    public HomePage() {

        UserModel userModel = new UserModel();

        Form<?> form = new Form("form");

        TextField<String> username = new TextField<String>("username", new PropertyModel<String>(userModel, "username"));
<<<<<<< HEAD
<<<<<<< HEAD
        PasswordTextField password = new PasswordTextField("password", new PropertyModel<String>(userModel, "password"));
=======
        TextField<String> password = new TextField<String>("password", new PropertyModel<String>(userModel, "password"));
>>>>>>> parent of 7ac18fb... gefixed
=======
        TextField<String> password = new TextField<String>("password", new PropertyModel<String>(userModel, "password"));
>>>>>>> parent of 7ac18fb... gefixed

        Button button = new Button("submit") {
            @Override
            public void onSubmit() {
                super.onSubmit();

				System.out.println("username: " + userModel.getUsername());
				System.out.println("password: " + userModel.getPassword());
            }
        };

        add(form);

        form.add(username);
        form.add(password);
        form.add(button);
    }
}
