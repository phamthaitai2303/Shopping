package TC_Shopping;

import Action.ActionShopping;
import Objects.User;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class TC_Shopping {
    WebDriver driver = null;
    private String url = "http://103.95.199.151/mobilevn/";
    private String username = "123@gmail.com";
    private String password = "abcdef";
    User user = null;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println(driver.getTitle());
        user = new User();
        user.setUsername(username);
        user.setPassword(password);
    }

    @Test
    public void TC_Manage_Login_01() {
     //   try {
            // Call method click_Homepage_Login.
            ActionShopping.click_Homepage_Login(driver);
            // Wait 0.2 second to load Login pop-up.
           // Thread.sleep(200);
       // } catch (InterruptedException e) {
       //     e.printStackTrace();
        //}
        // Check these controls such as Username, Password fields
        // and Loin button are displayed.
        ActionShopping.checkDisplayedControls(driver);
    }

    @Test
    public void TC_Manage_Login_02() {
        // Call method check empty data.
        ActionShopping.checkEmptyData(driver, "Email hoặc Số điện thoại không được để trống", "Mật khẩu không được để trống");
    }
}
