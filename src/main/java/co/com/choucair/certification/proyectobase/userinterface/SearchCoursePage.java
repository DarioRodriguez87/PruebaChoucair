package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.*;

public class SearchCoursePage {
    public static final Target BUTTON_UC = Target.the( "Selecciona la universidad Choucair")
            .located(By.xpath("//div[@id='Universidad']//strong"));
    public static final Target INPUT_COURS = Target.the("Selecciona el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.id("//button[@class= 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(), 'Recursos Automatizacion Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//h4[contains(text(), 'Recursos Automatizacion Bancolombia')]"));
}
