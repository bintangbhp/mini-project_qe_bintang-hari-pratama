Feature: Delete Book
    As a user
    I can delete a book
    So that I can remove book from my list

    Scenario: Delete a Book
        Given I am on the dashboard page
        When I click delete book page button
        And I am on the delete book page
        And I click delete book button
        Then I redirect to dashboard page
        And I can see success message on dashboard page   