import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Hooks {
    public static WebDriver driver;
    public String projectKey="********projectKey******************";
    public String testRunId = "**********testRunId******************";
    public String resultKey;
    public String newStatus = "1";// means Passed
    public String failStatus = "5";//means Failed
    public String newComments ="Updated through BDD Cucumber Automation";


    @Before


    @After
    public void quit(Scenario scenario) throws IOException {
        String[] s= scenario.getName().split("_");
        String run_result_tc_id= s[0].replaceAll("TC","");
        System.out.println("run_result_tc_id: "+run_result_tc_id);
        if (scenario.isFailed()) {
            QaTouchAPIClient.addTestRunStatus(testRunId,projectKey,run_result_tc_id, failStatus, newComments);
        }
        else  {
            System.out.println("Success");
            QaTouchAPIClient.addTestRunStatus(testRunId,projectKey,run_result_tc_id, newStatus, newComments);
        }
    }

}
