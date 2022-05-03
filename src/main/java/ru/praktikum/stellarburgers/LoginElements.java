package ru.praktikum.stellarburgers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginElements {

    // локатор для кнопки [Войти в аккаунт]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement loginToAccount;

    public void loginToAccount () {
        loginToAccount.click();
    }


    // локатор для поля "Email"
    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    private SelenideElement loginEmail;

    public void setEmail (String email) {
        loginEmail.click();
        loginEmail.setValue(email);
    }


    // локатор для поля "Пароль"
    @FindBy(how = How.NAME, name = "Пароль")
    private SelenideElement loginPassword;

    public void setPassword (String password) {
        loginPassword.click();
        loginPassword.setValue(password);
    }

    // локатор для кнопки [Войти]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement login;

    public void setLogin () {
        login.click();
    }

    // локатор для ссылки [Войти]
    @FindBy(how = How.CLASS_NAME,using = "Auth_link__1fOlj")
    private SelenideElement loginLink;

    public void setLoginLink () {
        loginLink.click();
    }

    // локатор для кнопки [Личный кабинет]
    @FindBy(how = How.XPATH,using = "//p[contains(.,'Личный Кабинет')]")
    private SelenideElement personal;

    public void setPersonal () {
        personal.click();
    }


    public void loginForm(String email, String password) {
        setEmail(email);
        setPassword(password);
        setLogin();

    }





}
