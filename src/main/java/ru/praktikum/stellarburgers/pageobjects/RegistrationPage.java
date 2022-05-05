package ru.praktikum.stellarburgers.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {

    // локатор для ссылки "Зарегистрироваться"
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement registerLink;

    // локатор для поля "Имя"
    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    private SelenideElement registerName;

    // локатор для поля "Email"
    @FindBy(how = How.XPATH, using = "(//input[@name='name'])[2]")
    private SelenideElement registerEmail;

    // локатор для поля "Пароль"
    @FindBy(how = How.NAME, name = "Пароль")
    private SelenideElement registerPassword;

    // локатор для кнопки [Зарегистрироваться]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement register;

    //метод, объединяющий ввод данных для регистрации пользователя
    @Step("Регистрируем нового пользователя")
    public void registerForm(String name, String email, String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
        setRegister();
    }

    @Step("Нажимаем на ссылку 'Зарегистрироваться'")
    public void registrationLink () {
        registerLink.click();
    }

    @Step("Вводим Имя")
    public void setName (String name) {
        registerName.click();
        registerName.setValue(name);
    }

    @Step("Вводим Адрес")
    public void setEmail (String email) {
        registerEmail.click();
        registerEmail.setValue(email);
    }

    @Step("Вводим Пароль")
    public void setPassword (String password) {
        registerPassword.click();
        registerPassword.setValue(password);
    }

    @Step("Нажимаем на кнопку [Зарегистрироваться]")
    public void setRegister () {
        register.click();
    }

    @Step("Проверим что на экране отображается кнопка [Выйти]")
    public SelenideElement getMessage () {
        return  $(byCssSelector(".Auth_form__3qKeq")).shouldHave(text("Некорректный пароль"));
    }

    // метод для генерации мэйла
    public static String getRandomString() {
        String RANDOM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder random = new StringBuilder();
        Random rnd = new Random();
        while (random.length() < 8) {
            int index = (int) (rnd.nextFloat() * RANDOM.length());
            random.append(RANDOM.charAt(index));
        }
        String randomStr = random.toString();
        return randomStr;

    }

    public SelenideElement getRegisterEmail() {
        return registerEmail;
    }
}
