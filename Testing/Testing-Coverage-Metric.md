# Test Coverage
## What is Code Coverage ?
This is the measurement that is used to describe what code is being ran when the test is executed. This is useful to us as it allows us to view what code our tests are testing, and from this we can make sure that we ensure that our coding standard is increased.

## Intellij Code Coverage Tool
This projects test coverage is handled by Intellij's Code Coverage Tool. This tool comes pre-installed on all intellij IDE's and allows us to quickly check our code coverage in real time. It also provides us with useful information relating to the amount of lines our tests cover, as well as the amount of cases inside methods that are accounted for.

![Coverage](coverage-per.png)

In the picture above we can see that intellij code coverage allows us to view how well we have tested our methods by providing us with a percentage of the code that has been tested upon running the test suit.

![Line Coverage](line-cover.png)

In the above we can see that intellij code coverage also allows us to view the specific lines that our code is covering. This is invaluable to use as it allows us to see if there is any cases within our code that are not specifically covered (ie: else cases within if statements).

## Steps to run code coverage

- Open the project in Intellij

- Open the test suite class (Survey_DriverTest.java)

- A the top of the method there will be a run icon, click this icon and select "run with coverage".

- The test suit will then execute and you will be able to see the code coverage for the test suit both in the code and on the right side of the screen. (Note: This will also work on individual tests)