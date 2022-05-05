package ru.praktikum.stellarburgers.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {

    // локатор для кнопки [Войти в аккаунт]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement loginToAccount;

    // локатор для поля "Email"
    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    private SelenideElement loginEmail;

    // локатор для поля "Пароль"
    @FindBy(how = How.NAME, name = "Пароль")
    private SelenideElement loginPassword;

    // локатор для кнопки [Войти]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement login;

    // локатор для ссылки [Войти]
    @FindBy(how = How.CLASS_NAME,using = "Auth_link__1fOlj")
    private SelenideElement loginLink;

    // локатор для кнопки [Личный кабинет]
    @FindBy(how = How.XPATH,using = "//p[contains(.,'Личный Кабинет')]")
    private SelenideElement personal;

    @Step ("Логинимся через личный кабинет")
    public void  loginToAccount () {
        loginToAccount.click();
    }


    @Step ("ввести адрес")
    public void setEmail (String email) {
        loginEmail.click();
        loginEmail.setValue(email);
    }

    @Step ("ввести пароль")
    public void setPassword (String password) {
        loginPassword.click();
        loginPassword.setValue(password);
    }

    @Step ("Нажать на кнопку [Войти]")
    public void setLogin () {
        login.click();
    }

    @Step ("Нажать на ссылку 'Войти' ")
    public void setLoginLink () {
        loginLink.click();
    }

    @Step ("Войти в личный кабинет")
    public void setPersonal () {
        personal.click();
    }

    @Step ("Заполняем форму логина")
    public void loginForm(String email, String password) {
        setEmail(email);
        setPassword(password);
        setLogin();

    }

}
