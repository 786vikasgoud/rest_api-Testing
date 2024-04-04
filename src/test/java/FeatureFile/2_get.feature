Feature:User getting API
  Scenario: Get the user details
    Given Set the pathparam
    When Make a get request for to get user "https://petstore.swagger.io/v2/user/"
    Then The responce body contains the status code 200
    And reaponse body contains all the following details
