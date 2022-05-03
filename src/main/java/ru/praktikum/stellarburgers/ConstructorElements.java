package ru.praktikum.stellarburgers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConstructorElements {

    // локатор для меню "Булки"
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Булки')]")
    private SelenideElement rolls;

    public void setRolls () {
        rolls.click();
    }


    // локатор для меню "Соусы"
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Соусы')]")
    private SelenideElement dressings;

    public void setDressings () {
        dressings.click();
    }

    // локатор для меню "Начинки"
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Начинки')]")
    private SelenideElement fillings;

    public void setFillings () {
        fillings.click();
    }
}
