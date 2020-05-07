package nl.han.dea.nielsenmaarten;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication
{
	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}
}
