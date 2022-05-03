package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.praktikum.stellarburgers.ConstructorElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ConstructorTest {

    ConstructorElements constructorElements =
            open("https://stellarburgers.nomoreparties.site",
                    ConstructorElements.class);

    //переход к соусам
    @Test
    public void toDressings() {
    constructorElements.setDressings();

    $(By.xpath("//div[@id='root']/div/main/section/div[2]/ul[2]/a[4]/p")).shouldHave(text("Соус с шипами Антарианского плоскоходца"));

    }

    //переход к начиникам
    @Test
    public void toFillings() {
    constructorElements.setFillings();

    $(By.xpath("//div[@id='root']/div/main/section/div[2]/ul[3]/a[3]/p")).shouldHave(text("Биокотлета из марсианской"));

    }

    //переход к булкам
    @Test
    public void toRolls() {
    //чтобы проверить переход к булкам сначала переместимся к другому меню
    constructorElements.setFillings();
    //теперь к булкам
    constructorElements.setRolls();

    $(By.xpath("//div[@id='root']/div/main/section/div[2]/ul/a")).shouldHave(text("Флюоресцентная булка R2-D3"));

    }



}
