Feature:Hotel Booking In Adactin Application

Scenario Outline:Login page 
Given user Lanuch the Application
When user Enter The "<username>" in UserName Field
When user  Enter The "<password>" is Password Field
Then click on the Login Button And It Navigates To The Search  Hotel Page

Examples:
|username|password|
|asf|234|
|jkuy|987|
|GajendiranElumalai|CX499Y|

Scenario:Search Hotel Page
When user Select The Location
And user Select The Hotels
And user Select The Room Type
And user Select The Number of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user click On the Serach Button And It Navigates To The Book Hotel Page

Scenario:Select Hotel Page
When user Click On The Select Button
Then user Click On The Continue Button And It Navigate To The Book Hotel Page

Scenario:Book A Hotel Page
When user Enter The First Name
And user Select The Last Name 
And user Select The Billing Address
And user Select The Credit Card Number
And user Select The Credit Card type
And user Select The Expiry Date Month
And user Select The CCV Number
Then user Click On The Book Now Button And It Navigate To The Booking Confirmation Page

Scenario:My Itinerary page
Then user Click On The My Itinerary Button And It Navigate To The Booking Itinerary Page

Scenario:Booked Itinerary Page
Then user Click On The Logout Button

