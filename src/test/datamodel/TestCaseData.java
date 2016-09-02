package test.datamodel;

import org.testng.annotations.DataProvider;

import java.util.Map;

public class TestCaseData {

    @DataProvider(name = "searchData")
    public static Object[][] searchData() {
        return new Object[][]{
                {"test"}
        };
    }
}
