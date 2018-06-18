package methods;

import base.MobileAPI;
import io.appium.java_client.android.AndroidKeyCode;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DataDriven extends MobileAPI {

    public static ArrayList<String> dataFromExcel(String path, String sheetName, int columnNo) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet s = wb.getSheet(sheetName);
        Iterator<Row> rowIT = s.iterator();
        ArrayList<String> list = new ArrayList<>();
        while (rowIT.hasNext()) {
            list.add(rowIT.next().getCell(columnNo).getStringCellValue());
        }
        return list;
    }


    public void testExcel() throws IOException {
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.LinearLayout/android.widget.TextView\n");
        ArrayList<String> searchAbleItems = dataFromExcel("/Users/zann/IdeaProjects/Mobile_Automation_Framework_team9/Ebay/src/data/Book1.xls","Sheet1",0);
        for (int i = 0; i < searchAbleItems.size(); i++) {
            ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[1]/android.widget.RelativeLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")).sendKeys(searchAbleItems.get(i));
            ad.sendKeyEvent(AndroidKeyCode.ENTER);
            clearField(ad,"//android.widget.TextView[@content-desc=\"Search\"]\n");        }
    }
    //git


}
