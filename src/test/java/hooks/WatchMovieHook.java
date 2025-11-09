package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class WatchMovieHook {

    @Before(order=1)
    public void setupBrowser()
    {
        System.out.println("Set system properties for browser");
    }

    @Before(order = 2)
    public void setUrl()
    {
        System.out.println("Go to Netflix to watch movies");
    }

    @BeforeStep
    public void beforeStep()
    {
        System.out.println("This shouls execute before each step");
    }

    @AfterStep
    public void afterStep()
    {
        System.out.println("This should execute after each step");
    }

    @After(order = 1)
    public void logout()
    {
        System.out.println("Logout from Netflix after watching movie");
    }

    @After(order = 2)
    public void tearDown()
    {
        System.out.println("Quit the browser");
    }
}
