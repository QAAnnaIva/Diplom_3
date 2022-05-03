package ru.praktikum.stellarburgers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalAccountElements {

    // локатор для кнопки [Личный кабинет]
    @FindBy(how = How.XPATH, xpath = "//nav/a/p")
    private SelenideElement personalAccount;

    public void setPersonalAccount () {
        personalAccount.click();
    }

    // локатор для кнопки [Войти в аккаунт]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement loginToAccount;

    public void setLoginToAccount () {
        loginToAccount.click();
    }

    // локатор для кнопки [Конструктор]
    @FindBy(how = How.XPATH, xpath = "//p[contains(.,'Конструктор')]")
    private SelenideElement constructor;

    public void setConstructor () {
        constructor.click();
    }

    // локатор для логотипа Stellar Burgers
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logo;

    public void setLogo () {
        logo.click();
    }





}
