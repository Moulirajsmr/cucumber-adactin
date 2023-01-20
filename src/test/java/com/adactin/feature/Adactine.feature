Feature: Validate A Booking Functionality In Adactin Hotel Booking Application

Scenario: Login Page
Given User Launch The Adactin Url "https://adactinhotelapp.com/"
When user Enter The Username "Mouliraj07"In The Username Field
And user Enter The Password "MOULI@07sn" In The Password Field
Then user Click The Login button And It Navigate To Search Hotel Page


Scenario: Searh Hotel
When user Select The Location "Sydney" In the Location Dropdown
And user Select The Hotel "Hotel Hervey" In the Hotels Dropdown
And user Select The Roomtype "Deluxe" In the Roomtype Dropdown
And user Select The No Of Rooms "2" In the No Of Rooms Dropdown
And user Enter The Check In Date "22/11/2022" In The Check In Date Field
And user Enter The Check Out Date "26/11/2022" In The Check Out Date Field
And user Select The Adults Per Rooms "4" In The Adults Per Rooms Dropdown
And user Select The Childrens Per Rooms "4" In The Childrens Per Room Dropdown
Then user Click The Search button And It Navigate To Select Hotel Page


Scenario: Select Hotel
When user Click The Select In The Select Radio button
Then user Click The Continue button an It Navigate Book A Hotel Page


Scenario: Book A Hotel
When user Enter The Firstname "Mouliraj" In The Firstname Field
And user Enter The Lastname "nagarajan" In The Lastname Field
And user Enter The Billing Address "11/5-80A,Mel Vellaler street, Mecheri" In The Billing Address Field
And user Enter The Credit Card No "8635975396218634" In The Credit Card No Field
And user Select The Credit Card Type "VISA" In The Credit Card Type Dropdown
And user Select The Expriy Date Month "12" In The select Month Dropdown
And user Select The Expriy Date Year "2022" In The Select Year Dropdown
And user Enter The Cvv Number "500" In The Cvv Number Field
Then User Click The Book Now button And It Navigate To Booking Confirmation Page