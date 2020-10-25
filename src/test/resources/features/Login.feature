Feature: Login
  As a user, I should be able to login


  @student_test
  Scenario:  login as a student
    Given I am on the login page
    When I login as "student"
    Then I should see "Books" page