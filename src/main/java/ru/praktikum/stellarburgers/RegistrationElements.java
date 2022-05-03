package ru.praktikum.stellarburgers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.Random;


public class RegistrationElements {

    // локатор для ссылки "Зарегистрироваться"
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement registerLink;

    public void registrationLink () {
        registerLink.click();
    }

    // локатор для поля "Имя"
    @FindBy(how = How.XPATH, using = "//input[@name='name']")
    private SelenideElement registerName;

    public void setName (String name) {
        registerName.click();
        registerName.setValue(name);
    }


    // локатор для поля "Email"
    @FindBy(how = How.XPATH, using = "(//input[@name='name'])[2]")
    private SelenideElement registerEmail;

    public void setEmail (String email) {
        registerEmail.click();
        registerEmail.setValue(email);
    }


    // локатор для поля "Пароль"
    @FindBy(how = How.NAME, name = "Пароль")
    private SelenideElement registerPassword;

    public void setPassword (String password) {
        registerPassword.click();
        registerPassword.setValue(password);
    }


    // локатор для кнопки [Зарегистрироваться]
    @FindBy(how = How.CSS,using = ".button_button__33qZ0")
    private SelenideElement register;

    public void setRegister () {
        register.click();
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

    //метод, объединяющий ввод данных для регистрации пользователя
    public void registerForm(String name, String email, String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
        setRegister();

    }
}
