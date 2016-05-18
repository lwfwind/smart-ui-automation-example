package test.page;

import com.qa.framework.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage extends PageBase {

    @FindBy(id = "kw")
    public WebElement searchTestBox;

    public void searchFor(String text) {
        driver.get("http://www.baidu.com/");
        searchTestBox.sendKeys(text);
        searchTestBox.submit();
    }

    public void verifyResult() {
        Assert.assertTrue(getPageTitle().contains("百度搜索"));
    }

}
