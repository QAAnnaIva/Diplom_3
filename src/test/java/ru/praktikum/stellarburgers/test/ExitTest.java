package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.ExitElements;
import ru.praktikum.stellarburgers.LoginElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.*;

public class ExitTest {


    ExitElements exitElements =
            open("https://stellarburgers.nomoreparties.site/login",
                    ExitElements.class);


    @Test
    public void exit() {
//сначала нужно залогиниться
        LoginElements loginElements =
                page(LoginElements.class);

        loginElements.loginForm("GPQXQDML@mail.ru","12345678");
        loginElements.setPersonal();
//затем выйти
        exitElements.setExit();
        $(byCssSelector(".button_button__33qZ0")).shouldHave(text("Войти"));

    }

}
