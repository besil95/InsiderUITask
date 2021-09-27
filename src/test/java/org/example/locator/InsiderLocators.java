package org.example.locator;

import org.openqa.selenium.By;

public class InsiderLocators {

    public static final By HOME_PAGE = By.cssSelector(".home.page");
    public static final By MORE = By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='More']");
    public static final By CAREER = By.xpath("//h5[text()='Careers']");
    public static final By LOCATIONS = By.xpath("//div[@class='col-12 d-flex flex-wrap']//h3[contains(text(),'Our Locations')]");
    public static final By TEAMS = By.cssSelector(".d-flex.flex-wrap.p-0");
    public static final By CAREER_OPPORTUNITIES = By.xpath("//a[@class='btn btn-info rounded mr-0 mr-md-4 py-3' and text()='Find your dream job']");
    public static final By LOCATION_FILTER = By.id("select2-filter-by-location-container");
    public static final By HOVER_ALL_LOCATION = By.xpath("(//li[@class='select2-results__option'])[1]");
    public static final By ISTANBUL = By.xpath("(//li[@class='select2-results__option'])[4]");
    public static final By DEPARTMENT = By.id("select2-filter-by-department-container");
    public static final By HOVER_DEPARTMENTS = By.xpath("(//li[@class='select2-results__option'])[1]");
    public static final By HOVER_ANOTHER_DEPARTMENTS = By.xpath("(//li[@class='select2-results__option'])[16]");
    public static final By QUALITY_ASSURANCE = By.xpath("(//li[@class='select2-results__option'])[13]");
    public static final By QUALITY_ASSURANCE_ONE = By.xpath("(//span[(contains(.,'Quality Assurance')) and @class='position-department text-large font-weight-600 text-primary'])[1]");
    public static final By QUALITY_ASSURANCE_TWO = By.xpath("(//span[(contains(.,'Quality Assurance')) and @class='position-department text-large font-weight-600 text-primary'])[2]");
    public static final By QUALITY_ASSURANCE_THREE = By.xpath("(//span[(contains(.,'Quality Assurance')) and @class='position-department text-large font-weight-600 text-primary'])[3]");
    public static final By CHECK_LOCATION_ONE = By.xpath("(//div[(contains(.,'Istanbul, Turkey')) and @class='position-location text-large'])[1]");
    public static final By CHECK_LOCATION_TWO = By.xpath("(//div[(contains(.,'Istanbul, Turkey')) and @class='position-location text-large'])[2]");
    public static final By CHECK_LOCATION_THREE = By.xpath("(//div[(contains(.,'Istanbul, Turkey')) and @class='position-location text-large'])[3]");
    public static final By HOVER_JOB = By.xpath("(//div[@class='position-list-item-wrapper bg-light'])[3]");
    public static final By HOVER_JOB_LOCATION = By.xpath("/html/body/section[3]/div/div/div[2]/div[3]/div/div");
    public static final By APPLY_NOW = By.xpath("(//div[@class='position-list-item-wrapper bg-light']//a[text()='Apply Now'])[3]");
    public static final By MATCH_TITLE = By.xpath("//h2[(contains(text(),'Quality Assurance'))]");
    public static final By APPLY_JOB = By.cssSelector("div.postings-btn-wrapper > a.postings-btn.template-btn-submit.shamrock");
    public static final By TRUE_POSITION = By.xpath("//h3[starts-with(text(),'A Software Quality Assurance')]");
    public static final By TRUE_REQUIREMENTS = By.xpath("//h3[starts-with(text(),'We want you to join us')]");
    public static final By SUBMIT_Y_A = By.xpath("//h4[text()='Submit your application']");
    public static final By CHECK_LEVER_APP = By.partialLinkText("Jobs");

}
