package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.pageobjects.ExitPage;
import ru.praktikum.stellarburgers.pageobjects.LoginPage;

import static com.codeborne.selenide.Selenide.*;

public class ExitTest {


    ExitPage exitPage =
            open("https://stellarburgers.nomoreparties.site/login",
                    ExitPage.class);


    @Test
    public void exit() {
//сначала нужно залогиниться
        LoginPage loginPage =
                page(LoginPage.class);

        loginPage.loginForm("GPQXQDML@mail.ru","12345678");
        loginPage.setPersonal();
//затем выйти и увидеть что на экране отображается кнопка "Войти"
        exitPage.setExit();
        exitPage.getText("Войти");

    }

}
