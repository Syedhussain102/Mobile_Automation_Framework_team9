package methods;

import base.MobileAPI;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

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


    public void testExcel() throws IOException, InterruptedException {
        //clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.View/android.widget.LinearLayout/android.view.View/android.widget.LinearLayout/android.widget.TextView\n");
        //ArrayList<String> searchAbleItems = dataFromExcel("/Users/zann/IdeaProjects/Mobile_Automation_Framework_team9/Ebay/src/data/Book1.xls", "Sheet1", 0);
        /*ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.view.View[1]/android.widget.RelativeLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText\n")).sendKeys("a");
        ad.sendKeyEvent(AndroidKeyCode.ENTER);
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.view.View[2]");
        clickByXpath("//android.widget.TextView[@content-desc='Browser']");

        switchView(1);*/
    }


    public void tinder() throws InterruptedException {
        clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]\n");

        //typeByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.EditText\n","9293739212");
        //clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.Button\n");
//Thread.sleep(15000);

        //clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button\n");
        Thread.sleep(30000);
        for (int a = 1; a > 0; a++) {
            Thread.sleep(2000);
            clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.ImageView\n");
            if (a == 1) {
                clickByXpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]\n");
            }
        }
    }


}
