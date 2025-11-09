package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class VisitingTempleHook {

    @Before
    public void setupBrowser()
    {
        System.out.println("Step 1 : Before Scenario 1");
    }

    @Before
    public void login()
    {
        System.out.println("Step 2 : Before Scenario 2");
    }

    @BeforeStep
    public void refresh()
    {
        System.out.println("Step 3 : Before each step");
    }

    @AfterStep
    public void logout()
    {
        System.out.println("Step 4 : After each step");
    }

    @After
    public void tearDown()
    {
        System.out.println("Step 5 : After each scenario");
    }



}
