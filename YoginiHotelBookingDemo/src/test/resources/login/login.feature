Feature: Hotel Booking Login

Scenario: Invalid UserName 
Given User is on 'login' Page
When user enters invalid UserName
Then display 'Please Enter UserName' 

Scenario: Invalid Password
Given User is on 'login' Page
When user enters invalid password
Then display 'Please Enter Password' 

Scenario: Valid Details
Given User is on 'login' Page
When user enters valid details
Then display 'HotelBooking' Page