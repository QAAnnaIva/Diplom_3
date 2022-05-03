package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.LoginElements;
import ru.praktikum.stellarburgers.RegistrationElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {


    RegistrationElements registrationElements =
            open("https://stellarburgers.nomoreparties.site/login",
                    RegistrationElements.class);



// успешная регистрация
    @Test
    public void successRegistration() {

// регистрируем нового пользователя
    registrationElements.registrationLink();
    registrationElements.registerForm("Анна",RegistrationElements.getRandomString() + "@mail.ru","12345678");
    String email = registrationElements.getRegisterEmail().getValue();
    System.out.println(registrationElements.getRegisterEmail().getValue());

// проверяем, что можно залогиниться с созданным аккаунтом (ЗДЕСЬ ДОЛЖНА БЫТЬ ССЫЛКА НА page object для логина)
    LoginElements loginElements = page(LoginElements.class);
    loginElements.loginForm(email,"12345678");
    }


 // ошибка для некорректного пароля
    @Test
    public void incorrectPassword() {

// регистрируем нового пользователя
   registrationElements.registrationLink();
   registrationElements.registerForm("Анна",RegistrationElements.getRandomString() + "@mail.ru","12345");
   $(byCssSelector(".Auth_form__3qKeq")).shouldHave(text("Некорректный пароль"));

    }


}
