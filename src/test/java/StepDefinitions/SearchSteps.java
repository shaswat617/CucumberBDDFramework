package StepDefinitions;

import Implementation.Product;
import Implementation.Search;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps {
    Product product;
    Search search;

    @Given("I have a search field on Amazon")
    public void iHaveASearchFieldOnAmazon() {
        System.out.println("Step 1 : Given search field is present");
    }

    @When("I search for a product with name {string} and price {int}")
    public void iSearchForAProductWithNameAndPrice(String productName, int price) {
        System.out.println("Step 2 : I search for a product : " + productName + " and price being : " + price);
        product = new Product(productName,price);
        product.getProductList();

    }

    @Then("Product having name {string} should be displayed")
    public void productHavingNameShouldBeDisplayed(String productName) {
        System.out.println("Step 3 : Product having : " + productName + " name should be displayed");
        search = new Search();
        String name = search.displayProduct(product);

        Assert.assertEquals(product.getProductName(), name);
    }

}
