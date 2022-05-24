 Feature: cross bowser
 Scenario Outline: open a browser for given version  
 Given open "<bn>" browser
 When launch "<url>" site
 Then title should be contains "<title>"
 Then that site should be secured
 When close site
   Examples: 
   |bn     |url                    |title |
   |chrome |http://www.google.co.in|Google|
   |firefox|http://www.gmail.com   |Gmail |
   |edge   |http://www.github.com  |Github|