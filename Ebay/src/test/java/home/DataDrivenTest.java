package home;

import methods.DataDriven;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDrivenTest extends DataDriven {
    //@Test
    public void dataDrivenTest() throws IOException, InterruptedException {
        testExcel();
    }

    @Test
    public void tinderTest() throws InterruptedException {
        tinder();
    }
}
