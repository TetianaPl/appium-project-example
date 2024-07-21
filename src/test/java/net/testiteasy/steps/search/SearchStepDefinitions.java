package net.testiteasy.steps.search;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.testiteasy.screens.search.SearchScreen;
import net.testiteasy.screens.search.SearchScreenObjectFactory;

// TODO -->
// -- This step for the Search screen should be changed and finished in courses.
// -- You need to think over the logic of using this Search screen.
public class SearchStepDefinitions {

    private final SearchScreen searchScreen = SearchScreenObjectFactory.get();

    @When("user type in search line {string}")
    public void userTypeInSearchLine(String searchInput) {
        searchScreen.enterSearchText(searchInput);
    }

    @Then("user can see a link with text {string} in the search results and click it")
    public void userCanSeeALinkWithTextInTheSearchResultsAndClickIt(String resultLink) {
        searchScreen.searchResultByText(resultLink);
    }
}
