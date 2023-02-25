Feature: SignIn

  @Anastasiia_Tutuieva
  Scenario: Valid user Sign in with valid credentials
    Given user is on expedia homepage "https://www.expedia.com/"
    And user clicks on Sign in
    And user clicks on Sign in button in a new window
    When user enters email "piaolian1990@mail.ru"
    And user enters password  "Anastasiia2022!!!"
    And user clicks Sign in
    Then user is logged in
@Anastasiia_Tutuieva
  Scenario: Valid user Sign in  with valid email and password
    Given user is on expedia homepage "https://www.expedia.com/"
    And user clicks on Sign in
    And user clicks on Sign in button in a new window
    When user enters email "at.dreamproperty@gmail.com"
   And user enters password  "Anastasiia2023!!!"
    And user clicks Sign in
    Then user is logged in
@Anastasiia_Tutuieva
 Scenario: Invalid user login with Anastasiia
    Given user is on expedia homepage "https://www.expedia.com/"
    And user clicks on Sign in
    And user clicks on Sign in button in a new window
    When user enters email "piaolian1990@mail.ru"
    And user enters password  "Anastasiia"
    And user clicks Sign in
    Then user is shown an error
