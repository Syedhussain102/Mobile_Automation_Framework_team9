package methods;

import base.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class Ebay extends MobileAPI {
    public void Login() {
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in or Register\"]/android.widget.LinearLayout/android.widget.Button[2]\n");
        typeByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.EditText\n","Siam");
        typeByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.RelativeLayout[2]","abc123");
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Sign in\"]/android.widget.LinearLayout[1]/android.widget.Button[2]\n");
    }

    public void signUP() throws InterruptedException {

        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.View/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[1]\n");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[2]/android.view.View[2]/android.widget.EditText\n","siam");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[2]/android.view.View[5]/android.widget.EditText\n","naim");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[4]/android.widget.EditText\n","naim123gmail");
        typeByXpath("//android.webkit.WebView[@content-desc=\"Get started with eBay\"]/android.view.View[8]/android.widget.EditText\n","123abc");

        wait(5);

        clickByXpath("//android.widget.Button[@content-desc=\" Please complete the form to activate this button\"]\n");
    }


    public void swipeDown() throws InterruptedException {
        Thread.sleep(3000);
        swipeDown(ad,733.0,733.0,2157.00,1088.00);
        Thread.sleep(3000);
    }

    public void check(){
        clickByXpath("//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n");
        clickByXpath("//android.widget.LinearLayout[@content-desc=\"Featured Deals,3 items\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[3]\n");
    }

    public void scrollTo(){
        scroll_to("More");
    }



}
