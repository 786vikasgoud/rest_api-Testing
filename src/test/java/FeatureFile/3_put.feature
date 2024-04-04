Feature: User Updating the api
  Scenario: Update the user details
    Given A user with following udpated details
      | id    | username      | firstName       | lastName      | email                                | password | phone       | userStatus |
      | 15    | Vikas goud    | shivaiahgari    | Vikasgoud     | shivaiahgarivikasgoud@gmail.com      | 112345   | 9951962196  | 0          |
    When I perform the put request to the update the user ""
    Then The responce body status contains 200
    And The responce body contains all following details