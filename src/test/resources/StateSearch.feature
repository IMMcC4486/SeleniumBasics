Feature: Search for US States

	Background: 
	Given The user is on Wikipedia
	
  Scenario Outline: User Searches for a state
    Given The user types in "<state>"
    When The user presses enter
    Then The Title of the article is "<title>"

    Examples: 
      | state  | title |
      | Florida | Florida - Wikipedia |
      | Pennsylvania | Pennsylvania - Wikipedia |
      | Alabama | Alabama - Wikipedia |
      | Wyoming | Wyoming - Wikipedia |