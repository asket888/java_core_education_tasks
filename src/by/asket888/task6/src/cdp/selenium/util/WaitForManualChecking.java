package cdp.selenium.util;

public class WaitForManualChecking {

    public void sleep(int mSec) {
        try {
            Thread.sleep(mSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
