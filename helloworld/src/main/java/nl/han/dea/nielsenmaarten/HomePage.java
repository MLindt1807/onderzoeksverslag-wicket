package nl.han.dea.nielsenmaarten;

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
        // TODO Add your page's components here
        UserModel userModel = new UserModel();

        Form<?> form = new Form("form");

        TextField<String> username = new TextField<String>("username", new PropertyModel<String>(userModel, "username"));
        TextField<String> password = new TextField<String>("password", new PropertyModel<String>(userModel, "password"));

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
