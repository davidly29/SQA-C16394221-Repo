# Sprint Backlog
## What is a Sprint Backlog ?
A sprint backlog consists of tasks that are identified by a team that are to be complected within a given sprint. The Sprint backlog items are composed of items that have been taken from the product backlog during the sprint planning stage. These sprint backlog items are broken down into sprints in relation to their story points (ie: how long the task is estimated to take) and their importance/necessity. In a sprint backlog it is also important to note that these user stories can be further refined at this stage as long as they do not compromise the sprint goal or the termination of the sprint.

## Sprint Backlog Tasks
- Create survey object to hold data about survey. (Story Points: 1)
- Create surveyResponse object to hold data containing the response to a survey. (Story Points: 1)
- Create a Global variable to hold all the current surveys. (Story Points: 1)
- Design and Implement a method that will be used to save the user's answers on a survey. (Story Points: 2)
- Implement a method to map a users answer to a corresponding value (1, 3 , 4 , etc). (Story Points: 2)
- Design a method that will accurately calculate the average score on a survey. (Story Points: 2)
- Design a method that will accurately calculate the standard deviation score on a survey. (Story Points: 3)
- Design a method that will accurately calculate the Min/Max score on a survey. (Story Points: 2)
- Decide and integrate an appropriate test coverage tool for the application. (Story Points: 4)
- Create a method to allow the addition of extra survey questions. (Story Points: 3)
- Create an implementation to allow the user to search for a specific survey. (Story Points: 3)
- Implement a method to allow users to retrieve all responses to a survey. (Story Points: 2)

## Process of Task Estimation
**_Task Estimation_** is the process of estimating and predicting the total effort that’s required to complete a task and get it to a deliverable state. There is four main factors that can influence the successful estimation of a task (Resource, Time, Cost, Human Resources). If we look at the sprint backlog we can see that different tasks have different level story points. For example: the creating of objects has a story point of 1 and the creation of a method to carry out a task has a story point of 2+, this is due to the fact that "boiler plate code" such as object creation should take far less time compared to the implementation of a complex method. This metric is also calculated in regard to visibility. Personally I have created thousands of object classes, however I have never created a method to calculate the standard deviation and thus more story points are allocated to the task to compensate for the unknown nature of it.

## Sprint Velocity
**_Sprint Velocity_** is the total number of story points that are completed by the end of a sprint. It is important to note that tasks that are not fully completed can not be accounted into the sprint velocity. If the sprint ends and there remains tasks that still need to be completed, these tasks will then be added to the backlog of the next sprint. Alternatively, the task may need to be re-estimated or broken down into additional stories.