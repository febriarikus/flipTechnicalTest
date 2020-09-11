Feature: Login Page
  As a user
  I want to have login page
  So that I can log on to flip system

  Scenario: 1. Open Login Page
    Given I have flip login url
    When I access login url
    Then I directed to flip login page

  Scenario: 2. Open Tutorial Page
    Given I already in login page
    When I click Tutorial
    Then I directed to flip Tutorial page

  Scenario: 3. Open Cara Kerja Page
    Given I already in login page
    When I click Cara Kerja
    Then I directed to flip Cara Kerja page

  Scenario: 4. Open FAQ Page
    Given I already in login page
    When I click FAQ
    Then I directed to flip FAQ page

  Scenario: 5. Click Lupa Password
    Given I already in login page
    When I click Lupa Password
    Then I directed to Lupa Password Page

  Scenario: 6. Click di sini
    Given I already in login page
    When I click di sini
    Then I directed Registration Page

  Scenario: 7. Click Daftar
    Given I already in login page
    When I click Daftar
    Then I directed Registration Page

  Scenario: 8. Login Success
    Given I already in login page
    When I input valid email and valid password
    And I click Masuk
    Then I directed to Flip Homepage

  Scenario Outline: 9. Login Failed
    Given I already in login page
    When I input "<email>" and "<password>"
    And I click Masuk
    Then I failed login Flip Homepage
    Examples:
    |email                  |password   |
    |testingflipdn@gmail.com|123456     |
    |testing@gmail.com      |dnflip0910 |

  Scenario Outline: 10. Access url without login
    Given I already in login page
    When I access "<url>" without login
    Then I directed to flip login page
    Examples:
    |url                              |
    |https://flip.id/kirim            |
    |https://flip.id/globe            |
    |https://flip.id/refund           |
    |https://flip.id/catatan-transaksi|
