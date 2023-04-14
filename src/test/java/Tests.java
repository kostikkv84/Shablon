import Pages.MainPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

//import com.codeborne.selenide.tes.TextReport;
import static Constants.Constant.BASE_URL;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class Tests extends BaseTest {

    @Test
    public void testYandex() {
        setUp("win_firefox");
        open("https://ya.ru");
        $("#text").shouldBe(Condition.visible).setValue("ЯЛта").pressEnter();
        Selenide.sleep(5000);


    }

}
