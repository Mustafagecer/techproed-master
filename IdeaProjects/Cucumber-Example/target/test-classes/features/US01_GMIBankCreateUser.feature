Feature: As admin, I should be able to create a new user account with different profiles

  @Admin
  Scenario:
    Given user logs in as an admin
    And navigates to ‘Create or Edit user page’
    And enter user information
    Then verify the new user creation is successful
    Then tring
    And close the page

