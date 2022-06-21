#Feature: Logged In User Flow
#
  #Background: Login using Username and Password
    #Given Browser is open for login
    #When User is in home page of application
    #Then User click on the login option
    #Then User click on the login on already registered
    #And User enter username
      #| username |
      #| Shaik    |
    #Then User enter password
      #| password   |
      #| Test123456 |
    #And Click on Login
    #Then User enter OTP0
      #| otp0 |
      #|    1 |
    #Then User enter OTP1
      #| otp1 |
      #|    1 |
    #Then User enter OTP2
      #| otp2 |
      #|    1 |
    #Then User enter OTP3
      #| otp3 |
      #|    1 |
    #And Click on Submit
#
  #Scenario Outline: Dashboard Verification Page
    #Then Verify the header with "<Header Expected>"
    #Then Verify All policy Text with "<AllPolicies Expected >"
    #Then Verify the Motor Policy "<MotorPolicy Expected>"
#
    #Examples: 
      #| Header Expected | AllPolicies Expected | MotorPolicy Expected               |
      #| My Quotations   | All Policies         | Policy No. P1021-MTI-INWS-02283527 |
#
  #Scenario: Download Policy Certificate Page
    #And User clicks on 3 dots for policy
    #Then click on Download policy Certificate in English
#
  #Scenario: Download Ecard Page
    #And User clicks on 3 dots for Ecards
    #Then click on Download ecard
    #Then Click on Download Ecard PDF
#
  #Scenario Outline: Verify My Profile Page
    #When Click on My Profile
    #Then Verify Profile Text with "<Expected text>"
    #Then Click Contact Information
#
    #Examples: 
      #| Expected text        |
      #| Personal Information |
#
  #Scenario Outline: Update Mobile Number and Email Address Page
    #When User clicks on My Profile
    #Then Click on Contact Information
    #Then Click on Update mobile number
    #Then Click inside text box
    #And User enter updated Mobile Number as "<Mobile Number>"
    #Then Click on verify
    #Then User enters OTP_0
      #| otp_0 |
      #|     1 |
    #Then User enters OTP_1
      #| otp_1 |
      #|     1 |
    #Then User enters OTP_2
      #| otp_2 |
      #|     1 |
    #Then User enters OTP_3
      #| otp_3 |
      #|     1 |
    #And User clicks on submit
#
    #Examples: 
      #| Mobile Number |
      #|     510092257 |
#
  #Scenario Outline: Motor Flow for Logged in User Custom Flow TPL Credit Card Payment
    #When User clicks on Our Products dropdowns
    #Then Click on Motor
    #Then Clcik on Custom Number
    #And User enter MobileNo
      #| MobileNo  |
      #| 533862687 |
    #Then User enter EmailId
      #| EmailId                         |
      #| domala.rahul@alrajhitakaful.com |
    #Then User enter CustomNo
      #| CustomNo   |
      #| 1020370257 |
    #Then User enter Year
      #| Year |
      #| 2020 |
    #And User clicks on checkbox
    #And User clicks on Insure now
    #Then User selects on TPL
    #Then User clicks on proceed
    #Then User enters OTP_0
      #| otp_0 |
      #|     1 |
    #Then User enters OTP_1
      #| otp_1 |
      #|     1 |
    #Then User enters OTP_2
      #| otp_2 |
      #|     1 |
    #Then User enters OTP_3
      #| otp_3 |
      #|     1 |
    #And User clicks on Submit
    #And User clicks on credit card
    #And User clicks on confirm and pay
    #Then User enters cardNumber
      #| cardNumber          |
      #| 4005 5500 0000 0001 |
    #Then User enters expiryDate
      #| ExpiryDate |
      #| 05/28      |
    #Then User enters cardHolder
      #| cardHolder |
      #| Rahul      |
    #Then User enters CVV
      #| CVV |
      #| 123 |
    #And User clicks on PayNow
    #Then User clicks on Success_Pay
