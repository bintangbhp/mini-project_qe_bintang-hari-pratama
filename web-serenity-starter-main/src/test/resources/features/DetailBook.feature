Feature: Detail Book
    As a user
    I can go to show book page
    So that I can see the detail information

    Scenario: See the Book's Detail
        Given I am on the dashboard page
        When I click detail book page button
        Then I am on the show book page
        And I can see the book's detail