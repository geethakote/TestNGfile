Feature: Gmail compose

  Scenario Outline: 
    Given open a "chrome" browser
    And launch site using "http://www.gmail.com"
    When do login using "geethakarekallu" and "geetha1984@" credentials
    Then compose is displayed
    When click on compose
    Then fields should be displayed
    When fills fildes with "<to>","<subject>","<body>" and "<attachment>"
    Then send is enabled
    When click on send
    Then "Message sent" should be displayed
    When do logout
    Then login page should be redisplayed
    When close a site

    Examples: 
      | to                   | subject | body  | attachment                         |
      | dhanu.test@gmail.com | hi      | photo | C:\\Photos\\Goa 2021\\IMG_3639.JPG |
