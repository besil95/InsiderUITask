package org.example.test;

import org.example.base.BaseTest;
import org.example.stepDefinitions.StepDefinitions;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class SDTest extends BaseTest {

    StepDefinitions stepDefinitions;

    @Before
    public void before() {
        stepDefinitions = new StepDefinitions(getWebDriver());
    }

    @Test
    public void test() {
        stepDefinitions.checkHomePage();
        stepDefinitions.more();
        stepDefinitions.careers();
        stepDefinitions.locations();
        stepDefinitions.teams();
        stepDefinitions.careerOpportunities();
        stepDefinitions.locationFilter();
        stepDefinitions.locationIstanbul();
        stepDefinitions.departmentFilter();
        stepDefinitions.departmentQA();
        stepDefinitions.qaMatch();
        stepDefinitions.applyJob();
        stepDefinitions.applyForThısJob();
        stepDefinitions.checkFormPage();
    }

    @After
    public void after() {
        tearDown();
    }
}
