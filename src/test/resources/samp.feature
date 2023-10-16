Feature: To validate the login functionality of facebook appliction

Scenario: To validate login with valid username and invalid password

Given To launch the chrome browser and maximise window
When To lauch the url of the facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And TO check whether navigate to home page or not
Then To close the browser

Scenario Outline: To validate the login function for postive and negative combinations
Given user has to launch the browser and max the window
When user has to lauch the URL
And user has to pass the "<emaildatas>" email field
And user has to pass the "<passworddatas>" password field
And user has to click the login button
Then close the browser

Examples:
|emaildatas||passworddatas|
|yogeshkanna30@gmail.com||yogesh@2000|
|sivaharish49@gmail.com||125287963|
|lalithakannan@gmail.com||727he|
|mafdhankannan@gmail.com||458796|



