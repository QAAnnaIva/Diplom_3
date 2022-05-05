package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import ru.praktikum.stellarburgers.pageobjects.ExitPage;
import ru.praktikum.stellarburgers.pageobjects.LoginPage;
import ru.praktikum.stellarburgers.pageobjects.PersonalAccountPage;
import static com.codeborne.selenide.Selenide.*;

public class PersonalAccountTest {


    PersonalAccountPage personalAccount =
            open("https://stellarburgers.nomoreparties.site",
                    PersonalAccountPage.class);

    ExitPage exitPage = page(ExitPage.class);
    LoginPage loginPage = page(LoginPage.class);

  //авторизованный пользователь
    @Test
    public void authorizedUser() {

        personalAccount.setPersonalAccount();
        loginPage.loginForm("GPQXQDML@mail.ru","12345678");
        personalAccount.getText("Оформить заказ");
        personalAccount.setPersonalAccount();
        exitPage.setExit();
        exitPage.getText("Войти");

    }

    //неавторизованный пользователь
    @Test
    public void unAuthorizedUser() {

        personalAccount.setPersonalAccount();
        exitPage.getText("Войти");
    }

    //переход из личного кабинета в конструктор
    @Test
    public void toConstructor() {

        personalAccount.setPersonalAccount();
        personalAccount.setConstructor("Соберите бургер");

    }

    //переход на логотип Stellar Burgers
    @Test
    public void toLogo() {

        personalAccount.setPersonalAccount();
        personalAccount.setLogo("Соберите бургер");

    }

}
