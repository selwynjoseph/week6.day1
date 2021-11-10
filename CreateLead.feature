Feature: CreateLead functionality

#Background:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/'


Scenario: CreateLead with mandatory information
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on login button
Then Title should match view login 'Leaftaps - TestLeaf Automation Platform'
When Click on crmsfa link
Then Title should match view home 'My Home | opentaps CRM'
When Click on leads link
And Click on CreateLead link
And Enter company name as 'testleaf'
And Enter first name as 'lumber'
And Enter last name as 'jack'
And Click on CreateLead button
Then Title should match view lead 'View Lead | opentaps CRM'
