$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/eclipse-workspace/JenkinsFacebook/src/test/resources/Login.feature");
formatter.feature({
  "name": "Verify the login functionality of the facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the login functionality of the facebook",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the invlaid username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_invlaid_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the passowrd",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_enter_the_passowrd()"
});
formatter.result({
  "status": "passed"
});
});