package jenkinsPractice;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice3Test {
	//2
@Test
public void practice1Test() {
	String browser = System.getProperty("b");
	String url = System.getProperty("u");
	System.out.println(browser);
	System.out.println(url);
}
}
