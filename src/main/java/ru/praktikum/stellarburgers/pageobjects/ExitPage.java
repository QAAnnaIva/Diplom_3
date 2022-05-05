package ru.praktikum.stellarburgers.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ExitPage {

    // локатор для кнопки [Выйти]
    @FindBy(how = How.CSS, using = ".Account_button__14Yp3")
    private SelenideElement exit;


    @Step("Проверим что на экране отображается кнопка [Выйти]")
    public SelenideElement getText (String text) {
        return  $(byCssSelector(".button_button__33qZ0")).shouldHave(text(text));
    }

    @Step("Нажимаем на кнопку 'Выйти'")
    public void setExit () {
        exit.click();
    }
}
