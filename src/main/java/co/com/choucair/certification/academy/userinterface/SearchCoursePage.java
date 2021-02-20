package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona Cursos y Certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para seleccionar el curso")
            .located(By.xpath("//h4[@class='result-title']//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=1279']"));
    public static final Target NAME_COURS = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Prueba ')]"));
}
