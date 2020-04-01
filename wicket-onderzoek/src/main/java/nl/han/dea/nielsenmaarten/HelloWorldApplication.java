package nl.han.dea.nielsenmaarten;

import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {
    public HelloWorldApplication() {
    }
    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class getHomePage() {
        return HelloWorld.class;
    }
}