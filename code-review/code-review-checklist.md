# Code Review Checklist
A code review is the process in which your code is reviewed by another person in order to verify that the code is of a high enough standard and to ensure that all the requirements have been met before merging into another branch. Some questions that should be asked when reviewing code are as follows.

- Is the code clear and understandable ?
- Dose the code adhere to the standards/guidelines ?
- Does the code cover the functionality specified ?
- Is there associated testing done ?

These questions all lead into creating a code review checklist. This is a checklist for the review that will give them a guide in order to help them determine if the code is acceptable to merge.

## Code Review Checklist Used in this Project
This had two stages to the checklist, firstly the user creating the pull request must complete this form. After this the code reviewer must asses this request and feature by using the code review checklist.

**Pull Request Form**
- Purpose: This allows the creator of the feature to explain the use/need for the feature in order to ensure that there is a requirement associated with the branch (discourages "spaghetti coding").
- Approach: This requires the user to articulate the steps that they took to solve the problem and can help assist others to understand the code at a later stage.
- Testing: This makes sure that before the code review is made, the creator of the branch has done the relevant testing needed.

**Code Review Checklist**
- Formatting: Ensure that the formatting and readability of the code adhere's to the specified practise of the organisation in order to promote consistency.
- Logic: Read through the code and ensure that there is un-needed/unused logic, this helps to promote concise coding.
- Testing: Pull the code and make sure to run all test suits. Sometimes code may pass on one computer and not on another, so it is vital that the test are ran from two devices.
- Spec: Review the specification to ensure that the code is meeting the requirements that is needed.

This was conducted throughout the development process for each branch and can be viewed in this example.
[Calculation Branch](https://github.com/davidly29/SQA-C16394221-Repo/tree/calculation-feature)
