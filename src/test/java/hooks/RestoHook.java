package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class RestoHook {

    @Before(order = 1)
    public void setUpBrowser()
    {
        System.out.println("M1 : Set up browser");
    }

    @Before(order = 2)
    public void setUpUrl()
    {
        System.out.println("M2 : URL setup");
    }

    @After(order = 1)
    public void logout()
    {
        System.out.println("M3 : Logout from app");
    }

    @After(order = 2)
    public void closeBrowser()
    {
        System.out.println("M4 : Quit browser");
    }
}
