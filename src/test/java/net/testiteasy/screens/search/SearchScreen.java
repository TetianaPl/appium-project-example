package net.testiteasy.screens.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.testiteasy.utils.variables.OSType;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static net.testiteasy.utils.parameters.TestDataParams.testConfig;
import static com.codeborne.selenide.Condition.text;

@SuppressWarnings("unused")
// TODO -->
// -- This screen should be changed and finished in courses.
// -- You need to change the selectors to the correct ones
// -- and think over the logic of using this screen.
public class  SearchScreen {

    private final By SKIP_BUTTON = By.id("Skip");
    
    @AndroidFindBy(id = "search_src_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search...\"]")
    private SelenideElement SEARCH_TEXT_FIELD;

    @AndroidFindBy(id = "search_results_list")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search...\"]")
    private SelenideElement SEARCH_RESULTS_LIST;

    public void waitForMainContainerToAppear() {
        if (testConfig().getOSType() == OSType.IOS) {
            if ($(SKIP_BUTTON).is(Condition.visible)) {
                $(SKIP_BUTTON).click();
            }
        }
    }
    
    public void enterSearchText(String searchText) {
        SEARCH_TEXT_FIELD.sendKeys(searchText);
    }

    public void searchResultByText(String resultLink) {
        SEARCH_RESULTS_LIST.$$(".android.widget.TextView")
                .find(text(resultLink))
                .should(Condition.exist)
                .click();
    }
}