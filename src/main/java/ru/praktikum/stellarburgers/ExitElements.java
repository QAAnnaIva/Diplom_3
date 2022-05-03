package ru.praktikum.stellarburgers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExitElements {

    // локатор для кнопки [Выйти]
    @FindBy(how = How.CSS, using = ".Account_button__14Yp3")
    private SelenideElement exit;

    public void setExit () {
        exit.click();
    }
}
