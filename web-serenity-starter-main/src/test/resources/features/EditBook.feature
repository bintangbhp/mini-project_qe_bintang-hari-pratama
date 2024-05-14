Feature: Edit Book
    As a user
    I can edit book's information
    So that I can edit my list

    Scenario: Edit Book with Valid Input
        Given I am on the dashboard page
        When I click edit book page button
        And I am on the edit book page
        And I input valid title on update page
        And I input valid author on update page
        And I input valid publish year on update page
        And I click edit book button
        Then I redirect to show book page after edit book
        And I can see success message on show book page

    Scenario: Edit Book with Invalid Input
        Given I am on the dashboard page
        When I click edit book page button
        And I am on the edit book page
        And I input invalid title on update page
        And I input invalid author on update page
        And I input invalid publish year on update page
        And I click edit book button
        Then I can see error message on update page