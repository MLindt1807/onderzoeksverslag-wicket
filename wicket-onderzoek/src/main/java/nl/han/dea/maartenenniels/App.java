package nl.han.dea.maartenenniels;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Hello world!
 *
 */
public class App extends WebApplication
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public Class getHomePage() {
        return HelloWorld.class;
    }
}
