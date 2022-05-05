package ru.praktikum.stellarburgers.pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ConstructorPage {

    // локатор для меню "Булки"
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Булки')]")
    private SelenideElement rolls;

    // локатор для меню "Соусы"
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Соусы')]")
    private SelenideElement dressings;

    // локатор для меню "Начинки"
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Начинки')]")
    private SelenideElement fillings;

    @Step("Переходим к меню 'Булки'")
    public void setRolls () {
        rolls.click();
    }

    @Step("Переходим к меню 'Соусы'")
    public void setDressings () {
        dressings.click();
    }

    @Step("Переходим к меню 'Начинки'")
    public void setFillings (){
        fillings.click();
    }

    @Step("Проверим что на экране отображается ожидаемый вид булки")
    public SelenideElement getRolls (String text) {
        return $(By.xpath("//p[contains(.,'Флюоресцентная булка R2-D3')]")).shouldHave(text(text));
    }

    @Step("Проверим что на экране отображается ожидаемый вид начинки")
    public SelenideElement getFillings (String text) {
        return $(By.xpath("//p[contains(.,'Биокотлета из марсианской Магнолии')]")).shouldHave(text(text));
    }

    @Step("Проверим что на экране отображается ожидаемый вид соуса")
    public SelenideElement getDressings (String text) {
        return  $(By.xpath("//p[contains(.,'Соус с шипами Антарианского плоскоходца')]")).shouldHave(text(text));
    }

}
