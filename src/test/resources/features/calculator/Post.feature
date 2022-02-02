@Post
Feature: User should be able to perform operations on Todo api

  Scenario: Retrieve pending todo tasks
    When retrieve all posts
    Then post service api call should be successful
    And posts should be retrieved

    #Below scenario illustrates how to implement @DataTableType annotation
  Scenario: User should be able to add a post
    When user adds a post
      | id  | userId | title      | body      |
      | 101 | 1      | Post-title | Post-body |
    Then user add post api call is successful