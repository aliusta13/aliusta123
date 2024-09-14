package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id = "pass")
    public WebElement passwordKutusu;

    @FindBy(name = "login")
    public WebElement loginButonu;

    @FindBy(xpath = "(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[7]")
    public WebElement cookiesKabulButonu;

    @FindBy(className = "_9ay7")
    public WebElement basariliGirisYapilamadiUyarisi;

    @FindBy(xpath = "//*[@data-testid='open-registration-form-button']")
    public WebElement yeniKayitOlusturButonu;

    @FindBy(name = "websubmit")
    public WebElement signUpButonu;

}
