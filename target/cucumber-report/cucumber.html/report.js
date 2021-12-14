$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WomenCategoryPage.feature");
formatter.feature({
  "line": 1,
  "name": "Women Category Page Functionality",
  "description": "",
  "id": "women-category-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8835326600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should Navigate to Women Category Page Successfully",
  "description": "",
  "id": "women-category-page-functionality;user-should-navigate-to-women-category-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on women\u0027s link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should be navigated to Women\u0027s  page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInStep.userIsOnHomepage()"
});
formatter.result({
  "duration": 129475200,
  "status": "passed"
});
formatter.match({
  "location": "WomanCategorySteps.userClickOnWomenSLink()"
});
formatter.result({
  "duration": 4131724800,
  "status": "passed"
});
formatter.match({
  "location": "WomanCategorySteps.userShouldBeNavigatedToWomenSPage()"
});
formatter.result({
  "duration": 6855008000,
  "error_message": "java.lang.ClassCastException: com.sun.proxy.$Proxy22 cannot be cast to org.openqa.selenium.By\r\n\tat com.automationpractice.pages.WomenCategoryPage.verifyWomenText(WomenCategoryPage.java:36)\r\n\tat com.automationpractice.cucumber.steps.WomanCategorySteps.userShouldBeNavigatedToWomenSPage(WomanCategorySteps.java:20)\r\n\tat ✽.Then user should be navigated to Women\u0027s  page(WomenCategoryPage.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1264461800,
  "status": "passed"
});
});