public class TestLogin {
	private WebDriver driver;
	@Before
	public void abrirNavegador( ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	 @Test 
	 public void testeNavegacao() { 
		  driver.get("https://panppa.github.io/Eplayers/");
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      driver.findElement(By.id("inscrevaseButton”)).click(); 
		  driver.findElement(By.id ("email ")).sendKeys("gabrielfcampos2017@gmail.com");
      driver.findElement(By.id ("senha ")).sendKeys("123Quatro56!”)
		  driver.findElement(By.id("loginButton")).click(); 
  }
}
