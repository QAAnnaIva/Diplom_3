package ru.praktikum.stellarburgers.test;

import org.junit.After;
import org.junit.Test;
import ru.praktikum.stellarburgers.pageobjects.ConstructorPage;
import static com.codeborne.selenide.Selenide.open;

public class ConstructorTest {

    ConstructorPage constructorPage =
            open("https://stellarburgers.nomoreparties.site",
                    ConstructorPage.class);

    //переход к соусам
    @Test
    public void toDressings() {
    constructorPage.setDressings();
    constructorPage.getDressings("Соус с шипами Антарианского плоскоходца");

    }

    //переход к начиникам
    @Test
    public void toFillings() {
    constructorPage.setFillings();
    constructorPage.getFillings("Биокотлета из марсианской");

    }

    //переход к булкам
    @Test
    public void toRolls() {
    //чтобы проверить переход к булкам сначала переместимся к другому меню
    constructorPage.setFillings();

    //теперь к булкам
    constructorPage.setRolls();
    constructorPage.getRolls("Флюоресцентная булка R2-D3");

    }


}
