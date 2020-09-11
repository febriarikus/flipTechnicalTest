Feature: Homepage
  As a user
  I want to have homepage
  So that I can access feature via homepage

  Background:
    Given I already log in to flip

  Scenario: 1. Click Kirim Uang via Navbar
    Given I already in homepage
    When I click Kirim Uang via Navbar
    Then I directed to page Kirim Uang

  Scenario: 2. Click Catatan Transaksi via Navbar
    Given I already in homepage
    When I click Catatan Transaksi via Navbar
    Then I directed to page Catatan Transaksi

  Scenario: 3. Click Account Name via Navbar
    Given I already in homepage
    When I click Account Name via Navbar
    Then Dropdown menu is displayed

  Scenario: 4. Click Buat Refund via Navbar
    Given I already in homepage
    When I click Account Name via Navbar
    And I click Buat Refund via Navbar
    Then I directed to Refund Page

  Scenario: 5. Click Button Kirim Uang
    Given I already in homepage
    When I click button Kirim Uang
    Then I directed to page Kirim Uang

  Scenario: 6. Click Button Kirim Uang Ke Luar Negeri
    Given I already in homepage
    When I click button Kirim Uang Ke Luar Negeri
    Then I directed to page Kirim Uang Ke Luar Negeri

  Scenario: 7. Click Button Terima Uang when Unverified
    Given I already in homepage
    When I click button Terima Uang
    Then I directed to verification pop up

  Scenario: 8. Click Button Buat Refund
    Given I already in homepage
    When I click button Buat Refund
    Then I directed to Refund Page

  Scenario: 9. Click Button Lihat Panduan
    Given I already in homepage
    When I click button Lihat Panduan
    Then I directed to Pusat Bantuan Page

  Scenario: 10. Click Logout
    Given I already in homepage
    When I click Account Name via Navbar
    And I click Logout
    Then I directed to flip login page