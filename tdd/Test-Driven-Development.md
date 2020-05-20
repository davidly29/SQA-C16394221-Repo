# Test Driven Development
## What is Test Driven Development ?
Test driven development is a form of software development process that focuses on first identifying the behaviour of a method or feature and then create a test that reflects this expected behaviour. Naturally this original test will be failing as we have not yet implemented our functionality however, this focus on firstly creating a failing test before development allows us to ensure that we are developing the correct functionality for the feature by adhering to the definition of the test. This process of taking development requirements and turning them into specific test cases encompasses the overall methodology of test driven development and its focus on short lifecycle development (TDD).

![TDD Lifecycle](tdd.png)

## Steps of Test Driven Development
- Write Test: At this stage we firstly create our test from the broken down requirements of our application.
- Test Fails: Next it is important to ensure that the test fails, as by doing so it forces the developer to think of the requirements to pass the test. It will not only aid in the proper development of the requirement but also provide details about error and unexpected behaviour to the developer.
- Write Code: Now it is time to start coding. It important to note that minimalism is key here, only write as the minimum amount of code needed to pass the test. This ensures that the requirements are met while keeping code concise and clear.
- Test Passes: Here we confirm that the test is passing and the behaviour is working as expected.
- Refactor: Finally, at this stage we can assess if there is any other unexpected behaviour that we have noticed that may need to be accounted for, then we can refactor our test to account for this and repeat the cycle.

## Test Driven Development In This Project
This project flowed the test driven development approach for the implementation of its features. Below we can see an example of where this is used and how TDD should be implemented in a project.

**Branch: calculation-feature**

68e8ef0d0888a921e957225e8442138a50d2748f - Test Definition (Here the definition of the test is created with the test failing).

1314fd72becb97a8452f3b761af9b1c6016d4a70 - Test implementation (Here the test method is coded to ensure that the test is passing).
