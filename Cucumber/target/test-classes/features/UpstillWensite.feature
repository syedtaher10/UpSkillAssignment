Feature: Upskill website automation - Assignment

@test
Scenario: Verify Sign Up functionality and perform send message
Given Open "http://elearningm1.upskills.in/index.php" and click on SignUp button
When Fill up the registration form for all mandatory fields
Then Submit the Details
And Verify message "Your personal settings have been registered."
When Click on Next button
Then Verify you landed on Homepage and click your username field
And Choose profile from dropdown
When Click on Messages
Then Click on compose message
And Enter the details shown on the page
Then Click on Send Message button