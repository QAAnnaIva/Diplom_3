package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.pageobjects.LoginPage;

import static com.codeborne.selenide.Selenide.open;


public class LoginTest {

    LoginPage loginPage =
            open("https://stellarburgers.nomoreparties.site",
                    LoginPage.class);

    //вход через кнопку «Личный кабинет»
    @Test
    public void loginDuePersonalAccount() {

        loginPage.setPersonal();
        loginPage.loginForm("GPQXQDML@mail.ru","12345678");

    }

    //вход по кнопке «Войти в аккаунт» на главной
    @Test
    public void loginDueLoginToAccount() {

        loginPage.loginToAccount();
        loginPage.loginForm("GPQXQDML@mail.ru","12345678");

    }

    //вход через кнопку в форме регистрации
    @Test
    public void loginDueLinkInRegistrationForm() {
        LoginPage loginPage =
                open("https://stellarburgers.nomoreparties.site/register",
                        LoginPage.class);

        loginPage.setLoginLink();
        loginPage.loginForm("GPQXQDML@mail.ru","12345678");

    }

    //вход через кнопку в форме восстановления пароля
    @Test
    public void loginDuePasswordRestore() {
        LoginPage loginPage =
                open("https://stellarburgers.nomoreparties.site/forgot-password",
                        LoginPage.class);

        loginPage.setLoginLink();
        loginPage.loginForm("GPQXQDML@mail.ru","12345678");

    }


}
