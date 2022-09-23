package jenkinsPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1Test {
	//3
	@Test
	public void practice3Test() {
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		System.out.println(browser);
		System.out.println(url);
	}
}
