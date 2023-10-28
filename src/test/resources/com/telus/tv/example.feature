Feature: Telus TV+ Automation

  Scenario: Filter and select an animated asset
    Given I am on the TELUS TV+ website
    When I close the welcome popup
    And I click on "On Demand"
    And I scroll to the "Movies" section
    And I click on "Movies > View All"
    And I click on the "Filter" button
    And I select "Animated" from the filter options
    And I click the "Apply" button
    Then I should find an asset with a rating of 18+
    And I click on the asset to open the details page
