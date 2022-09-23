package jenkinsPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2Test {
	//1
	@Test
	public void practice2Test() {
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		System.out.println(browser);
		System.out.println(url);
	}
}
