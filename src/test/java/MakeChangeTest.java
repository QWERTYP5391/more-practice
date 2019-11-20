import org.junit.Test;

public class MakeChangeTest {

    @Test
    public void makeChange() {
        String purchaseInfo = "15.94;16.00";
        String makeChange = MakeChange.makeChange(purchaseInfo);
    }
}