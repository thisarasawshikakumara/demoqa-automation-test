package tests.other;

import com.demoqa.pages.HomePage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class ElementTest extends BaseTest {
    @Test
    public void testNavigateToElement(){
        new HomePage().clickOnElement();
    }
}
