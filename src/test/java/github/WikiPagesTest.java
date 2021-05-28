package github;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiPagesTest {

    @Test
    void thereShouldBeSoftAssertionsPage(){

        open("https://github.com/selenide/selenide");


    }


}