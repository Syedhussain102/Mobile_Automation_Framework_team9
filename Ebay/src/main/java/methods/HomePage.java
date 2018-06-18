package methods;

import base.MobileAPI;

public class HomePage extends MobileAPI {

        public void sideBar(){
            clickByXpath("//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n");
        }

}
