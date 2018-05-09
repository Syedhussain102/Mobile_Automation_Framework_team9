package base;



public class mainClass extends MobileAPI {

    public void learnMore() {
        //ad.findElementByAccessibilityId("com.walmart.android:id/search_src_text").sendKeys("xbox");
        //clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.view.View/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText");
   clickByXpath("//android.widget.TextView[@content-desc=\"All button\"]");
    }

}
