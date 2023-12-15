package generalstore.pages;



import generalstore.utils.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;




public class FormSayfasi  {
    //consructor olustur-page factory elemanları saklama amaclıdır driver tanıtmak gerekiyor
    //new AppiumFieldDecorator ile daha fazla metoda ulasırız
    //obje olusturdugumuzda once consructor olusur sonra driver calısır
    //FindBy driver sız calismaz test run ile once obje sonra icindeki consructor icindeki driver calisir


    public FormSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
   public WebElement ulkeMenusu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement isimAlani;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
   public WebElement cinsiyetFemale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
 public WebElement cinsiyetMale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public WebElement letsShopButonu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    public WebElement sayfaBasligi;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public WebElement hataMesaji;



}