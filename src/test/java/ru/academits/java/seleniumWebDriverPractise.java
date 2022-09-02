package ru.academits.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWebDriverPractise {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
 //       String browser = System.getProperty("browser");
        driver.get("ya.ru");
        driver.manage().window().maximize();
    }
    @Test
    public void getCurrentUrl() {
        Assertions.assertEquals("Яндекс", driver.getTitle());
    }
    @AfterEach
    public void setDown() {
        driver.quit();
        }
    }
