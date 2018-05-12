package syed;

import base.MobileAPI;

public class method1 extends MobileAPI {
    public void clicking(){
        clickByXpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
        clickByXpath("//XCUIElementTypeButton[@name=\"Gray\"]");
    }


}
