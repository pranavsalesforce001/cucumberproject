package nopcommerce;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


public class MyStepdefs extends Utils {

    SoftAssert softAssert = new SoftAssert();

    @Given("^user is on homepage to see \"([^\"]*)\"$")
    public void user_is_on_homepage_to_see(String arg1)  {
    }
    @When("^click on category user should see \"([^\"]*)\"Category$")
    public void click_on_category_user_should_see_Category(String arg1)  {
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/computers\"]"));
        softAssert.assertEquals("Computers", getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/computers\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }

    @Then("^user should able to see \"([^\"]*)\"$")
    public void user_should_able_to_see(String arg1)  {
    }

    @Given("^user is on homepage to see electronics$")
    public void user_is_on_homepage_to_see_electronics(){
    }

    @When("^click on category user should see electronicsCategory$")
    public void click_on_category_user_should_see_electronicsCategory(){
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/electronics\"]"));
        softAssert.assertEquals("Electronics",getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/electronics\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }
    @Then("^user should able to see electronics$")
    public void user_should_able_to_see_electronics()  {
    }

    @Given("^user is on homepage to see apparel$")
    public void user_is_on_homepage_to_see_apparel()  {
    }

    @When("^click on category user should see apparelCategory$")
    public void click_on_category_user_should_see_apparelCategory() {
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/apparel\"]"));
        softAssert.assertEquals("Apparel",getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/apparel\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }
    @Then("^user should able to see apparel$")
    public void user_should_able_to_see_apparel() {
    }

    @Given("^user is on homepage to see digital downloads$")
    public void user_is_on_homepage_to_see_digital_downloads(){
    }
    @When("^click on category user should see digital downloadsCategory$")
    public void click_on_category_user_should_see_digital_downloadsCategory(){
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/digital-downloads\"]"));
        softAssert.assertEquals("Digital downloads",getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/digital-downloads\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }
    @Then("^user should able to see digital downloads$")
    public void user_should_able_to_see_digital_downloads()  {
    }

    @Given("^user is on homepage to see books$")
    public void user_is_on_homepage_to_see_books()  {
    }
    @When("^click on category user should see booksCategory$")
    public void click_on_category_user_should_see_booksCategory()  {
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/books\"]"));
        softAssert.assertEquals("Books",getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/books\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }
    @Then("^user should able to see books$")
    public void user_should_able_to_see_books()  {
    }

    @Given("^user is on homepage to see jewelry$")
    public void user_is_on_homepage_to_see_jewelry() {
    }
    @When("^click on category user should see jewelryCategory$")
    public void click_on_category_user_should_see_jewelryCategory() {
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/jewelry\"]"));
        softAssert.assertEquals("Jewelry",getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/jewelry\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }
    @Then("^user should able to see jewelry$")
    public void user_should_able_to_see_jewelry() {

    }

    @Given("^user is on homepage to see gift cards$")
    public void user_is_on_homepage_to_see_gift_cards() {
    }
    @When("^click on category user should see gift cardsCategory$")
    public void click_on_category_user_should_see_gift_cardsCategory(){
        clickElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/gift-cards\"]"));
        softAssert.assertEquals("Gift Cards",getTextFromElement(By.xpath("//ul[@class=\"top-menu\"]/li/a[@href=\"/gift-cards\"]")));
        softAssert.assertAll();
        System.out.println("Test Soft assert Pass");
        driver.getCurrentUrl();
    }
    @Then("^user should able to see gift cards$")
    public void user_should_able_to_see_gift_cards(){
    }


}






