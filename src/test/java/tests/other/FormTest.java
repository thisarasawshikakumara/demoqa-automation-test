package tests.other;

import com.demoqa.pages.HomePage;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class FormTest extends BaseTest {
    @Test
    public void testNavigateToForms(){
        new HomePage().clickOnFormsButton();
    }
}
