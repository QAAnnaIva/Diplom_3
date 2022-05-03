package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.LoginElements;

import static com.codeborne.selenide.Selenide.open;


public class LoginTest {

    LoginElements loginElements =
            open("https://stellarburgers.nomoreparties.site",
                    LoginElements.class);

    //вход через кнопку «Личный кабинет»
    @Test
    public void loginDuePersonalAccount() {

        loginElements.setPersonal();
        loginElements.loginForm("GPQXQDML@mail.ru","12345678");

    }

    //вход по кнопке «Войти в аккаунт» на главной
    @Test
    public void loginDueLoginToAccount() {

        loginElements.loginToAccount();
        loginElements.loginForm("GPQXQDML@mail.ru","12345678");

    }

    //вход через кнопку в форме регистрации
    @Test
    public void loginDueLinkInRegistrationForm() {
        LoginElements loginElements =
                open("https://stellarburgers.nomoreparties.site/register",
                        LoginElements.class);

        loginElements.setLoginLink();
        loginElements.loginForm("GPQXQDML@mail.ru","12345678");

    }

    //вход через кнопку в форме восстановления пароля
    @Test
    public void loginDuePasswordRestore() {
        LoginElements loginElements =
                open("https://stellarburgers.nomoreparties.site/forgot-password",
                        LoginElements.class);

        loginElements.setLoginLink();
        loginElements.loginForm("GPQXQDML@mail.ru","12345678");

    }


}
