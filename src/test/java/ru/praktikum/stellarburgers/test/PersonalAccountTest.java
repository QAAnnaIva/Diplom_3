package ru.praktikum.stellarburgers.test;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.praktikum.stellarburgers.ExitElements;
import ru.praktikum.stellarburgers.LoginElements;
import ru.praktikum.stellarburgers.PersonalAccountElements;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PersonalAccountTest {


    PersonalAccountElements personalAccount =
            open("https://stellarburgers.nomoreparties.site",
                    PersonalAccountElements.class);



  //авторизованный пользователь
    @Test
    public void authorizedUser() {
        LoginElements loginElements =
                page(LoginElements.class);

        ExitElements exitElements = page(ExitElements.class);
        personalAccount.setPersonalAccount();
        loginElements.loginForm("GPQXQDML@mail.ru","12345678");
        $(".button_button__33qZ0").shouldHave(text("Оформить заказ"));
        personalAccount.setPersonalAccount();
        exitElements.setExit();
        $(".button_button__33qZ0").shouldHave(text("Войти"));

    }

    //неавторизованный пользователь
    @Test
    public void unAuthorizedUser() {

        personalAccount.setPersonalAccount();
        $(".button_button__33qZ0").shouldHave(text("Войти"));
    }

    //переход из личного кабинета в конструктор
    @Test
    public void toConstructor() {

        personalAccount.setPersonalAccount();
        personalAccount.setConstructor();
        $(By.className("BurgerIngredients_ingredients__1N8v2")).shouldHave(text("Соберите бургер"));

    }

    //переход на логотип Stellar Burgers
    @Test
    public void toLogo() {

        personalAccount.setPersonalAccount();
        personalAccount.setLogo();
        $(By.className("BurgerIngredients_ingredients__1N8v2")).shouldHave(text("Соберите бургер"));

    }

}
