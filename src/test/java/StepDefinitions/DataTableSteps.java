package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableSteps {

    @Given("User has valid login credentials of JioMart")
    public void userHasValidLoginCredentialsOfJiomart() {
        System.out.println("User has valid credentials of Jiomart");
    }


    @And("User has an active Jio number")
    public void userHasAnActiveJioNumber() {
        System.out.println("User has an active jio number");
    }

    @When("User adds fruits to the cart")
    public void userAddsFruitsToTheCart(DataTable dataTable) {
        List<List<String>> fruitList = dataTable.asLists(String.class);
        int i=1;
        for (List<String> fruit : fruitList)
        {
            System.out.println("fruit Names: "+" "+fruit.get(0));
//            System.out.println("Fruit Number: "+i+" "+eachfruit);
//            i++;
//            System.out.println(eachfruit);
        }
    }

    @And("User provides the quantity of each item")
    public void userProvidesTheQuantityOfEachItem() {
        System.out.println("User provides the quantity of each item");
    }

    @Then("User is redirected to payment page")
    public void userIsRedirectedToPaymentPage() {
        System.out.println("User is redirected to payment page");
    }

    @When("User adds milk and bakery products to the cart")
    public void userAddsMilkAndBakeryProductsToTheCart(DataTable dataTable) {
        List<List<String>> milkList = dataTable.asLists(String.class);
//        int i =1;
        for(List<String> eachMilkProduct: milkList){
            System.out.println("Product Names: "+" "+eachMilkProduct.get(0));
//            System.out.println("Milk product Number: "+i+" "+eachMilkProduct);
//            i++;
//            System.out.println(eachMilkProduct);
        }
    }

    @When("User adds electronic products to the cart")
    public void userAddsElectronicProductsToTheCart(DataTable dataTable) {
        List<List<String>> elctronicsList = dataTable.asLists(String.class);
//        int i =1;
        for(List<String> eachElectronic: elctronicsList){
            System.out.println("Electronic Names: "+" "+eachElectronic.get(0));
//            System.out.println("Electronic Number: "+i+" "+eachElectronic);
//            i++;
//            System.out.println(eachElectronic);
        }
    }
}

