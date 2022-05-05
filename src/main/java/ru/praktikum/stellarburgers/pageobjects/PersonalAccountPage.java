package ru.praktikum.stellarburgers.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class PersonalAccountPage {

    // локатор для кнопки [Личный кабинет]
    @FindBy(how = How.XPATH, xpath = "//nav/a/p")
    private SelenideElement personalAccount;

    // локатор для кнопки [Войти в аккаунт]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement loginToAccount;

    // локатор для кнопки [Конструктор]
    @FindBy(how = How.XPATH, xpath = "//p[contains(.,'Конструктор')]")
    private SelenideElement constructor;

    // локатор для логотипа Stellar Burgers
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logo;

    @Step("Нажимаем на логотип Stellar Burgers")
    public void setLogo (String text) {
        logo.click();
        $(By.className("BurgerIngredients_ingredients__1N8v2")).shouldHave(text(text));
    }

    @Step("Переходим в личный кабинет")
    public void setPersonalAccount () {
        personalAccount.click();
    }

    @Step("Переходим в конструктор")
    public void setConstructor (String text) {
        constructor.click();
        $(By.className("BurgerIngredients_ingredients__1N8v2")).shouldHave(text(text));
    }

    @Step("Проверим что на экране отображается кнопка [Оформить заказ]")
    public SelenideElement getText (String text) {
        return  $(".button_button__33qZ0").shouldHave(text(text));
    }


}
