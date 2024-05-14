Feature: Create Book
    As a user
    I can create new book
    So that I can add a new book to the list

    Scenario: Create Book with Valid Input
        Given I am on the dashboard page
        When I click create book page button
        And I am on the create book page
        And I input valid title on create book page
        And I input valid author on create book page
        And I input valid publish year on create book page
        And I click save book button
        Then I redirect to dashboard page
        And I can see success message on dashboard page

    Scenario: Create Book with Invalid Input
        Given I am on the dashboard page
        When I click create book page button
        And I am on the create book page
        And I input invalid title on create book page
        And I input invalid author on create book page
        And I input invalid publish year on create book page
        And I click save book button
        Then I can see error message on create book page