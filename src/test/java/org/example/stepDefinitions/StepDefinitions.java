package org.example.stepDefinitions;

import org.example.base.BaseMethods;
import org.openqa.selenium.WebDriver;

import static org.example.locator.InsiderLocators.*;

public class StepDefinitions extends BaseMethods {
    public StepDefinitions(WebDriver driver) {
        super(driver);
    }

    public StepDefinitions checkHomePage() {
        checkVisible(HOME_PAGE);
        return this;
    }

    public StepDefinitions more() {
        clickElement(MORE);
        return this;
    }

    public StepDefinitions careers() {
        clickElement(CAREER);
        return this;
    }

    public StepDefinitions locations() {
        checkVisible(LOCATIONS);
        return this;
    }

    public StepDefinitions teams() {
        checkVisible(TEAMS);
        return this;
    }

    public StepDefinitions careerOpportunities() {
        clickElement(CAREER_OPPORTUNITIES);
        return this;
    }

    public StepDefinitions locationFilter() {
        clickElement(LOCATION_FILTER);
        return this;
    }

    public StepDefinitions locationIstanbul() {
        hoverElement(HOVER_ALL_LOCATION);
        clickElement(ISTANBUL);
        return this;
    }

    public StepDefinitions departmentFilter() {
        clickElement(DEPARTMENT);
        return this;
    }

    public StepDefinitions departmentQA() {
        hoverElement(HOVER_DEPARTMENTS);
        hoverElement(HOVER_ANOTHER_DEPARTMENTS);
        clickElement(QUALITY_ASSURANCE);
        return this;
    }

    public StepDefinitions qaMatch() {
        checkVisible(QUALITY_ASSURANCE_ONE);
        checkVisible(CHECK_LOCATION_ONE);
        checkVisible(CHECK_LOCATION_TWO);
        checkVisible(CHECK_LOCATION_THREE);
        checkVisible(QUALITY_ASSURANCE_TWO);
        checkVisible(QUALITY_ASSURANCE_THREE);
        return this;
    }

    public StepDefinitions applyJob() {
        hoverElement(HOVER_JOB);
        hoverElement(APPLY_NOW);    // ilgili element'i listView içine atip yapmakti amacim fakat hoverElementte
                                    // bir problem ile karşılaştım aşamadım buradaki locator'da tanimsal
                                    // ya da perform(); kaynakli bir hata aliyorum.
        clickElement(APPLY_NOW);
        switchWindow();
        checkVisible(MATCH_TITLE);
        checkVisible(APPLY_JOB);
        return this;
    }

    public StepDefinitions applyForThısJob() {
        checkVisible(TRUE_POSITION);
        checkVisible(TRUE_REQUIREMENTS);
        clickElement(APPLY_JOB);
        return this;
    }

    public StepDefinitions checkFormPage() {
        checkVisible(SUBMIT_Y_A);
        checkVisible(CHECK_LEVER_APP);
        return this;
    }
}
