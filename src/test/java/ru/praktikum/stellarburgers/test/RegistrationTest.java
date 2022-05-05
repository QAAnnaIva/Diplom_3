package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.pageobjects.LoginPage;
import ru.praktikum.stellarburgers.pageobjects.RegistrationPage;

import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {


    RegistrationPage registrationPage =
            open("https://stellarburgers.nomoreparties.site/login",
                    RegistrationPage.class);


// успешная регистрация
    @Test
    public void successRegistration() {

// регистрируем нового пользователя
    registrationPage.registrationLink();
    registrationPage.registerForm("Анна", RegistrationPage.getRandomString() + "@mail.ru","12345678");
    String email = registrationPage.getRegisterEmail().getValue();
    System.out.println(registrationPage.getRegisterEmail().getValue());

// проверяем, что можно залогиниться с созданным аккаунтом (ЗДЕСЬ ДОЛЖНА БЫТЬ ССЫЛКА НА page object для логина)
    LoginPage loginPage = page(LoginPage.class);
    loginPage.loginForm(email,"12345678");
    }


 // ошибка для некорректного пароля
    @Test
    public void incorrectPassword() {

// регистрируем нового пользователя
   registrationPage.registrationLink();
   registrationPage.registerForm("Анна", RegistrationPage.getRandomString() + "@mail.ru","12345");
   registrationPage.getMessage();

    }


}
