package com.quinbay.cucumber;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CucumberHooks {
  @Before
  public void testBefore()
  {
    System.out.println("This is a demo of before hook");
  }
  @After
  public void testAfter()
  {
    System.out.println("This is a demo of after hook");
  }
}