Feature: Hotel Booking In Adactin Application

@tag1
Scenario: User Login In The Application
Given user Launch The Application
When  user Enter The Username In Username Field 
And   user Enter The Password In Password Field
Then  user Click The Login Button And It Navigates To Search Hotel 

@tag2
Scenario: User Search The Hotel As Per His Requirement
When user Select The Location From Location DropDown 
And  user Select The Hotel From Hotel DropDown 
And  user Select The Room Type From Room Type DropDown
And  user Select The Rooms From Number Of Rooms DropDown
And  user Enter The CheckIn Date In The Check In Date Field
And  user Enter The CheckOut Date In The Check Out Field
And  user Select The Adults Room In The Adults per Room DropDown
And  user Select The Children Room In The Children per Room DropDown
Then user Click On Search Button And It Will Navigate to Select Hotel 

@tag3
Scenario: User Confirming The Hotel Before Booking
When user Click on Select Option After Confirming His Requirement
Then user Click on Continue Button and It Will Navigate to Book A Hotel Page

@tag4
Scenario: User Will Enter The Payment Details To Book A Hotel
When user Enter the First Name in The First Name Field
And  user Enter The Last Name In The Last Name Field
And  user Enter The Address In The Billing Address Field
And  user Enter The Credit Card Number In The Credit Card No Field
And  user Select The Credit Card Type From Credit Card Type DropDown
And  user Select The Credit Card Expiry Month & Year
And  user Enter The CVV Number From CVV Number Field
Then user Click On Book Now Button and It Will Navigate To Booking Confirmation Page

@tag5
Scenario: User Booking Confirmation Details
Then user Click on Logout Button

