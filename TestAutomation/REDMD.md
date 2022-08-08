
I have created a test automation framework using Selenium WebDriver 3.14.0 and java with PageObjectModel, automated the below assignment.
		-Run the test using the 'testng.xml' file.
		-Verify the test results from 'test-output/index.html'
		

Question 1. Login Page -  The below test cases are ( Priority from 1 to 7 ) automated in LoginPageTest java class.
 
   1) Verifying the text with successful login
   2) Verifying the text as Invalid Email
   3) Verifying text as enter correct Email
   4) Verifying the login page is present
   5) Verify the text as enter correct password.
   6) Verify the text as enter correct user name and pass word.
   7) Verify the text as user not found 
     
 Question 2: The following page has multiple radio buttons. Create a script to select randomly either Yes or No for each of the questions in the page.
 
 Test Script are created under QuestionanariepageTest java class.
 
 Question 3: Given the following page, select the 5th element from the given list:
 
 Xpaths to selecting the value:
 
 If we prefer the select the list item based on the value then below xpath.
 
 //span[@role='listbox']//li[@data-item-value=''GENERIC_EVENT_D1_APPROVAL_BY_ADVISORY_COMITTEE']
 
  Other wise, below is the xpath if we prefer index
 
  (//span[@role='listbox']/ul/li)[5]
 
 Test script are also created by selecting the value from list box in QuestionanariepageTest class.
 
 
 
 
 
