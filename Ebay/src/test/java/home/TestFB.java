package home;

import methods.Ebay;
import org.testng.annotations.Test;

import java.security.Signature;

public class TestFB extends Ebay {
    //@Test
    public void home() throws InterruptedException {
        Login();
    }
    //@Test
    public void testSignup() throws InterruptedException{
        signUP();
    }
    @Test
    public void swipe() throws InterruptedException {
        swipeDown();
    }
}
