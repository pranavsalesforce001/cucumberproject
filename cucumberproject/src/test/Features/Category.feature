@Category

Feature:Verify Category page with product

  Scenario Outline: To verify category page open with each product page
    Given user is on homepage to see "<Categories>"
    When click on category user should see "<respective>"Category
    Then user should able to see "<extension>"
    Examples:
      | Categories  | respective  | extension   |
      | computer    | computer    | computer    |
      | electronics | electronics | electronics |
      | apparel     | apparel     | apparel     |
      | digital downloads | digital downloads | digital downloads |
      | books       | books       | books       |
      | jewelry     | jewelry     | jewelry     |
      | gift cards  | gift cards  | gift cards  |

