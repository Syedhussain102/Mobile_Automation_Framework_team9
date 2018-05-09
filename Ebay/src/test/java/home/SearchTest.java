package home;

import base.MobileAPI;
import methods.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchTest extends MobileAPI {
    @Test
    public void testSearch1(){
        Search search = PageFactory.initElements(ad,Search.class);
        search.search2();
    }
}
