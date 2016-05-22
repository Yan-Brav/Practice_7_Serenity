package serenityTest.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import serenityTest.steps.serenity.CustomerSteps;

public class Dictionary {
    @Steps
    CustomerSteps customerSteps;
    @Given("the customer is on the main page SkillsUp site")
    public void givenTheCustomerIsOnTheMainPageSkillsup(){
        customerSteps.customerIsOnTheMainPageSkillsup();
    }
    @When("the customer is on the our team page SkillsUp site")
    public void whenTheCustomerJumpOnOurTeampage(){
        customerSteps.customerJumpOnOurTeamPage();
    }
    @Then("he should see the name '$name'")
    public void thenShouldSeeTheCertainCoachName(String name){
        customerSteps.shouldSeeCoachName(name);
    }

}
