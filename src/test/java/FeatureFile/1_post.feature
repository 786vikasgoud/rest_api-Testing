Feature: User Create API
  Scenario: Create a new user
    Given A user with following Details
      | id    | username      | firstName       | lastName      | email                                | password | phone       | userStatus |
      | 15    | Vikas goud    | shivaiahgari    | Vikasgoud     | shivaiahgarivikasgoud@gmail.com      | 112345   | 9951962196  | 0          |
    When I make a post request to create user "https://petstore.swagger.io/v2/user"
    Then The responce body status contains 200
    And The responce body contains all following detais