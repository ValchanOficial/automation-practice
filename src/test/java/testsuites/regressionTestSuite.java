package testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import framework.report;
import testcase.buyProductTestCase;;

@RunWith(Suite.class)
@SuiteClasses({
	buyProductTestCase.class
})
public class regressionTestSuite {
	@BeforeClass
	public static void initTest() {
		report.create("Moodle QA Testing Site", "Suite de Regressao");
	}
	@AfterClass
	public static void endTest() {
		report.close();
	}
}