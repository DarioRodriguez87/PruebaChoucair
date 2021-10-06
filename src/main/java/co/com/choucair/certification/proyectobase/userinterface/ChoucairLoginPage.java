package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that show us the form to login")
            .located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li/a/strong"));
    public static final Target INPUT_USER= Target.the("where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD= Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON= Target.the("button to confirm login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
